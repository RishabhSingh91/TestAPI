package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;
import org.testing.Utilities.ParsingJsonUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2 {
	
	@Test
	public void GetSpecificRecord() throws IOException
	{
		Properties pr = LoadProperties.properties("../NewAPI/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.Get("GetAll", "2");
		System.out.println("Response status is: "+res.getStatusCode());
		System.out.println(res.asString());
		
		System.out.println("Id is: "+ParsingJsonUsingJsonPath.ParseJson(res, "data.id"));
	}


}
