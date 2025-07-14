package com.projectname.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void waitForVisibility(WebDriver driver, WebElement element, int time) {
        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(element));
    }

    public void selectDropdown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    
    public static void selectOptionFromDropDown(WebElement ele,String value) {
		
		Select drp = new Select(ele);
		
		List<WebElement> allOptions =drp.getOptions();
		  
		  for(WebElement option:allOptions) {
			 
			  if(option.getText().equals(value)) {
				 
				  option.click();
				  break;
			  }
		  }
	}

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }
    
}

