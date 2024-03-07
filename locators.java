package epamBalu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.driver.chromedriver", "F:\\playground\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //EdgeDriver driver = new EdgeDriver();
        //FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Your_Username");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Your_password");
        driver.findElement(By.tagName("button")).sendKeys(Keys.ENTER);
        WebElement errorMessageElement = driver.findElement(By.cssSelector("div[role='alert']"));
        String errorMessage = errorMessageElement.getText();
        System.out.println("Error message: " + errorMessage);
        driver.quit();
	}

}
