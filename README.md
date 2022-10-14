# Taxi-Service

Taxi-Service is service for drivers who working in taxi. Here drivers can register his own account and add information about manufacturer in those he is working, cars he is driving, etc.

## Heroku link:

Project deployed on heroku - [link]( https://glacial-sands-16673.herokuapp.com/).

## Project structure:
```bash
my-taxi-service
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───taxi
│   │   │       ├───controller
│   │   │       │   │   GetMyCurrentCarsController.java
│   │   │       │   │   IndexController.java
│   │   │       │   │   LoginController.java
│   │   │       │   │   LogoutController.java
│   │   │       │   │
│   │   │       │   ├───car
│   │   │       │   │       AddCarController.java
│   │   │       │   │       AddDriverToCarController.java
│   │   │       │   │       DeleteCarController.java
│   │   │       │   │       GetAllCarsController.java
│   │   │       │   │
│   │   │       │   ├───driver
│   │   │       │   │       AddDriverController.java
│   │   │       │   │       DeleteDriverController.java
│   │   │       │   │       GetAllDriversController.java
│   │   │       │   │
│   │   │       │   └───manufacturer
│   │   │       │           AddManufacturerController.java
│   │   │       │           DeleteManufacturerController.java
│   │   │       │           GetAllManufacturersController.java
│   │   │       │
│   │   │       ├───dao
│   │   │       │       CarDao.java
│   │   │       │       CarDaoImpl.java
│   │   │       │       DriverDao.java
│   │   │       │       DriverDaoImpl.java
│   │   │       │       GenericDao.java
│   │   │       │       ManufacturerDao.java
│   │   │       │       ManufacturerDaoImpl.java
│   │   │       │
│   │   │       ├───exception
│   │   │       │       AuthenticationException.java
│   │   │       │       DataProcessingException.java
│   │   │       │
│   │   │       ├───filter
│   │   │       │       AuthenticationFilter.java
│   │   │       │
│   │   │       ├───lib
│   │   │       │       Dao.java
│   │   │       │       Inject.java
│   │   │       │       Injector.java
│   │   │       │       Service.java
│   │   │       │
│   │   │       ├───model
│   │   │       │       Car.java
│   │   │       │       Driver.java
│   │   │       │       Manufacturer.java
│   │   │       │
│   │   │       ├───service
│   │   │       │       AuthenticateService.java
│   │   │       │       AuthenticateServiceImpl.java
│   │   │       │       CarService.java
│   │   │       │       CarServiceImpl.java
│   │   │       │       DriverService.java
│   │   │       │       DriverServiceImpl.java
│   │   │       │       GenericService.java
│   │   │       │       ManufacturerService.java
│   │   │       │       ManufacturerServiceImpl.java
│   │   │       │
│   │   │       └───util
│   │   │               ConnectionUtil.java
│   │   │
│   │   ├───resources
│   │   │       init_db.sql
│   │   │
│   │   └───webapp
│   │       │   web.xml
│   │       │
│   │       └───WEB-INF
│   │           └───views
│   │               │   header.jsp
│   │               │   index.jsp
│   │               │   login.jsp
│   │               │
│   │               ├───cars
│   │               │   │   add.jsp
│   │               │   │   all.jsp
│   │               │   │
│   │               │   └───drivers
│   │               │           add.jsp
│   │               │
│   │               ├───css
│   │               │       table_dark.css
│   │               │
│   │               ├───drivers
│   │               │       add.jsp
│   │               │       all.jsp
│   │               │
│   │               └───manufacturers
│   │                       add.jsp
│   │                       all.jsp
│   │
│   └───test
│       └───java
│
│   .gitignore
│   checkstyle.xml
│   pom.xml
│   README.md
```
## Technologies:
* Application server: Apache Tomcat
* Database: MySql
* Java Servlet, JSP, JSTL, JDBC API.

## Instructions to run the project:
To start this project local you need execute command
```bash
$ java -jar target/dependency/webapp-runner.jar target/*.war
```
