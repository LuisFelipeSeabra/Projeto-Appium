package br.df.lseabra.appium.page;

import org.openqa.selenium.By;

import br.df.lseabra.appium.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarAplicacao() {
		clicar(By.xpath("//*[@text = 'SeuBarriga Nativo']"));
		
	}

}
