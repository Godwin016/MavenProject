package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SDsearch1 {
	
WebDriver driver;
	
	By searchname=By.xpath("//*[@id=\"inputValEnter\"]");
	By searchicon=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span");
	
	public void SDsearch1(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String name)
	{
		driver.findElement(searchname).sendKeys(name);
	}
	public void search()
	{
		driver.findElement(searchicon);
	}

}
