package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Reader11 {
	@Test
	
	
	public static void readprop() throws IOException
	{
		
		Properties prop =new Properties();
		FileInputStream ip=new FileInputStream("./config/config.properties");
		prop.load(ip);
		
		String uritofetch=prop.getProperty("uri");
		System.out.println(uritofetch);
		
		
	}

}
