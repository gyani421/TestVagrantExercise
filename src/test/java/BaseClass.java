

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	
	static Properties prop;
	public BaseClass() throws Exception {
		String filePath="F:\\AUTOMATION STUFFS\\Selenium\\Selenium-Maven\\GitHubWS\\TestVagrantExercise2\\TestVagrantExercise\\src\\test\\java\\Data.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		prop= new Properties();
		try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
