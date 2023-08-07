package Pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkcount {
	WebDriver driver;
	
	public void Linkcount(WebDriver driver)
	{
		this.driver=driver;
	}
	public void test1()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links= "+li.size());
		
		for(WebElement x:li)
		{
			String link =x.getAttribute("href");
			String linktext=x.getText();
			System.out.println(link+"---"+ linktext);
	}

}
}
