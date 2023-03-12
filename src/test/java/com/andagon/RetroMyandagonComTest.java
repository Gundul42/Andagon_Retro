package com.andagon;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RetroMyandagonComTest
{
	RetroMyandagonCom	underTest = new RetroMyandagonCom();
	String				checkinGenerator =  "https://retro.myandagon.com/" +
											"checkingenerator/";
	String				cssFramework = "https://retro.myandagon.com/" +
										"css-framework/";

	@BeforeEach
	public void openHomepage()
	{
		underTest.callHome();
	}

	@Test
	public void checkinGenerator()
	{
		Assert.assertTrue(underTest.clickCheckin());
		Assert.assertEquals(checkinGenerator,
				underTest.driver.getCurrentUrl());
	}

	@Test
	public void frameworkPreview()
	{
		Assert.assertTrue(underTest.clickcssFramework());
		Assert.assertEquals(cssFramework, underTest.driver.getCurrentUrl());
	}

	@Test
	public void showImpressum()
	{
		Assert.assertTrue(underTest.clickImpressum());
	}

	@Test
	public void showPrivacy()
	{
		Assert.assertTrue(underTest.clickPrivacy());
	}

	@AfterEach
	public void cleanup()
	{
		underTest.driver.quit();
	}
}