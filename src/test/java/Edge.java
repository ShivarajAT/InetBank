import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method

		System.setProperty("webdriver.edge.driver", "C:\\InetBanking_New\\Drivers\\msedgedrivers.exe");

		// Initialize the EdgeDriver
		WebDriver EDdriver = new EdgeDriver();

		EDdriver.manage().window().maximize();
  
		// Open a website
		EDdriver.get("https://www.amazon.com");

		// Close the browser
		EDdriver.quit();

		System.setProperty("webdriver.gecko.driver", "C:\\InetBanking_New\\Drivers\\geckodriver.exe");

		WebDriver FFdriver = new FirefoxDriver();
		FFdriver.get("https://www.amazon.com");
		
		TakesScreenshot ts = (TakesScreenshot) FFdriver;
		File source = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(source, new File("C:\\InetBanking_New\\Screenshots\\screenshot1.png"));
            System.out.println("Screenshot taken.");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        } finally {
        	FFdriver.quit();

		
		
		FFdriver.quit();

	}

	}}
