package rtstreinamento.turmajunho;

import org.junit.Assert;

import rtstreinamento.turmajunho.pageobject.PesquisaProduto;
import rtstreinamento.turmajunho.pageobject.ResultadoPesquisa;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaProdutoSteps {
	
	private PesquisaProduto pesquisaProduto;
	private ResultadoPesquisa resultadoPesquisa;
	private String filme;

	public PesquisaProdutoSteps() {
		pesquisaProduto = new PesquisaProduto();
	}

	@Dado("^que eu esteja na página de pesquisa de produto$")
	public void que_eu_esteja_na_página_de_pesquisa_de_produto() throws Throwable {
	}

	@Dado("^que o filme \"([^\"]*)\" esteja cadastrado$")
	public void que_o_filme_esteja_cadastrado(String arg1) throws Throwable {
	}
	
	@Dado("^que o filme \"([^\"]*)\" esteja cadastrado como indisponível$")
	public void que_o_filme_esteja_cadastrado_como_indisponível(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Dado("^que o filme \"([^\"]*)\" não esteja cadastrado$")
	public void que_o_filme_não_esteja_cadastrado(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Dado("^que existam filmes cadastrados$")
	public void que_existam_filmes_cadastrados() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Quando("^pesquiso o filme \"([^\"]*)\"$")
	public void pesquiso_o_filme(String filme) throws Throwable {
		this.filme = filme;
		pesquisaProduto.digitarONomeDoFilmeNaBusca(filme);
		resultadoPesquisa = pesquisaProduto.clicarBotaoPesquisar();
	}
	
	@Quando("^pesquiso o filme sem informar o nome$")
	public void pesquiso_o_filme_sem_informar_o_nome() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Então("^visualizo que o filme foi pesquisado$")
	public void visualizo_que_o_filme_foi_pesquisado() throws Throwable {
		Assert.assertTrue(resultadoPesquisa.resultadoEncontrado(filme));
	}

	@Então("^visualizo dois filmes no resultado da pesquisa$")
	public void visualizo_dois_filmes_no_resultado_da_pesquisa() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Então("^visualizo o filme como indisponivel no resultado da pesquisa$")
	public void visualizo_o_filme_como_indisponivel_no_resultado_da_pesquisa() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Então("^visualizo a mensagem Produto não cadastrado$")
	public void visualizo_a_mensagem_Produto_não_cadastrado() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Então("^visualizo todos os produtos cadastrados$")
	public void visualizo_todos_os_produtos_cadastrados() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Então("^visualizo \"([^\"]*)\" filmes no resultado da pesquisa$")
	public void visualizo_filmes_no_resultado_da_pesquisa(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
