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
			Thread.sleep(3000);
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			
			// Locked_user_login
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='user-name']")).clear();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			Thread.sleep(3000);

			// Problem user login
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Thread.sleep(3000);
			
			//performance_glitch_user login
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(500);
			
//			driver.findElement(By.xpath("//input[@id='login-button']")).click();
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath("//input[@id='login-button']")).click();
//			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("//input[@id='login-button']")).click();
//			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("//input[@id='login-button']")).click();
//			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Thread.sleep(3000);
			

		
			//standard_user login	
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
			Thread.sleep(3000);
	
			//add-to_cart
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			Thread.sleep(3000);
			
			//remove_from_cart
			driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']")).click();
			Thread.sleep(3000);
			
			//sort_by_dropdown
			WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			Thread.sleep(3000);
			
			dropdown.click();
			Select s=new Select(dropdown);
			s.selectByValue("za");
			Thread.sleep(3000);

			//add-to_cart
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
			Thread.sleep(3000);

			
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(3000);
			
			//Checkout
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			Thread.sleep(3000);
			
			//Cancel
			driver.findElement(By.xpath("//button[@id='cancel']  ")).click();
			Thread.sleep(3000);
			
			//again_checkout
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			Thread.sleep(3000);
			
			//enter_your_information
			driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Mahesh");
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kumbhar");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("416416");
			Thread.sleep(3000);
			
			//continue
			driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action'] ")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@id='finish']")).click();
			Thread.sleep(3000);
			
			//Home
			driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
			Thread.sleep(3000);
			
			//Logout
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Thread.sleep(3000);

	}	
}
