package task_18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethodsAndActions_2 {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
        Thread.sleep(3000);

		Actions action = new Actions(driver);
        WebElement drag
            = driver.findElement(By.id("draggable"));
        WebElement drop
            = driver.findElement(By.id("droppable"));

        action.dragAndDrop(drag, drop)
            .build()
            .perform();

        Thread.sleep(3000);
		
	}
}
