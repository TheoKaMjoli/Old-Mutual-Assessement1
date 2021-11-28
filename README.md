# Old-Mutual-Assessement1
### We will be building an Automated Test Framework with test scripts using the Tools below.

### I would like to give a short summary of the Technologies/Framework Used: 
* Java, 
* TestNG Framework, 
* Selenium,
* Maven

  * We used Eclipse Intergrated Development Environment to create our automation test using Java language. Eclipse Intergrated Development Enviroonment Stable release: 4.21.0 / 15 September 2021

  * Java Object Oriented Programming Language is widely used for mostly back-end development projects.
  * Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. 
  * TestNG Framework is supported by a variety of tools and plugins such as Eclipse and Maven.
  
##### Reference: https://www.geeksforgeeks.org/introduction-apache-maven-build-automation-tool-java-projects/
##### Reference: https://testng.org/doc/
##### Reference: Title: OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808 Edition: 1 Author(s): Jeanne Boyarsky, Scott Selikoff


*************************************************************************************************
Reference: https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html
### Cloning the project from github:
* Download the project using HTTPS: https://github.com/TheoKaMjoli/Old-Mutual-Assessement1.git
* Open CMD if using windows 10 enter: ``git clone`` https://github.com/TheoKaMjoli/Old-Mutual-Assessement1.git
* Once the download is completed. The folder of the project can be confirmed using ``cmd: dir`` which will list the folders in that specfic directory.
* To enter the folder of the project ``cd Old-Mutual-Assessement1``

*************************************************************************************************
## The Base Class
* The purpose of the base class is to setup our WebDriver as well as store the page Url that we will be creating a test script for.
* The test case class/classes will extend the Base Class to have access to the Url as well as the methods within the Base Class to avoid duplication.
* The getHomeUrl will be used to getThe web page and maximize the window.

```java
private String baseUrl = "https://www.oldmutual.co.za/personal/solutions/bank-and-borrow/"; 
	public static WebDriver driver;
 ```




*************************************************************************************************
## Design Pattern Used: 
### Page Object Model
* The advantage of the model is that it reduces code duplication and improves test maintenance.

#### Implimenting POM














*************************************************************************************************
