package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement e=driver.findElement(By.xpath(".//*[@id='month']"));
		
		Select d=new Select(e);
		d.selectByVisibleText("Feb");
		
		WebElement t=driver.findElement(By.xpath(".//*[@id='day']"));
		Select y=new Select(t);
		y.selectByValue("9");
		
		Select k=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		 k.selectByValue("2010");
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath(".//*[@id='u_0_h']")).click();
		
		
		//driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
	//	driver.findElement(By.xpath(".//*[@id='u_0_2']/i[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	
		//driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[12]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("naiks842@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("azmeera1993");
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		
	}

}
