package rtstreinamento.turmajunho;

import java.util.UUID;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;


public class NewsletterSteps {

	private Newsletter newsletter;
	
	@After
	public void depoisDoTeste() {
		newsletter.fecharNavegador();
	}
	
	public NewsletterSteps() {
		newsletter = new Newsletter();
	}

	@Dado("^que o eu esteja na página de newsletter$")
	public void que_o_eu_esteja_na_página_de_newsletter() throws Throwable {
		Assert.assertTrue(newsletter.getConteudoPagina().contains("Newsletter"));
	}

	@Quando("^tento cadastrar o email \"([^\"]*)\" na newsletter$")
	public void tento_cadastrar_o_email_na_newsletter(String email) throws Throwable {
		newsletter.cadastrarEmail(gerarEmail());
	}

	@Então("^visualizo a mensagem \"([^\"]*)\"$")
	public void visualizo_a_mensagem(String mensagem) throws Throwable {
		Assert.assertEquals(mensagem, newsletter.getMensagemRetorno());
	}

	@Dado("^o email \"([^\"]*)\" já esteja cadastrado$")
	public void o_email_já_esteja_cadastrado(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	private String gerarEmail() {
		String email = UUID.randomUUID().toString().replace("-", "").substring(1,10);
		return email + "@gmail.com";
	}
}
