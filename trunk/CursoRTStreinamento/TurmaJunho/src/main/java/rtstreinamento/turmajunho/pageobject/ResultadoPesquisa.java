package rtstreinamento.turmajunho.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResultadoPesquisa {

	private WebDriver webDriver;

	public ResultadoPesquisa(FirefoxDriver webDriver) {
		this.webDriver = webDriver;
	}

	public boolean resultadoEncontrado(String filme) {
		String titulo = webDriver.findElement(By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li[1]/div/a")).getAttribute("title");
		return titulo.equals("Bluray - Senhor dos Anéis -  As Duas Torres");
	}


}
