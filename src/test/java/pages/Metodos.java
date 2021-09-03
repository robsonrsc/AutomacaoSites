package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends navegador {

	public void escrever(String texto, By elemento) {

		adriver().findElement(elemento).sendKeys(texto);
	}

	public void clique(By elemento) {

		adriver().findElement(elemento).click();

	}

	public void validar(String esperado, By elemento) {

		String texto = adriver().findElement(elemento).getText();
		assertEquals(esperado, texto);

	}

	public void evidencia(String nome) throws IOException {

		TakesScreenshot scren = ((TakesScreenshot)adriver());
		File destino = scren.getScreenshotAs(OutputType.FILE);
		File local = new File ("./evidencias/ " +nome+ ".png");
		FileUtils.copyFile(destino, local);
	}
	
	public void title (String titulo) {
		
		String pagina = adriver().getTitle();
		assertEquals(titulo, pagina);
	}
	public void fechar () {
		
		adriver().quit();
	}
}
