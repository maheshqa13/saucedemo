package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Saucedemoapp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mahes\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
			Thread.sleep(1000);
	

			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']")).click();
			Thread.sleep(1000);
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			Thread.sleep(1000);
			
			dropdown.click();
			Select s=new Select(dropdown);
			s.selectByValue("za");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(1000);
			
			
					
					
			
			
	}	
}
