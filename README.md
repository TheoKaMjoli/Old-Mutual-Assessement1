# Old-Mutual-Assessement1
### We will be building an Automated Test Framework with test scripts using the Tools below.

### I would like to give a short summary of the Technologies/Framework Used/API: 
* Java, 
* TestNG Framework, 
* Selenium,
* Maven
* Selenium WebDriver 
* Docker Container 

  * We used Eclipse Intergrated Development Environment to create our automation test using Java language. Eclipse Intergrated Development Enviroonment Stable release: 4.21.0 /     15 September 2021

  * Java Object Oriented Programming Language is widely used for mostly back-end development projects.
  * Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. 
  * TestNG Framework is supported by a variety of tools and plugins such as Eclipse and Maven.
  * WebDriver/WebDriverManager
  * Docker
  
##### Reference: https://www.geeksforgeeks.org/introduction-apache-maven-build-automation-tool-java-projects/
##### Reference: https://testng.org/doc/
##### Reference: Title: OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808 Edition: 1 Author(s): Jeanne Boyarsky, Scott Selikoff
##### Reference: https://github.com/bonigarcia/webdrivermanager
##### refernce: https://github.com/bonigarcia/webdrivermanager

*************************************************************************************************
Reference: https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html
### Cloning the project from github:
* Download the project using HTTPS: https://github.com/TheoKaMjoli/Old-Mutual-Assessement1.git
* Open CMD if using windows 10 enter: ``git clone`` https://github.com/TheoKaMjoli/Old-Mutual-Assessement1.git
* Once the download is completed. The folder of the project can be confirmed using ``cmd: dir`` which will list the folders in that specfic directory.
* To enter the folder of the project ``cd Old-Mutual-Assessement1``

*************************************************************************************************

## Source Code

### The Base Class
* The purpose of the base class is to setup our WebDriver as well as store the page Url that we will be creating a test script for.
* The test case class/classes will extend the Base Class to have access to the Url as well as the methods within the Base Class to avoid duplication.

	* The ``baseUrl`` will be kept ``private`` and used within the ``getHomeUrl``.
	* Classes extending the ``BaseClass`` will have access to public attributes and methods within the class.
```java
private String baseUrl = "https://www.oldmutual.co.za/personal/solutions/bank-and-borrow/"; 
public static WebDriver driver;
 ```
	* The getHomeUrl will be used to getThe web page and maximize the window.
```java
public void getHomeUrl() {
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	driver.manage().window().maximize(); 
}
```

		* ``@BeforeClass``, this annotation will allow the method to be the first to be executed before any ``@Test`` annoted method.
		* The purpose is to setup our driver 
```java
	@BeforeClass 
	public void setup() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
	}	
```

	* The method below will be the last to get executed. the purpose is to quit the browser or close once th test script completes execution. The annnotation is used to signal that the 
```java 
	@AfterClass 
	public void closeBrowser() {
		
		driver.quit();
		
	}
```

*************************************************************************************************
## Design Pattern Used: 
### Page Object Model
* The advantage of the model is that it reduces code duplication and improves test maintenance.

#### Home Class

* The purpose of this class is to return the expected title of the page to be validated with the actual title of the page within the test case class: ``TestC_WebsiteTest_001``
```java

package com.oldmutual.pageObject;
public class Home {
	// getting the title of Old Mutual Finance Web site
	public String getTitle() { return "Bank and Borrow Solutions | Old Mutual"; }
}

```
#### OmFinanceWebsite Class

	* The objective is to creating the driver reference.
	* Create a constructor that accepts one parameter which is a WebDriver class, inside this constuctor we initialize web elements which are defined in page objects using 	``PageFactory.initElements(localDriver, this)`` 
```java
	package com.oldmutual.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmFinanceWebsite {
	

	WebDriver homePageDriver;
	//Constructor with one parameter, takes in the driver object
	public OmFinanceWebsite (WebDriver localDriver ){
		
		homePageDriver = localDriver; //instantiating homeDriver
		PageFactory.initElements(localDriver, this); //initialize web elements which are defined in Page Objects.
		
	}
	
	//page elements (Personal loan = learn more button)
	@FindBy(className="om-button-text")
	WebElement loanBtn;
	
	//getting the title of the page
	public String getTitle() {
		
		return homePageDriver.getTitle();
		
	}
	
	public void clickButton() {
		
		 loanBtn.click();
		
	}
	
	public void scrollDown() {
		
		//To reach the loan button, scroll down
		JavascriptExecutor js = (JavascriptExecutor) homePageDriver;
		js.executeScript("window.scrollBy(0,850)", "");
	}
	
}
```

#### Implimenting POM














*************************************************************************************************
