package tests;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class domeTests extends BaseClass {
	@Test
	public void testone(){
		WebElement two = driver.findElement(By.id("com.vivo.calculator:id/digit2"));
		WebElement plus = driver.findElement(By.id("com.vivo.calculator:id/plus"));
		WebElement three = driver.findElement(By.id("com.vivo.calculator:id/digit3"));
		WebElement equals = driver.findElement(By.id("com.vivo.calculator:id/equal"));
//		WebElement Result = driver.findElement(By.className("android.widget.EditText"));
		two.click();
		plus.click();
		three.click();
		equals.click();
	}

}
