package Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenPractice {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("aniac77@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Bittu@#7709");
		driver.findElement(By.id("login")).click();
		List<WebElement>products=driver.findElements(By.cssSelector(".w-10"));
		
		
	}
	}


