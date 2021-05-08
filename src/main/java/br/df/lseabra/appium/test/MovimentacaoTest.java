package br.df.lseabra.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.df.lseabra.appium.core.BaseTest;
import br.df.lseabra.appium.page.LoginPage;
import br.df.lseabra.appium.page.MenuPage;
import br.df.lseabra.appium.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private MovimentacaoPage page = new MovimentacaoPage();
	private LoginPage login = new LoginPage();
	
	@Before
	public void Init() {
		menu.acessarAplicacao();
		login.preencherNome("a@a");
		login.preencherSenha("a");
		login.entrar();
		
	}
	
	@Test
	public void deveValidarDescricao() {
		page.acessarMov();
		page.inserirDescricao("felipe");
		page.salvar();
		
		Assert.assertEquals("Interessado é um campo obrigatório", page.obterMensagem());

	}
	@Test
	public void deveValidarInteressado() {
		page.acessarMov();
		page.inserirDescricao("felipe");
		page.inserirInteressado("Luis");
		page.salvar();
		
		Assert.assertEquals("Valor é um campo obrigatório", page.obterMensagem());

		
	}
	@Test
	public void deveValidarValor() {
		page.acessarMov();
		page.inserirDescricao("felipe");
		page.inserirInteressado("Luis");
		page.inserirValor("123");
		page.salvar();
		
		Assert.assertEquals("Conta é um campo obrigatório", page.obterMensagem());
		
	}
	@Test
	public void inserirMovimentacao() {
		page.acessarMov();
		page.inserirDescricao("felipe");
		page.inserirInteressado("Luis");
		page.inserirValor("123");
		page.selecionarConta("Conta para movimentacoes");
		page.salvar();
		
		Assert.assertEquals("Movimentação cadastrada com sucesso", page.obterMensagem());
		
	}
}
