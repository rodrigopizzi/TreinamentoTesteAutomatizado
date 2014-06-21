package rtstreinamento.turmajunho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newsletter {
	
	private WebDriver webDriver;
	
	public Newsletter() {
		webDriver = new FirefoxDriver();
//		System.setProperty("phantomjs.binary.path", "c:\\webdrivers\\phantomjs.exe");
//		webDriver = new PhantomJSDriver();
		webDriver.get("http://tghcastro.lojaintegrada.com.br/");
	}

	public String getConteudoPagina() {
		return webDriver.getPageSource();
	}
	
	public void cadastrarEmail(String email) {
		webDriver.manage().window().maximize();
		
		WebElement campoEmail = webDriver.findElement(
				By.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[3]/div/div/div/div/div[1]/input"));
		campoEmail.sendKeys(email);
		
		WebElement botaoCadastrar = webDriver.findElement(
				By.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[3]/div/div/div/div/div[1]/button"));
		botaoCadastrar.click();
	}

	public void fecharNavegador() {
		webDriver.close();
	}

	public String getMensagemRetorno() throws Exception {
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[3]/div/div/div/div/div[2]/span"));
		Thread.sleep(500);
		return element.getText();
	}
	
}
