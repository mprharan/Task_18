package task_18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethodsAndActions_1 {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Facebook")) {
			System.out.println("It is Facebook homepage");
		}

		WebElement CrButton = driver.findElement(By.xpath("//*[text()='Create new account']"));
		CrButton.click();
		
		WebElement Fname = driver.findElement(By.xpath("//*[@placeholder='First name']"));
		Fname.sendKeys("Text");
		WebElement Lname = driver.findElement(By.xpath("//*[@name='lastname']"));
		Lname.sendKeys("User");
		WebElement Email = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		Email.sendKeys("testuser@test.com");
		Thread.sleep(5000);
		WebElement CEmail = driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']"));
		CEmail.sendKeys("testuser@test.com");
		WebElement Pass = driver.findElement(By.id("password_step_input"));
		Pass.sendKeys("Harirmnm@123");
		
		WebElement date = driver.findElement(By.id("day"));
		Select drop = new Select(date);
		drop.selectByVisibleText("11");
		WebElement month = driver.findElement(By.id("month"));
		Select drop2 = new Select(month);
		drop2.selectByVisibleText("May");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3 = new Select(year);
		drop3.selectByVisibleText("1985");
		
		WebElement radio = driver.findElement(By.xpath("//*[text()='Male']"));
		radio.click();
		WebElement button = driver.findElement(By.id("u_o_s_77"));
		button.click();
		
		/*
		 * And then it forwarded to the e-mail verification page. 
		 * Since i'm using dummy id, i can't verify it with the verification code.
		 */
	}
	
}
