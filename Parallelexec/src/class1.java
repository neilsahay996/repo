import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class1 {
   
	WebDriver driver;
	String baseURL = "http://www.google.com/";
	@Parameters({ "browser" })
	@BeforeTest
	public void test1(String browser1)
	{
		try{
		if(browser1.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
				}
		else if(browser1.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
			
	@Test
	public void test2(){
		driver.get(baseURL);
	}
	
	@Test
	public void test3(){
		driver.get(baseURL);
	}
		}
