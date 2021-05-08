package br.df.lseabra.appium.page;

import org.openqa.selenium.By;

import br.df.lseabra.appium.core.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void acessarMov() {
		clicar(By.xpath("//*[@text = 'MOV...']"));
	}
	public void inserirDescricao(String valor) {
		preencher(By.xpath("//*[@text = 'Descrição']"), valor);
	}
	public void inserirInteressado(String valor) {
		preencher(By.xpath("//*[@text = 'Interessado']"), valor);
	}
	public void inserirValor(String valor) {
		preencher(By.xpath("//*[@text = 'Valor']"), valor);
	}
	public void selecionarConta(String valor) {
		clicar(By.xpath("//android.widget.Spinner[2]/android.widget.TextView[@resource-id = 'android:id/text1']"));
		clicar(By.xpath("//*[@text = 'Conta para movimentacoes']"));
	}
	public void salvar() {
		clicar(By.xpath("//*[@text = 'SALVAR']"));
	}
	public String obterMensagem() {
		return obterTexto(By.xpath("//*[@index = '11']"));
	}
}
