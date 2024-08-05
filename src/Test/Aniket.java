package Test;

import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


////button[contains (text(),'PROCEED TO CHECKOUT')]
public class Aniket {
public static void main(String[] args) throws InterruptedException {

//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
WebDriver driver=new ChromeDriver();
//img[@alt='Cart']
String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
driver.get("https://rahulshettyacademy.com/seleniumPractise/");
Thread.sleep(3000);
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
driver.findElement(By.xpath("//button[contains (text(),'PROCEED TO CHECKOUT')]")).click();
driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
addItems(driver,itemsNeeded);
}
public static  void addItems(WebDriver driver,String[] itemsNeeded)
{
int j=0;
List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
for(int i=0;i<products.size();i++)
{//Brocolli - 1 Kg
String[] name=products.get(i).getText().split("-");
String formattedName=name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
List itemsNeededList = Arrays.asList(itemsNeeded);
if(itemsNeededList.contains(formattedName))
{
j++;
driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
if(j==itemsNeeded.length)

{

break;

}

}

}

}



}

