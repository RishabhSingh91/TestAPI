package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonPayLoad {
	
	public static String LoadJson(String FilePath) throws FileNotFoundException
	{
		File f = new File(FilePath);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jsob = new JSONObject(jt);
		return jsob.toString();
	}

}
