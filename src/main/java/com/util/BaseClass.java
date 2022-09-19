package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	public static Properties prop;

	public BaseClass() {
		String filePath = "src/test/java/Data.properties";
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
