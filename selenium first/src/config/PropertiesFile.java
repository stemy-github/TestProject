package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import firstTest.FirstScript;

public class PropertiesFile {
	static Properties prop = new Properties();
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	public static void readPropertiesFile() {
		
		try {
			InputStream input = new FileInputStream("D:\\selenium java\\eclipse-workspace\\selenium first\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			FirstScript.browser = prop.getProperty("browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream("D:\\selenium java\\eclipse-workspace\\selenium first\\src\\config\\config.properties");
			prop.store(output, null);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
