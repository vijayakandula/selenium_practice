package com.selenium.utility;

import java.io.FileReader;
import java.util.Properties;

public class LoadProps {
	
	public static String getData(String key) throws Exception{
		String value ="";
		
		try {
			FileReader fileReader = new FileReader("Props.properties");
			
			Properties props = new Properties();
			props.load(fileReader);
			
			value = props.getProperty(key);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}

}
