package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
			driver.get("https://www.google.com/");
			/*
			 * implicit waits:
			 * driver.manage().timeouts().implicitWait(Duration.ofSeconds(20));
			 * 
			 * explicit Waits:
			 * WebDriverWait  wait = new WebDriverWait();
			 * wait.until(ExpectedConditions.elementToBeClickable());
			 * 
			 * FluentWaits:
			 * 
			 * Wait Wait = new FluentWait()
			 * .withTimeout(Duration.ofSeconds(seconds));
			 * .pollingEvery(Duration.ofSeconds(seconds));
			 * .ignoring(Exception.class);
			 * 
			 * SoftAssert:
			 * Soft assertions are the assertions that do not throw the exception
			 * When an assertion fails execution will continue with the next steps of the 
			 * assert statement.
			 * 
			 * from below syntax we can get to know is  softassert will assert all the conditions.
			 * once the executing is done from softassert, assertAll() will get the data.
			 * 
			 * syntax of soft assert:
			 * 
			 * SoftAssert softassert = new SoftAssert();
			 * softassert.assertEquals('black',background color,'color does not match');
			 * softassert.assertTrue(“lato,sans-serif”.equals(elementFF), “Font-family appears to be different.”);
			 * softassert.assertAll();
			 * 
			 * Hard assert:
			 * Hard assertion is a type of assertion where exception throws error message when assertion statement gets failed.
			 * and execution will move to next test suite.
			 * 
			 * Actions class elements
			 * Actions class elements are used to perform the user facing API  based
			 * 
			 *  Action cclass elements are like single user interaction	
			 *  ex: typing capital letters in the text box
			 *  
			 *  Actions actions = new Actions();
			 *  Webelement element = driver.findelement(By(id='Textfield'));
			 *  actions.keyDown(elemnt,Keys.SHIFT);
			 *  actions.sendKeys("Send the Capital letters);
			 *  actions.keyUp(Keys.SHIFT);
			 *  Action  action = actions.build();
			 *  action.perform();
			 *  
			 *  Handling alert:
			 *  driver.switchTo().alert().dismiss() --> click on cancel  button
			 *  driver.switchTo().alert().accept() --> click on ok button
			 *  driver.switchTo().alert().getText()--> to get the text of the alert
			 *  driver.switchTo().alert().sendkeys()
			 *  
			 *  Handling multiple windows:
			 *  driver.getWindowHandle()---> to handle the main window.
			 *  driver.getWindowHandles()--> to handle the remianing window.
			 *  
			 *  How to switch iframe
			 *  driver.switchTo().frame(0)--->by using index 
			 *  driver.switchTo().frame("iframe1")--->byusing frame name
			 *  driver.switchTo().frame("if1")----> by using id
			 *  driver.switchTo().frame(webelement)---> by using web element
			 *    
				*/	
			

	}

}
