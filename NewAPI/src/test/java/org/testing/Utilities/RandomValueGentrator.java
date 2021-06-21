package org.testing.Utilities;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomValueGentrator {
	
	public static String Generate(String data)
	{
		Integer id;
		Random ran = new Random();
		id = ran.nextInt(10000000);
		data = data+id.toString();
		return data;
	}

}
