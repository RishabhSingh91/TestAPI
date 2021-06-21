package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadJsonPayLoad;
import org.testing.Utilities.LoadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TC4 {
	
	@Test
	public void UpdateData() throws IOException
	{
		Properties pr = LoadProperties.properties("../NewAPI/URI.properties");
		String BodyData = LoadJsonPayLoad.LoadJson("../NewAPI/src/test/java/org/testing/resources/UpdateBody.json");
		HTTPMethods http = new HTTPMethods(pr);
		Response res =http.Put("GetAll", BodyData,"2");
		System.out.println("Response status code is: "+res.getStatusCode());
		System.out.println("Response body is: "+res.asString());
		Assert.assertEquals(res.getStatusCode(), 200);
	}
}
