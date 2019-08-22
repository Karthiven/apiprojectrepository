package com.utility;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Appmethods {
	
	@Test
	public static void getcall()
	{
		Response res=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	    System.out.println(res.getStatusCode());	
	} 
	
	@Test
	
	public static void postcall()
	{
		
	}

}
