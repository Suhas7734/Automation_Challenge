package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static String getproperty(String key) throws IOException {
		Properties prop= new Properties();
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\com.properties";
		File files = new File(path);
		if (!files.exists()) {
			throw new FileNotFoundException("Could not find file at: " + path);
		}

		try {
			FileInputStream file= new FileInputStream(path);
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		return prop.getProperty(key);
		
		
	}

}
