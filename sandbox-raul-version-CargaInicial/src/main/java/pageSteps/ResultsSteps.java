package main.java.pageSteps;

import java.util.List;
import main.java.config.Context;
import main.java.config.Utils;
import main.java.pageEvents.ResultsEvents;

public class ResultsSteps {

	@Context(step = "Obtener el resultado de la búsqueda")
	public static void getResult(String index) {
		
		Utils.stepStarted();
		ResultsEvents.resultVerify(index);
	}
	
	@Context(step = "Realizar busqueda y devolver texto de los elementos encontrados")
	
	public static void getSearchListText() {
		
		Utils.stepStarted();
		List<String> resultNames = ResultsEvents.getSearchResultNames();
		Utils.outputInfo("lista de nombres: "+resultNames);
		for (int i = 0; i < resultNames.size(); i++) {
			Utils.outputInfo("Nombre de busqueda sugerida: " + resultNames.get(i));
		}
	}
	
	@Context(step = "Realizar Busqueda de imagenes y devolver el texto")
	public static void getImageThree() {
		
		Utils.stepStarted();
		String textOfImage = ResultsEvents.getImageText();
		Utils.outputInfo("Texto de la imagen: " + textOfImage);
		
	}
	
	@Context(step = "Entrar a la cuenta con las credenciales entregadas")
	public static void signIn(String mail,String pass) {
		
		Utils.stepStarted();
		ResultsEvents.signInMail(mail,pass);
	}
}
