package TestNG;

import org.testng.annotations.Test;
import utillities.CrossBrowser;
import utillities.TestDataProvider;
import org.testng.annotations.BeforeClass;

import java.util.Scanner;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class login {
	
	     TestDataProvider obj1 = new TestDataProvider();
	     String [][]data = obj1.TestData();
	     
	     
  	
    WebDriver driver;
  
    
    @Test(priority = 1)
    public void validdata() {
  	   	  
  	     driver.findElement(By.className("register-btn")).click();
  		 driver.findElement(By.id("email")).sendKeys(data[0][0]);
  		 driver.findElement(By.id("password")).sendKeys(data[0][1]);
  		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
  		 
  		 driver.navigate().back();
  		 
  		 System.out.println("valid test data checked");
    
    }
    
    @Test(priority = 3)
    public void invalid() {
    	  
    	  
 	     driver.findElement(By.className("register-btn")).click();
 		 driver.findElement(By.id("email")).sendKeys(data[1][0]);
 		 driver.findElement(By.id("password")).sendKeys(data[1][1]);
 		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
 		 
 		 System.out.println("invalid test data checked");
   
   }
    
    @Test(priority = 2)
    public void VerifyHomePageTitle() {

    	String ExpectedTitle = "Rahul Shetty Academy";

    	String ActualTitle = driver.getTitle();

    	try {

    		org.testng.Assert.assertEquals(ActualTitle, ExpectedTitle);

    		System.out.println("test case passed");

    	} catch (Exception e) {

    		System.out.println("test case failed");

    	}

    }

    @BeforeClass
    public void beforeClass() {
    	
    	CrossBrowser browser = new CrossBrowser();
    
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name");
		String browsername=	sc.next();
		driver=browser.browsersetup(browsername);
  	  
    }

    @AfterClass
    public void afterMethod() {
  	  
  	  driver.close();
  	 
    }
}
