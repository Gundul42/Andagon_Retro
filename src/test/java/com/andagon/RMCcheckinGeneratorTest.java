package com.andagon;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RMCcheckinGeneratorTest
{
	RMCcheckinGenerator	underTest = new RMCcheckinGenerator();

	@BeforeEach
	public void initHomepage()
	{
		underTest.callHome();
	}

	@Test
	public void iterateTroughQuestionsForward()
	{
		int	nbr = 0;

		Assert.assertTrue(underTest.closeWelcome());
		while (nbr < underTest.getMessageNumber())
		{
			nbr = underTest.getMessageNumber();
			Assert.assertTrue(underTest.clickRightArrow());
		}
		Assert.assertTrue(underTest.isEndOfQuestions());
	}

	@AfterEach
	public void cleanUp()
	{
		underTest.driver.quit();
	}
}