package test.java.main;

import main.java.config.OpenCSV;
import main.java.pageSteps.ResultsSteps;
import main.java.pageSteps.SearchSteps;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

import test.java.BaseTest;

public class GoogleTests extends BaseTest {

	@Test(priority = 1, enabled = false, dataProvider = "dataGoogleSearch")
	public void obtenerSegundoResultado(String[] args) {

		test.assignCategory("Google Search");
		step = test.createNode("Obtener el segundo resultado dada una búsqueda en Google");

		SearchSteps.normalSearch("TestGroup");
		ResultsSteps.getResult(args[1]);

	}

	@Test(priority = 2, enabled = false)
	public void busquedasSugeridas() {
		
		test.assignCategory("Google Search");
		step = test.createNode("Obtener los textos en una busqueda");
		
		SearchSteps.textInput("TestGroup");
		ResultsSteps.getSearchListText();
		
	}
	
	@Test(priority= 3, enabled = true)
	public void nombreTerceraImagen(){

		test.assignCategory("Google Search");
		step = test.createNode("Recuperar el texto de la tercera imagen de la busqueda");

		SearchSteps.normalSearch("TestGroup");
		ResultsSteps.getImageThree();
		
	}
	
	@Test(priority= 4, enabled = false)
	public void traducirTexto(){

		test.assignCategory("Google Search");
		step = test.createNode("Traducir texto dentro de google translate");

		SearchSteps.luckySearch("Google Translate");
		SearchSteps.chineseToSpanish("Texto de prueba a traducir","chinese");
		
	}
	
	@Test(priority= 5, enabled = false)
	public void pruebaCinco(){

		test.assignCategory("Google Search");
		step = test.createNode("Mail outlook login");
		
		SearchSteps.normalSearch("outlook sign in");
		ResultsSteps.signIn("raulm.test@outlook.com","raul1234567890");
		
	}
	
	@DataProvider(name = "dataGoogleSearch")
	public Object[][] dataGoogleSearch() throws CsvValidationException, InterruptedException, IOException {
		return OpenCSV.getCSVParametersDescription("search" + File.separator + "CSVDataSearch.csv", 1, 4);
	}
	
}
