package com.oneDayCart.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	public String getCommonKeyValue(String key) {
		Properties prop = null;
		try {
			FileInputStream file=new FileInputStream("./src/test/java/commonData/commonData.properties");
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
