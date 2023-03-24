package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {
    private Properties properties;
    private final String propertyFile = "configuration//config.properties";

    public configFileReader (){
        BufferedReader reader;
        try {
            reader = new BufferedReader (new FileReader(propertyFile));
            properties = new Properties();
            try{
                properties.load(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getdeviceName(){
        String getdeviceName = new properties.getProperty("deviceName");
        if (getdeviceName != null) return getdeviceName;
        else throw new RuntimeException("Device name Not Found");
    }

    public String getplatformName(){
        String getplatformName = new properties.getProperty("platformName");
        if (getplatformName != null) return getplatformName;
        else throw new RuntimeException("Platform name Not Found");
    }

    public String getplatformVersion(){
        String getplatformVersion = new properties.getProperty("platformVersion");
        if (getplatformVersion != null) return getplatformVersion;
        else throw new RuntimeException("Platform version Not Found");
    }

    public String getautomationName(){
        String getautomationName = new properties.getProperty("automationName");
        if (getautomationName != null) return getautomationName;
        else throw new RuntimeException("Automation Name Not Found");
    }

    public String getappPath(){
        String getappPath = new properties.getProperty("appPath");
        if (getappPath != null) return getappPath;
        else throw new RuntimeException("App path Not Found");
    }

    public String getappiumServerURL(){
        String getappiumServerURL = new properties.getProperty("appiumServerURL");
        if (getappiumServerURL != null) return getappiumServerURL;
        else throw new RuntimeException("Appium Server Not Found");
    }

}
