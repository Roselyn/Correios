package com.correios.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Steps {
	
	private WebDriver driver;
	
	@Dado("que esteja na tela inicial")
	public void que_esteja_na_tela_inicial() {
	    
		driver = new ChromeDriver();
        driver.get("http://www.correios.com.br/");
        driver.manage().window().maximize();
        
	}

	@Quando("eu pesquisar um {string}")
	public void eu_pesquisar_um_CEP(String cep1) {
	    
		driver.findElement(By.id("acesso-busca")).sendKeys(cep1);
		driver.findElement(By.id("acesso-busca")).sendKeys(Keys.ENTER);
	}

	@Então("os resultados com os CEPs será exibido")
	@Então("o resultado com o nome da Rua será exibido")
	public void o_resultado_com_o_nome_da_Rua_será_exibido() {
		
		driver.getWindowHandle();
		driver.findElement(By.linkText("Busca CEP - Endereço")).getText();
	}
}
