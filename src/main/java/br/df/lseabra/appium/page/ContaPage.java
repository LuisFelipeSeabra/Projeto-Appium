package br.df.lseabra.appium.page;

import org.openqa.selenium.By;

import br.df.lseabra.appium.core.BasePage;

public class ContaPage extends BasePage {
	
	public void clicarContas() {
		clicar(By.xpath("//*[@text = 'CONTAS']"));
	}
	public void inserirContas(String valor) {
		preencher(By.xpath("//android.widget.EditText[@text = 'Conta']"), valor);
	}
	public void salvar() {
		clicar(By.xpath("//*[@text = 'SALVAR']"));
	}
	public void excluir() {
		clicar(By.xpath("//*[@text = 'EXCLUIR']"));
	}
	public boolean verificaElementoEmLista(String valor) {
		return verificarElementoEmLista(valor);
	}
	public String verificarMensagemSucesso() {
		return obterTexto(By.xpath("//*[@text = 'Conta adicionada com sucesso']"));
	}
	public String verificarMensagemErro() {
		return obterTexto(By.xpath("//*[@text = 'Problemas de comunicação']"));
	}
	public String verificarMensagemExclusao() {
		return obterTexto(By.xpath("//*[@text = 'Conta excluída com sucesso']"));
	}
	public void cliqueLongo(String valor) {
		cliqueLongo(By.xpath("//*[@text = '"+valor+"']"));
	}
	
}
