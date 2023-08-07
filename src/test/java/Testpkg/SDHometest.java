package Testpkg;

import Basepkg.Baseclass;
import Pagepkg.SDHomepage;

public class SDHometest extends Baseclass {
	
	public void homepage()
	{
		SDHomepage sp=new SDHomepage(driver);
		sp.signinclick();
		sp.loginsetvalue("9946244390");
		sp.otp();
		String currenturl=driver.getCurrentUrl();
		if(baseur1.equals(currenturl))
		{
			System.out.println("login failed");
		}
		else
		{
			System.out.println("login sucess");
		}
	
	}

}
