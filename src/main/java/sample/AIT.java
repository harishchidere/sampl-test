
package sample;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Properties;

import org.openqa.selenium.Keys;

import com.jacob.com.LibraryLoader;


import autoitx4java.AutoItX;

public class AIT {
	
	
	public void loginUsingAutoIt() {
		//For Username and Pwd
	
		final String userName = "harish.chidere";
		final String password = "Changeme@123";
		
		
		//Calling AutoITX
		String jacobDllVersionToUse;
		if(System.getProperty("sun.arch.data.model").contains("32"))
		{
			System.out.println(System.getProperty("sun.arch.data.model"));
			jacobDllVersionToUse = "jacob-1.14.3-x86.dll";
		}
		else {
			System.out.println(System.getProperty("sun.arch.data.model"));
			jacobDllVersionToUse = "jacob-1.14.3-x64.dll";
		}
		File file = new File("jacobdll", jacobDllVersionToUse);
		System.out.println(file.getAbsolutePath());
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		AutoItX x = new AutoItX();
		String title = "Untitled";
		//System.out.println(x.winGetTitle(title)+"Title ");
		
		x.send(userName);
		
		
		
		
		if (x.winExists(title)) {			
			x.controlFocus(title, "", "Edit1");
			x.ControlSetText(title, "", "Edit1", userName);
			x.controlFocus(title, "", "Edit2");
			x.ControlSetText(title, "", "Edit2", password);
			x.controlClick(title, "", "Button2");
		}
	}

}
