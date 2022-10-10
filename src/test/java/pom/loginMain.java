package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginMain {

	static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");


		login lg = new login(driver);

		lg.name("dsatish240@gmail.com");
		lg.password("9886529299");
		lg.ln();


	}
}
