package utillities;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Excel {

	static {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./Book2.xlsx");

		XSSFWorkbook wb1 = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb1.getSheetAt(0);

		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();

		String username=sheet1.getRow(1).getCell(1).getStringCellValue();
		String password=sheet1.getRow(1).getCell(2).getStringCellValue();



		System.out.println("Data from Excel is " + data0);

		
	
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(data0);


		System.out.println(username);
		System.out.println(password);
		



		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type ='submit']")).click();


	}
}