package br.df.lseabra.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.df.lseabra.appium.core.BaseTest;
import br.df.lseabra.appium.page.ContaPage;
import br.df.lseabra.appium.page.LoginPage;
import br.df.lseabra.appium.page.MenuPage;

public class ContaTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private ContaPage page = new ContaPage();
	private LoginPage login = new LoginPage();
	
	@Before
	public void acessarAplicacao() {
		menu.acessarAplicacao();
		login.preencherNome("a@a");
		login.preencherSenha("a");
		login.entrar();
	}
	
	@Test
	public void inserirConta() {
		
		//clicar em contas
		page.clicarContas();
		
		//preencher conta
		page.inserirContas("ContaTeste");
		
		//salvar
		page.salvar();
		
		//Verificar conta inserida
		Assert.assertEquals("Conta adicionada com sucesso",page.verificarMensagemSucesso());
		System.out.println(page.verificaElementoEmLista("ContaTeste"));
		Assert.assertTrue(page.verificaElementoEmLista("ContaTeste"));
		
	}

	@Test
	public void inserirContaRepetida() {
		
		//clicar em contas
		page.clicarContas();
		
		//preencher conta
		page.inserirContas("Conta mesmo nome");
		
		//salvar
		page.salvar();
		
		//Verificar conta inserida
		Assert.assertEquals("Problemas de comunicação",page.verificarMensagemErro());
		
		
	}
	@Test
	public void excluirConta() {
		
		//clicar em contas
		page.clicarContas();
		
		//clique longo conta 
		page.cliqueLongo("Conta para alterar");
		
		//clicar em excluir
		page.excluir();
		
		//Verificar msg
		Assert.assertEquals("Conta excluída com sucesso",page.verificarMensagemExclusao());
		
		
	}
}
