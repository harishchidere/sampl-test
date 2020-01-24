package sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Highlight {
	
	RemoteWebDriver driver;
	
		
		public void sample()  {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			/*System.setProperty("webdriver.ie.driver", "./drivers/64/IEDriverServer.exe");
			driver = new InternetExplorerDriver();*/
			driver.get("https://servicingint.heartlandapps.net/default.asp");
			new AIT().loginUsingAutoIt();
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement signup = driver.findElementByXPath("//input[@id='userName']");
			highlightElement(signup);
			signup.sendKeys("Harish");
			
			
		}
		
		
		public void highlightElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.border='2px solid blue'", element);	    
		}

}
