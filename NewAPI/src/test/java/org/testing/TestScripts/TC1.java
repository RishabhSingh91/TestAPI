package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TC1 {
	
	@Test
	public void GetAllRecords() throws IOException
	{
		Properties pr = LoadProperties.properties("../NewAPI/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res =http.Get("GetAll");
		System.out.println("Response status is: "+res.getStatusCode());
		System.out.println(res.asString());
		Assert.assertEquals(res.getStatusCode(), 100);
	}
	

}
