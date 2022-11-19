package taxi.controller.authentication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.lib.Injector;
import taxi.model.Driver;
import taxi.service.DriverService;

public class RegisterDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/authentication/register.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        getDriverFromController(req, driverService);
        resp.sendRedirect(req.getContextPath() + "/login");
    }

    public static boolean getDriverFromController(
            HttpServletRequest req, DriverService driverService) {
        String name = req.getParameter("name");
        String licenseNumber = req.getParameter("license_number");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Driver driver = new Driver(name, licenseNumber, username, password);
        driverService.create(driver);
        return true;
    }
}
