package br.df.lseabra.appium.page;

import org.openqa.selenium.By;

import br.df.lseabra.appium.core.BasePage;

public class LoginPage extends BasePage{
	
	
	public void preencherNome(String valor) {
		preencher(By.xpath("//android.widget.EditText[@text = 'Nome']"), valor);
	}
	public void preencherSenha(String valor) {
		preencher(By.xpath("//android.widget.EditText[@text = 'Senha']"), valor);
	}
	public void entrar() {
		clicar(By.xpath("//*[@text = 'ENTRAR']"));
		
	}
	public String obterTexto(String valor) {
		return obterTexto(By.xpath("//android.widget.TextView[@text = '"+valor+"']"));
		
	}
	
	

}
