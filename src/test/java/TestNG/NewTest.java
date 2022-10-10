package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;

	@Test
	public void TestConfig() throws Exception
	{
		// to access property file
		File src= new File("./congiguration/config.property");
		FileInputStream fis = new FileInputStream(src);
		
		//to read the property file create an object of properties class
		Properties pro= new Properties();
		
		//to load property file
		pro.load(fis);
		
		// to fetch the key value from property file
		String str= pro.getProperty("edgedriver");
		System.out.println(str);
		String url= pro.getProperty("url");

		System.setProperty("webdriver.chrome.driver",str);			
		WebDriver driver = new EdgeDriver();
		driver.get(url);


		driver.findElement(By.className("register-btn")).click();
	
		
		driver.findElement(By.id("email")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(pro.getProperty("password"));
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();

	}

}

