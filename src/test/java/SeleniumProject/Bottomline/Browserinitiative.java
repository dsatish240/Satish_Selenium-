package SeleniumProject.Bottomline;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserinitiative {



	static WebDriver driver;
	static WebDriver browsersetup(String browsername)
	{

		switch (browsername)
		{
		/* 
		 * case "chrome": {
		 * 
		 * System.setProperty(
		 * "webdriver.chrome.driver","E:\\selenium JARs_4.5\\browser\\chromedriver.exe"
		 * ); driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.mycontactform.com/samples.php"); break; }
		 */
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


