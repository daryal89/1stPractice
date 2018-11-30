package git1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class SauceLabsTest {

	public static final String USERNAME = "sagun123";
	public static final String ACCESS_KEY = "52a381f5-ab5b-4d14-8e76-321f639abefe";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "58.0");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
}
