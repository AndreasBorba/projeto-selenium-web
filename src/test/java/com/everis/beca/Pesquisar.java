package com.everis.beca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Pesquisar{
    
    private WebDriver driver;
    private String enderecoDoSite;
    
    public Pesquisar(WebDriver driver, String enderoSite){
        this.driver = driver;
        this.enderecoDoSite = enderoSite;
    }

    public SubPesquisa iniciarPesquisa(String nomeDaPesquisa){
        driver.get(this.enderecoDoSite);
        WebElement form = this.driver.findElement(By.name("q"));
        form.sendKeys(nomeDaPesquisa);
        form.submit();
        return new SubPesquisa(driver); 
    }
    
    public void fecharNavegador(){
        this.driver.quit();
    }

}