package rtstreinamento.turmajunho;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
	
	Login login;
	
	String EMAIL_VALIDO = "joao@gmail.com";
	String EMAIL_INVALIDO = "maria@gmail.com";
	String SENHA_VALIDA = "12345678";
	String SENHA_INVALIDA = "87654321";
	String SENHA_MENOR_8_CARACTERES = "1234567";
	String SENHA_MENOR_10_CARACTERES = "1234567891011";
	
	@Before
	public void antesDoTeste() {
		login = new Login();
	}
	
	@Test
	public void efetuarLoginComSucesso() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO, SENHA_VALIDA);
		Assert.assertTrue(resultadoAtual);
	}
	
	@Test
	public void naoEfetuarLoginComEmailInexistente() {
		boolean resultadoAtual = login.autenticar(EMAIL_INVALIDO, SENHA_VALIDA);
		Assert.assertFalse(resultadoAtual);
	}
	
	@Test
	public void naoEfetuarLoginComSenhaInvalida() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO, SENHA_INVALIDA);
		Assert.assertFalse(resultadoAtual);
	}
	
	@Test
	public void naoEfetuarLoginComEmailVazio() {
		boolean resultadoAtual = login.autenticar(null, SENHA_VALIDA);
		Assert.assertFalse(resultadoAtual);
	}
	
	@Test
	public void naoEfeturarLoginComSenhaComTamanhoMenor8Caracteres() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO, SENHA_MENOR_8_CARACTERES);
		Assert.assertFalse(resultadoAtual);
	}
	
	@Test
	public void naoEfeturarLoginComSenhaComTamanhoMaior10Caracteres() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO, SENHA_MENOR_10_CARACTERES);
		Assert.assertFalse(resultadoAtual);
	}

}
