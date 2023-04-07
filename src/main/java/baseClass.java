import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
//import utilities.configFileReader;
import java.net.MalformedURLException;
import java.net.URL;

@Test
public class baseClass {
    public static AppiumDriver driver;

    public static utilities.configFileReader configFileReader;

    public void start() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        configFileReader = new utilities.configFileReader();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, configFileReader.getdeviceName());
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, configFileReader.getplatformName());
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, configFileReader.getplatformVersion());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, configFileReader.getautomationName());
        cap.setCapability(MobileCapabilityType.TIMEOUTS, "10000");
        cap.setCapability(MobileCapabilityType.APP, configFileReader.getappPath());
        URL url = new URL(configFileReader.getappiumServerURL());
        driver = new AppiumDriver(url, cap);
    }
}
