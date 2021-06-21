package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadJsonPayLoad;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TC3 {
	@Test
	public void CreateData() throws IOException
	{
		Properties pr = LoadProperties.properties("../NewAPI/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		String BodyData = LoadJsonPayLoad.LoadJson("../NewAPI/src/test/java/org/testing/resources/BodyData.json");
		Response res = http.Post("GetAll", BodyData);
		System.out.println("Response code is: "+ res.getStatusCode());
		
	}
}
