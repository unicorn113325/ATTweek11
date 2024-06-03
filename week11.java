package bhanu5c6;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week11 {

	public static void main(String[] args)  throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.google.com/");
		Thread.sleep(2000);
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("Myntra");
		searchBar.sendKeys(Keys.ENTER); 
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
        Thread.sleep(1000);
		driver.findElement(By.xpath("//*@id=\'rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		Thread.sleep(500);
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		
		WebElement ProfileHyperLink = driver.findElement(By.xpath("//span[normalize0-space()='Profile'])[1]"));
		ProfileHyperLink.click();
		WebElement loginbtn=driver.findElement(By.xpath("\"//span[normalize0-space()='login/Signup'])[1]"));
		loginbtn.click();
		WebElement mobileNo=driver.findElement(By.xpath("(//input@type='tel'])[1]"));
		mobileNo.sendKeys("234567889");
		((WebDriver) driver).quit();

	}

}
