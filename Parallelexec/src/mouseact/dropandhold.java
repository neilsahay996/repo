package mouseact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dropandhold {

	
	static	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
       WebElement from=driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
       WebElement to=driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		String url="http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		driver.get(url);
		Actions action=new Actions(driver);
		Action drag=action.clickAndHold(from).moveToElement(to).release(to).build();
		drag.perform();
	}

}
