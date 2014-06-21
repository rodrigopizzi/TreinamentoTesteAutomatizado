package rtstreinamento.turmajunho.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaProduto {

	private FirefoxDriver webDriver;

	public PesquisaProduto() {
		webDriver = new FirefoxDriver();
		webDriver.get("http://tghcastro.lojaintegrada.com.br/");
	}
	
	public void digitarONomeDoFilmeNaBusca(String filme) {
		WebElement campoPesquisa = webDriver.findElement(By.id("auto-complete"));
		campoPesquisa.sendKeys(filme);
	}
	
	public ResultadoPesquisa clicarBotaoPesquisar() {
		WebElement campoPesquisa = webDriver.findElement(By.id("auto-complete"));
		campoPesquisa.submit();
		
		ResultadoPesquisa resultadoPesquisa = new ResultadoPesquisa(webDriver);
		return resultadoPesquisa;
	}

	
}
