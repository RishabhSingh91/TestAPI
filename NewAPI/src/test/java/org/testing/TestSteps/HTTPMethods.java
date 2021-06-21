package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {

	static Properties pr;

	public HTTPMethods(Properties pr) {
		this.pr = pr;
	}

	public static Response Get(String Uri) {
		Response res = given().contentType(ContentType.JSON).when().get(pr.getProperty(Uri));
		return res;
	}

	public static Response Get(String Uri, String param) {
		String URI = pr.getProperty(Uri) + "/" + param;
		Response res = given().contentType(ContentType.JSON).when().get(URI);
		return res;
	}

	public static Response Post(String Uri, String Body) {
		Response res = given().contentType(ContentType.JSON).body(Body).when().post(pr.getProperty(Uri));
		return res;
	}
	
	public static Response Put(String URI, String Body, String updateID)
	{
		String URL = pr.getProperty(URI)+"/"+updateID;
		Response res = given().contentType(ContentType.JSON).body(Body).put(URL);
		return res;
	}

}
