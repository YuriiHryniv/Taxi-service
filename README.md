# 🚖 Taxi-service 🚖
### 📜 Project description:📜
___
      A simple application that supports CRUD operations.
      This application was written in accordance to SOLID design principles and REST rules. The project is built upon 3 layers of architecure: layer of controllers,
      business logic layer and layer of database. Different accesses are possible(Roles: USER and ADMIN).
###  📌 Features:📌
___
* create a driver/car/manufacturer;
* update a driver/car/manufacrurer;
* add new drivers to the car;
* delete(soft) a driver/car/manufacturer;
* registrate like a driver;
* authenticate like a driver;
* authenticate like an admin;
* find a driver by email;
* display list of all cars;
* display list of all manufacturers;
* display list of all drivers;
* display list of all cars for the current driver;
### 💻 Technologies used:💻
___
* JDK 11
* Maven 4.0.0
* MySql 8.0.22
### 🎇Heroku:🎇
___
[Click here to access!](https://taxi-service-crud-project.herokuapp.com/login)
### 🚀Access rights:🚀
* register a new driver and authenticate as User;
* authenticate as Admin (*login - admin, password - admin*);
___
### ⚙️Instructions:⚙️
___
In order to use this application properly you should install Tomcat 9 version, MySQL.
1) Clone this project from GitHub.
2) Create your own schema and tables using init_db.sql file.
3) Go to src/main/java/taxi/util/ConnectionUtil.java and provide URL, username, password, JDBC driver.
```
public class ConnectionUtil {
    private static final String URL = "YOUR_URL";
    private static final String USERNAME = "YOUR_USERNAME";
    private static final String PASSWORD = "YOUR_PASSWORD";
    private static final String JDBC_DRIVER = "DRIVER";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
```
5) Configure Tomcat server:   
   * Press edit configurations.
   * Find Tomcat and do not forget to choose local.
   * Choose 'Taxi-service:war exploded'.
   * Press apply and okay.
6) Use it.

Schema:
   ![whole schema_1](UML_diagram.jpg)
   ![whole schema_1](db_diagram.png)
