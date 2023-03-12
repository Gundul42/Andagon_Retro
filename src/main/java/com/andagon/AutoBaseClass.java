package com.andagon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AutoBaseClass
{
	protected WebDriver			driver = new ChromeDriver();
	protected Wait<WebDriver>	wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(20L))
								.pollingEvery(Duration.ofSeconds(1L));

	protected String				_home = null;

	protected Boolean	clickWebElement(By element)
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e)
		{
			/* add logging info here about element details */
			return false;
		}
		driver.findElement(element).click();
		return true;
	}

	protected Boolean	isThereElement(By element)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		}
		catch (Exception e)
		{
			/* add logging info here about element details */
			return false;
		}
		return true;
	}


	public void callHome()
	{
		driver.get(_home);
	}

	public String getHomeUrl()
	{
		return _home;
	}

}
