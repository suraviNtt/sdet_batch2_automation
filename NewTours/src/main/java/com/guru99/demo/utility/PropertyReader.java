package com.guru99.demo.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	
	private String path = System.getProperty("user.dir")+"/src/main/resources/config.properties";
	private Properties prop;
	
	public PropertyReader() throws IOException {
		FileInputStream file = new FileInputStream(path);
		prop = new Properties();
		prop.load(file);
		
	}
	
	public String getBrowserName() {
		return prop.getProperty("brower");
	}
	
	public String getAppUrl() {
		return prop.getProperty("url");
	}
	
	public void updateURL(String value) {
	 prop.put("url", value);
	}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(path);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
