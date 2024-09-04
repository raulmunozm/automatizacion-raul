package main.java.pageEvents;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.WebElement;

import main.java.config.Context;
import main.java.config.Utils;
import main.java.config.Validation;
import main.java.pageObjects.ResultsElements;
import main.java.utils.Events;

public class ResultsEvents implements ResultsElements {

	@Context(description = "Muestra por consola el resultado según la ubicación", page = "Google Search")
	public static void resultVerify(String index) {

		try {
			String currentPage = Objects.requireNonNull(Events.getAtributte(htmlDocument, "itemtype")).split("/")[3];
			Utils.outputInfo("La página actual es: " + currentPage);
			Validation.trueBooleanCondition(currentPage.contains("Results"),
					"Se ha redireccionado a la página correcta", "No se a redireccionado a la página correcta");

			List<WebElement> titles = Events.getElementList(googleSearchList);
			String resultTitle;
			for (int i = 0; i < Objects.requireNonNull(titles).size(); i++) {
				if (i == Integer.parseInt(index)) {
					resultTitle = titles.get(i).getText();
					Utils.outputInfo("El " + index + " resultado es: " + resultTitle);
				}
			}

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}
	
	@Context(description = "Obtiene los nombres de las búsquedas sugeridas", page = "Google")
	public static List<String> getSearchResultNames() {
	    try {
			String currentPage = Objects.requireNonNull(Events.getAtributte(htmlDocument, "itemtype")).split("/")[3];
			Utils.outputInfo("La página actual es: " + currentPage);
			Validation.trueBooleanCondition(currentPage.contains("WebPage"),
					"Se ha redireccionado a la página correcta", "No se a redireccionado a la página correcta");
			
	        List<WebElement> searchResults = Events.getElementList(googleSuggestedSearch);
	        List<String> resultNames = new ArrayList<>();

	        for (WebElement Result : searchResults) {
	            resultNames.add(Result.getText());
	        }

	        return resultNames;
	    } catch (Exception e) {
	        Utils.eventFailed(e.getMessage());
	        return null;
	    }
	}
	
	@Context(description = "Obtiene los textos de la lista de imagenes", page = "Google")
	public static String getImageText() {
		
		try {
			String currentPage = Objects.requireNonNull(Events.getAtributte(htmlDocument, "itemtype")).split("/")[3];
			Utils.outputInfo("La página actual es: " + currentPage);
			Validation.trueBooleanCondition(currentPage.contains("Results"),
					"Se ha redireccionado a la página correcta", "No se a redireccionado a la página correcta");
			
			List<WebElement> listOfButtons = Events.getElementList(listOfButtonsSearch);
			
			//Clicks on the button "images" on google
			for (int i = 0; i < listOfButtons.size(); i++) {
				listOfButtons.get(0).click();
			}
			
			//List of images
			List<WebElement> imgList = Events.getElementList(imagesList);
			if(imgList.size()>=3) {
				imgList.get(2).click();
			}
			
			
			Utils.outputInfo("Lista de imagenes: "+imgList);
			List<String> textList = new ArrayList<>();
			
			//click in third image
			imgList.get(2).click();
			
			List<WebElement> imgTextList = Events.getElementList(imageTextList);
			for (int i = 0; i < imgTextList.size(); i++) {
				String txt = imgTextList.get(i).getText();
				textList.add(txt);
			}
			
			String imageText = textList.get(1);
			return imageText;
			
			
		}catch (Exception e) {
			Utils.eventFailed(e.getMessage());
			return null;
		}
		
	}
	
	@Context(description = "Traduccion de Texto", page = "Google")
	public static void getSearchResultLinks(String[] args) {
		
	}
	
	@Context(description = "", page = "Google")
	public static void signInMail(String mail, String pass) {
		
		List<WebElement> searchLinksList = Events.getElementList(googleSearchList);
		searchLinksList.get(0).click();
		
		Events.clickButton(outlookSignInButton);
		Utils.outputInfo("Email para la prueba: "+mail);
		Events.sendKeys(outlookMailCell, mail);
		Events.clickButton(outlookContinueButton);
		Utils.outputInfo("Password para la prueba: "+pass);
		Events.sendKeys(outlookPasswordCell, pass);
		
	}
}




