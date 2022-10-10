package utillities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowser {
	

	static WebDriver driver;
	public static WebDriver browsersetup(String browsername)
	{

		switch (browsername)
		{
		 
		  case "chrome": {
		  
		  System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		  driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://www.rahulshettyacademy.com/");
		  break;
		  }
		 
		case "edge":

		{
			System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rahulshettyacademy.com/");
			break;
		}

		}
		return driver;

	}
}

