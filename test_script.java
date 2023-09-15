package task;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GRIP {
public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();

     driver.get("https://www.thesparksfoundationsingapore.org/");
    // driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
     //Thread.sleep(2000);
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
     Thread.sleep(5000);
     
     driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Shubham");
     Thread.sleep(2000);
     driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//select[@class='form-control']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//span[@id='toTopHover']")).click();
     
     //driver.findElement(By.linkText("Intern")).click();
     //WebElement ele=driver.findElement(By.xpath("//select[@class='form-control']"));
     driver.close();
     //driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Shubham");
     //select[@class='form-control']
    //input[@type='submit']
    //input[@type='submit']
    //span[@id='toTopHover']
    //button[@aria-label='Play']
}
}
