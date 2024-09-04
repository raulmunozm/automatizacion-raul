package main.java.pageObjects;

public interface SearchElements {

	//inputs and outputs
	String inputSearch = "//textarea[@class='gLFyf']";
	
	//buttons
	String buttonSearch = "//div[@jsname='VlcLAe']//input[@class='gNO89b']";
	String buttonLuckySearch = "//div[@class='lJ9FBc']//input[@aria-label][2]";
	
	//buttons google translate
	String buttonChangeLanguaje = "//div[@class='aCQag']//div[@jsname='SDXlTc']";// Can be used in small screens
	String buttonDropChangeLanguage = "//div[@class='ccvoYb EjH7wc']//div[@class='aCQag']//c-wiz//div[5]//button//div[@class='VfPpkd-Bz112c-RLmnJb']"; // can be used in large screens
	String selectFirstLanguajeButton = "//div[@class='dykxn C96yib j33Gae']//div//div[1]//div[2]//span[1]";
	
	//text area google translate
	String textCellChangeLanguaje = "//c-wiz[@class='bvzp8c DlHcnf']//div[@class='ykTHSe']//div[@class='pEyuac X4hZJc']//div[@class='fMHXgc qkH7ie']//input";

	// input and output google translate
	String inputChangeLanguage = "//textarea[@class='er8xn']";
	String outputChangedLanguage = "//div[@class='usGWQd']//div//div//span[1]//span//span[@class='ryNqvb']";
	
}



//div//div[@class='N54PNb BToiNc cvP2Ce']//div[1]//div//div//span//a//h3


//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div/div[1]/c-wiz/div[2]/c-wiz/div[1]/div/div[2]/input first input

//div[@class='aCQag']//c-wiz[@class='EO28P']//div[@class='akczyd']//button[@jsname='RCbdJd']//div[3] button to translate from this language to the other