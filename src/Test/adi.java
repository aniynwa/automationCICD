package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adi {
	public static void main (String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("iphone15");
		WebElement SearchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchButton.click();
		driver.get("https://www.amazon.in/Apple-iPhone-14-128GB-Blue/dp/B0BDK62PDX/ref=sr_1_1_sspa?crid=2O69V1STQZLB&dib=eyJ2IjoiMSJ9.1NoNK6PN_Gus8ubEhSDCYjm3d9uc5jK2D0tR72ZXM-SHScq_zK6q5yYuiNmjnPavaYLjA-nMWOmNyaCH_goRxUUHe2-4hUZ8GnXxB_wxTqABL83mpLd3SEZTpGAF1I-OcgVm6rlZhYXyC8G5UHbcd0MbgRXQLUQyXi_yLSCPe3YrXZgHcatWxDjYL58nOYEqydRsT_G8_n-6gmTRl46Uk2BMrbJMp0n1KQqdSB3pxG-aFRxYLEeIYORcacWLM9_Ima3WCMYBRNKKm1L0Rt9ota2_L-JuqF82I5b_wXYH9No.Bn7jTv1F63zuWanVYZNmXPbKIJ1At5fNcxT2esIjkmg&dib_tag=se&keywords=iphone+15+pro&qid=1718175032&s=apparel&sprefix=iphone15%2Cfashion%2C312&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 addtocart.click();
		
	
	
	
	}

}
