package com.andagon;

import org.openqa.selenium.By;

public class RMCcheckinGenerator extends AutoBaseClass
{

	private By		_toggleLogin = By.xpath("//div[@onclick='toggleModalLogin()']");
	private By		_toggleWelcome = By.xpath
					("//div/span[@class='msg-close' " +
							"and @onclick='toggleModalWelcome()']");
	private By		_alex = By.id("alex");
	private By		_nextQuestion = By.id("btn_radom_question_wrapper");
	private By		_checkIn = By.id("btn_check_in");
	private By		_checkOut = By.id("btn_check_out");
	private By		_msgNumber = By.xpath("//span[@class='small-text']");
	private By		_companyLogo = By.id("logo");
	private By		_impressum = By.xpath("//div/p/span/a[1]");
	private By		_privacy = By.xpath("//div/p/span/a[2]");
	private By		_arrowRight = By.id("question_arrow_r");
	private By		_arrowLeft = By.id("question_arrow_l");
	private By		_questionText = By.id("question_itself");
	private By		_endOfQuestions = By.id("msg_question_finished");

	RMCcheckinGenerator()
	{
		this.home = "https://retro.myandagon.com/checkingenerator";
	}

	public Boolean closeWelcome()
	{
		return clickWebElement(_toggleWelcome);
	}

	public Boolean goToLogin()
	{
		return clickWebElement(_toggleLogin);
	}

	public Boolean nextQuestion()
	{
		return clickWebElement(_nextQuestion);
	}

	public Boolean clickRightArrow()
	{
		return clickWebElement(_arrowRight);
	}

	public Boolean clickLeftArrow()
	{
		return clickWebElement(_arrowLeft);
	}

	public Boolean clickCompanyLogo()
	{
		return clickWebElement(_companyLogo);
	}

	public Boolean showImpressum()
	{
		return clickWebElement(_impressum);
	}

	public Boolean showPrivacy()
	{
		return clickWebElement(_privacy);
	}

	public Boolean showWelcome()
	{
		return clickWebElement(_alex);
	}

	public Boolean showCheckinQuestions()
	{
		return clickWebElement(_checkIn);
	}

	public Boolean showCheckoutQuestions()
	{
		return clickWebElement(_checkOut);
	}

	public int getMessageNumber()
	{
		if (isThereElement(_msgNumber))
			return Integer.parseInt(driver.findElement(_msgNumber).getText().
							replaceAll("[^0-9]", ""));
		return (-1);
	}

	public String getMessageText()
	{
		if (isThereElement(_questionText))
			return driver.findElement(_questionText).getText();
		return null;
	}

	public Boolean isEndOfQuestions()
	{
		return isThereElement(_endOfQuestions);
	}
}
