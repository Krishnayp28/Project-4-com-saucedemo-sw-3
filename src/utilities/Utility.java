package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

public class Utility extends BaseTest {

    public void clickOnElements(By by){
        driver.findElement(by).click();
    }
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    /**
     * This method will get text from element and check whether it is displayed or not.
     */
    public boolean isTextDisplayed(By by, String expectedText){
        boolean actualText = (driver.findElement(by).getText()).contains(expectedText); // Find and get actual text on page and check whether it contains expected text or not?
        assert actualText : "Text is not found" + expectedText;
        return true;
    }
    /**
     * This method will get number from element and check
     * whether it is displayed or not.
     */
    public boolean getNumberFromElement(By by,int expectedNumber){
        int actualNumber = driver.findElements(by).size();
        assert actualNumber == expectedNumber : "Expected Number is not found" + expectedNumber;
        return true;
    }


}
