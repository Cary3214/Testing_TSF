package task;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GRIP {
public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

     driver.get("https://www.thesparksfoundationsingapore.org/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@class='col-md-6 navbar-brand']")).click();
     
     if(true) {
    	 System.out.println("Page is reloaded if we click on Header");
       }
     
     driver.findElement(By.xpath("//a[@class='flex-active']")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("About Us")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Vision, Mission and Values")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Guiding Principles")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Advisors and Patrons")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Executive Team")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Policies and Code")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Programs")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("LINKS")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Join Us")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Why Join Us")).click();
     Thread.sleep(2000);
     
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,120)");
     Thread.sleep(2000);
     if(true) {
    	 System.out.println("Scroll action is working accordingly");
     }
     
     driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Shubham");
     Thread.sleep(2000);
     if(true) {
    	 System.out.println("Successfully Name enter");
     }
     driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
     Thread.sleep(2000);
     if(true) {
    	 System.out.println("Successfully E-mail enter");
     }
     WebElement sparks= driver.findElement(By.xpath("//select[@class='form-control']"));
     sparks.click();
  
    waits.until(ExpectedConditions.visibilityOf(sparks));
		Select s = new Select(sparks);
		s.selectByVisibleText("Volunteer"); //select single
	if(true) {
		System.out.println("DropDown selected");
	}
	driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(2000);	
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='toTopHover']")).click();
    Thread.sleep(2000);
     if(true) {
    	 System.out.println("Hover button working properly");
     }
     driver.findElement(By.xpath("//i[@class='fa fa-linkedin']")).click();
     Thread.sleep(2000);
     if(true) {
    	 System.out.println("Redirect to LinkedIn if we click on logo");
     }
     driver.close();
     
   }
}
