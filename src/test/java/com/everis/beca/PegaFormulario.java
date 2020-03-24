package com.everis.beca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

// Os exemplos apresentados aqui, não foram aplicados em um cenários real.

// O autor preferiu guardar os métodos para recordar do seu uso em alguma outra atividade.

public class PegaFormulario{

    public void inserirDados(String nome, double valor, String nomeSelect){
        WebDriver chrome = new ChromeDriver();
        WebElement txtNome = chrome.findElement(By.name("name"));
        WebElement txtValor = chrome.findElement(By.name("valor"));

        txtNome.sendKeys(nome);
        txtValor.sendKeys(String.valueOf(valor));

        // Seleção do select
        Select select = new Select(chrome.findElement(By.id("id")));

        // Escolha do nome do select
        select.selectByVisibleText(nomeSelect);

        //Trabalhando com checkbox
        WebElement cb = chrome.findElement(By.xpath("xpathExpression"));
        cb.click();

        // Verificar se existe um elemento na página, mas é necessário aguardar, 
        // considerando ser uma requisição AJAX.
        // Após aguardar retorna true ou false se o dado existir.
        Boolean temUsuario = new WebDriverWait(chrome, 10)
        .until(ExpectedConditions.textToBePresentInElementValue(By.id("id"), "nomedodado"));
        //Submissão do formulário

        // Página aguardar 10 segundos até a proxima execução
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        txtNome.submit();




        

    }
}