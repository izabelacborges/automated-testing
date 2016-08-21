package volunteer;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Test for my sites
 * 
 * @author Madi Vachon
 **/

public class MySites {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:3000/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl + "/login");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("volunteer");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("volunteer");
		driver.findElement(By.name("commit")).click();
		driver.get(baseUrl + "/articles");
		driver.findElement(By.linkText("My Site")).click();
	}
}