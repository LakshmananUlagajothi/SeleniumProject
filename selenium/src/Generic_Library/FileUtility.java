package Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public static String getProperty(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./src/commondata.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String property=p.getProperty(key);
		
		return property;
		
	}

}
