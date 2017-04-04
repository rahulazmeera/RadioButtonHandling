package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.uk.webuy.com");
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[4]/div[4]/a[2]/div/span")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div[3]/div[2]/table/tbody/tr/td[2]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/div/select")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[3]/form/table/tbody/tr[1]/td[1]/div/select/option[3]")).click();
		
		//WebElement r= driver.findElement(By.cssSelector(".buybasket"));
		//Select d=new Select(r);
	    // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// d.getOptions();
		 //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 //driver.findElement(By.linkText("2")).click();
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// d.selectByValue("2");
		  //driver.findElement(By.linkText("3")).click();

	}

}
