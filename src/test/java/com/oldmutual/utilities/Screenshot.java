package com.oldmutual.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws InterruptedException, IOException {
		
		webdriver.wait(2000); //the screenshot will try to take the snap while the page is loading
		TakesScreenshot screenshot = ((TakesScreenshot)webdriver);
		File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	

}
