package main.java.pageObjects;

public interface ResultsElements {
	
	String htmlDocument = "//html";
	
	String googleSearchList = "//h3[@class='LC20lb MBeuO DKV0Md']";
	
	//List of buttons on google search
	String listOfButtonsSearch = "//div[@jsname='QcAYrd']//div[@class='IUOThf']//a[@class='LatpMc nPDzT T3FoJb']";
	
	//List of images to click
	String imagesList = "//img[@jsname='Q4LuWd']";
	
	String imageTextList = "div[@jsname='St5Dhe']//div[@class='DqX9we']//a//h3";
	
	//Suggested search list google
	String googleSuggestedSearch = "//div[@class='eIPGRd']//div[@class='pcTkSc']//div[@class='lnnVSe']";
	
	//Microsoft Outlook - sign in button
	String outlookSignInButton = "//div[@id='mectrl_headerPicture']";
	
	//Microsoft Outlook - mail input text area
	String outlookMailCell = "//input[@id='i0116']";
	
	//Microsoft Outlook - mail password text area
	String outlookPasswordCell = "//input[@name='passwd']";
	
	//Microsoft Outlook - continue button
	String outlookContinueButton = "//input[@id='idSIButton9']";
	
}

//*[@id="islrg"]/div[1]/div[1]/a[2]/div[1]/img

//div[@jsname='N9Xkfe']//a[@jsname='uy6ald']//div//img


