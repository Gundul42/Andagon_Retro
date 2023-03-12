package com.andagon;

import org.openqa.selenium.By;

public class RetroMyandagonCom extends AutoBaseClass
{
	private By		_checkin = By.xpath("//body/a[1]");
	private By		_cssFramework = By.xpath("//body/a[2]");
	private	By		_impressum = By.xpath("//body/div/a[1]");
	private	By		_privacy = By.xpath("//body/div/a[2]");

	RetroMyandagonCom()
	{
		this._home = "https://retro.myandagon.com";
	}

	public Boolean	clickCheckin()
	{
		return clickWebElement(_checkin);
	}

	public Boolean	clickcssFramework()
	{
		return clickWebElement(_cssFramework);
	}

	public Boolean	clickImpressum()
	{
		return clickWebElement(_impressum);
	}

	public Boolean	clickPrivacy()
	{
		return clickWebElement(_privacy);
	}
}
