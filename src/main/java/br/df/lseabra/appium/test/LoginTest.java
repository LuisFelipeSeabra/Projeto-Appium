package br.df.lseabra.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.df.lseabra.appium.core.BaseTest;
import br.df.lseabra.appium.page.LoginPage;
import br.df.lseabra.appium.page.MenuPage;


public class LoginTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private LoginPage page = new LoginPage();
	
	@Test
	public void login() {
		//clicar menu
		menu.acessarAplicacao();
		//preencher nome
		page.preencherNome("a@a");
		
		//preencher senha
		page.preencherSenha("a");
		
		//clicar entrar
		page.entrar();
		
		//verificar se entrou
		Assert.assertEquals("HOME", page.obterTexto("HOME"));
		
	}
	
	
	
	
}
