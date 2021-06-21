package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class ParsingJsonUsingJsonPath {
	public static String ParseJson(Response res, String JsonPath)
	{
		return res.jsonPath().getString(JsonPath);
	}
}
