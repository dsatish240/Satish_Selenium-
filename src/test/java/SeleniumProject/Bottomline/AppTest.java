package SeleniumProject.Bottomline;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AppTest {
	
	static WebDriver driver;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name");
		String browsername=	sc.next();
		driver=Browserinitiative.browsersetup(browsername);
		
		
		/*
		 * driver.findElement(By.className("theme-btn")).click();
		 * driver.findElement(By.id("user_name")).sendKeys("Durga Satish");
		 * driver.findElement(By.id("user_email")).sendKeys("dsatish240@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("9886529299");
		 * driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		 * driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		 */
		
		 driver.findElement(By.className("register-btn")).click();
		 driver.findElement(By.id("email")).sendKeys("dsatish240@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("9886529299");
		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		 
	
	}
}
