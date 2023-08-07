package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SDHomepage {
	
	WebDriver driver;
	By Signin=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div");
	By Login=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a");
	By Phno=By.xpath("//*[@id=\"userName\"]");
	By button=By.xpath("//*[@id=\"checkUser\"]");
	By otp=By.xpath("//*[@id=\"loginUsingOtp\"]");
	public void SDHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signinclick() 
	{
		driver.findElement(Signin).click();
		driver.findElement(Login).click();
	}
	public void loginsetvalue(String no)
	{
		driver.findElement(Phno);
	}
	public void otp()
	{
		driver.findElement(otp);
	}
	
	

}
