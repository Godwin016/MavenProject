package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Logoscreenshot {
	WebDriver driver;
	By Logo=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[1]/a[1]/img");
	
	public Logoscreenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	public void logo() {
		Boolean Logo=driver.findElement(Logo).isdisplayed();
		if(Logo)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		public void screenshot() throws IOexception
		{
			File src=((TakeScreenshot)driver).getscreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("E://Snapdeal.png"));
			WebElement button=driver.findElement(screenshot);
			File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(buttonscreenshot, new File("./Screenshot//Snapdeal.png"));
		}
	}

}
