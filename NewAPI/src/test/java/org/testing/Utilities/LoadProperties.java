package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	
	public static Properties properties(String Filepath) throws IOException
	{
		File path = new File(Filepath);
		FileInputStream fi = new FileInputStream(path);
		Properties pr = new Properties();
		pr.load(fi);
		return pr;
	}

}
