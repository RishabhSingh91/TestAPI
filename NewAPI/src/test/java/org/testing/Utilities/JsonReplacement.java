package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String JsonValueReplacement(String Body, String value, String ReplaceMentValue)
	{
		Body = Body.replaceAll(Pattern.quote("{{"+value+"}}"), ReplaceMentValue);
		return Body;
	}

}
