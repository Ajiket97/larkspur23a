package com.keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	/**
	 * getting value from Locator.properties
	 * 
	 * @return
	 * @throws  
	 * @throws IOException
	 */
	public String getLocatorValue(String filepath, String key)   {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop.getProperty(key);
		String value = prop.getProperty(key);
		return value;

	}

}
