package com.TY.GitHub.Ecommerce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Praveen
 *
 */

public class PropertyFile 
{
	/**
	 * It is a generic method to read the data from the property file
	 * @param key
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getData(String key) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(IEEndPoints.propertyfilepath));
		return p.getProperty(key);
	}

}
