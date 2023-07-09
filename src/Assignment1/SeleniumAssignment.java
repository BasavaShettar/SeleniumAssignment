package Assignment1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class SeleniumAssignment {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System. setProperty ( "webdriver . chrome . driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOption = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(chromeOption);
		System.out.println("Execution started");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("emial")).sendKeys("Shettarbasavaraj1218@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shettarbasavaraj1218@gmail.com");
		driver.findElement(By.className("login")).click();
		String message = driver.findElement(By.id("response")).getText();
		if (message.equals("Message Sent"))
		{
			System.out.println("Script Executed successfully");
		}
		else
		{
			System.out.println("SCript failed");
		}
		Thread.sleep(1000);
	}
}