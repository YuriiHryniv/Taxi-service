# 🚖 Taxi-service 🚖
### 📜 Project description:📜
___
_A simple application that supports CRUD operations. This application was written in accordance to SOLID design principles and REST rules. The project is built upon 3 layers of architecure: layer of controllers, business logic layer and layer of database. Different accesses are possible(Roles: USER and ADMIN)._
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
### 🚀Access rights:🚀
___
* register a new driver and authenticate as User;
* authenticate as Admin (*login - admin, password - admin*);
### 💻 Technologies used:💻
___
* JDK 11
* Maven 4.0.0
* MySql 8.0.22
* Tomcat 9.0.69
* Dependency Injection
* Java Servlet
* JSP
### 🎇Heroku:🎇
___
[Click here to access!](https://taxi-service-crud-project.herokuapp.com/login)
### ⚙️Instructions:⚙️
___
In order to use this application properly you should install Tomcat 9 version, MySQL.
1) Clone this project from GitHub.
2) Create your own schema and tables using init_db.sql file.
3) Go [here](https://github.com/YuriiHryniv/Taxi-service/blob/main/src/main/java/taxi/util/ConnectionUtil.java#L12) to provide your own URL, username, password and JDBC driver.

5) Configure Tomcat server:   
   * Press edit configurations.
   * Find Tomcat and do not forget to choose local.
   * Choose 'Taxi-service:war exploded'.
   * Press apply and okay.
6) Use it.

### 🏠Schema:🏠

   ![whole schema_1](UML_diagram.jpg)
