package demoSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	public static WebDriver driver = null;
	//public static String url = "https://rahulshettyacademy.com/locatorspractice/";
	public static String url = "https://www.goibibo.com/flights/";

	public static void main(String[] args) {
		browserSetup();
		pickOption();
		//userEnters("Umama", "Password");
		//errorMes();
		tearDown();
	}
	
	public static void pickOption() {
		clickButton("//*[text()='Round-trip']");
		clickButton("//*[text()='One-way']");
		clickButton("//div[contains(@class,'sc-bjUoiL ldeDAM fswFld ')]//child::p[1]");
		//driver.findElement(By.xpath("//div[contains(@class,'sc-bjUoiL ldeDAM fswFld ')]//child::p[1]")).sendKeys("HYD");
		//clearButton("//div[contains(@class,'sc-bjUoiL ldeDAM fswFld ')]//child::p[1]");
		sendText("(//div[contains(@class,'sc-bjUoiL ldeDAM fswFld ')]//child::p[1]", "Hyderabad");
		try {
			driver.wait();
			sendText("(//p[@class='sc-dIouRR gyRYav fswWidgetTitle'])[2]", "MAA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void jsExecutor(WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", locator);
		
		//Example 4. Get InnerText of a Webpage
		//Example 5. Get Title of a WebPage
		//Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();
        
        //Example 6. Scroll Page
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        
        //Example 1.calling the method
        js.executeScript("waitMin()");
        
        
        //Example 2. JavascriptExecutor in Selenium to to send text
        js.executeScript("document.getElementByID(‘element id ’).value = ‘xyz’;");
        
        //Example 3. Generate Alert Pop Window
        js.executeScript("alert('hello world');");
        
        
	}
	
	
	
	
	public static void waitMin(int seconds) {
		int min = seconds*60000;
		try {
			driver.wait(min);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void waitSec(int seconds) {
		int min = seconds*1000;
		try {
			driver.wait(min);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void sendText(String locator, String text) {
		WebElement type = driver.findElement(By.xpath(locator));
		type.sendKeys(text);
	}
	
	public static void clearButton(String locator) {
		WebElement clear = driver.findElement(By.xpath(locator));
		clear.clear();;
	}

	public static void clickButton(String locator) {
		WebElement click = driver.findElement(By.xpath(locator));
		click.click();
	}
	
	public static void browserSetup() {
		String driverPath = "D:\\WorkSpace_Repo\\Selenium_Udemy01\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		openUrl(url);
	}
	
	public static void openUrl(String url) {
		driver.navigate().to(url);
		String pageTitle = driver.getTitle();
		System.out.println("Application title: "+pageTitle);
	}

	public static void userEnters(String userName, String Password) {
		WebElement username = driver.findElement(By.xpath("//*[@id=\"inputUsername\"]"));
		username.clear();
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]"));
		password.clear();
		password.sendKeys(Password);
		WebElement singinbutton = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button"));
		singinbutton.click();
	}

	public static void errorMes() {
		WebElement errormsg = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p"));
		conditinalwait(errormsg, 30);
		boolean v = errormsg.isDisplayed();
		System.out.println(v);
		Assert.assertEquals(v, true);
	}

	public static void tearDown() {
		driver.close();
	}

	public static void conditinalwait(WebElement element, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, TimeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void conditnalWait(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
