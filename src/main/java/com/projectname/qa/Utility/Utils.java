package com.projectname.qa.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.projectname.qa.Base.TestBase;

public class Utils extends TestBase {
	
	//border
	
		public static void borderbyJS(WebDriver driver , WebElement element) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'",element);
		}

		public static String titlebyJS(WebDriver driver) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String title = js.executeScript("return document.title;").toString();
			return title;
		}
		
		//click
		
		public static void clickbyJS(WebDriver driver, WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void refreshbyJS(WebDriver driver) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
		}
		
		public static void alertbyJS(WebDriver driver, String message) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+""+ message +""+"')");
		}
		
		public static void scrolldownJS(WebDriver driver, int x, int y) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+ x + ", "+ y +")");
		}
		
		public static void scrollupbyJS(WebDriver driver, int a, int b) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+ a + ", "+ b +")");
		}
			public static void scrollintoviewbyJS(WebDriver driver, WebElement element) {
				
				WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].scrollIntoView(true);", element );
			
			
		}

}
