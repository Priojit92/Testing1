package Winium.WiniumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class AutomatingDesktop {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesktopOptions opt=new DesktopOptions();
		opt.setApplicationPath("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
		WiniumDriver driver= new WiniumDriver(new URL("http://localhost:9999"),opt);
		
	}

}
