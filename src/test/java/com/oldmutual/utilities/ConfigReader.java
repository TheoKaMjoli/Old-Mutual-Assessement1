package com.oldmutual.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	
	public ConfigReader() {
		
		try (InputStream input = new FileInputStream("src/test/java/com/oldmutual/conf/config.properties")) {
			 prop = new Properties();
			 prop.load(input);
		} catch(IOException ex) {
			// add catch error
		}
	}
	
	public String getHomeURL() {
		return prop.getProperty("homeURL");
	}
	
	public String getHomeTitle() { 
		return prop.getProperty("homeTitle");
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getbrowserSetupLogerror() {
		return prop.getProperty("browserSetupLogerror");
	}
}
