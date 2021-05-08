package br.df.lseabra.appium.core;

import java.util.List;

import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;






public class BasePage {
	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
		
	}
	public void cliqueLongo(By by) {
		new TouchAction(DriverFactory.getDriver()).longPress(DriverFactory.getDriver().findElement(by)).perform();
		
	}
	public void preencher(By by,String valor) {
		DriverFactory.getDriver().findElement(by).sendKeys(valor);
	}
	
	public String obterTexto(By by) {
		try {
			return DriverFactory.getDriver().findElement(by).getText();
			
		} catch (Exception e) {
			// TODO: handle exception
			return "Não encontrou elemento";
		}
	}
	public boolean verificarElementoEmLista(String valor) {
		List<MobileElement> elementos = DriverFactory.getDriver().findElements(By.xpath("//android.widget.TextView[@text = '"+valor+"']"));
		return elementos.size()>0;
	}

	
}
