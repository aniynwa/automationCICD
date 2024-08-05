package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions{

	public static void main(String[]args) {
		//System.setProperty("webdriver.chrome.driver", null)
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String ParentId=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailid=driver.findElement(By.cssSelector(".im-para.red")).split
				("")[1].trim().split(" ")[0];
		
		
	}}
