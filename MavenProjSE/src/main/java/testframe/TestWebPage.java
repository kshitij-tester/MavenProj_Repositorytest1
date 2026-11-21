package testframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		
		
		WebElement login=d.findElement(By.xpath(""));
		login.click();
		
		
		
		
		
	}

}
