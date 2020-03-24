package com.everis.beca;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SubPesquisa{

    private WebDriver driver;

    public SubPesquisa(WebDriver driver){
        this.driver = driver;
    }

    public void scrollPagina() throws Exception{
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        for(int i = 0; i <= 60; i++){
            js.executeScript("window.scrollBy(0,30)", "");
            Thread.sleep(150);
        }
    }

    public boolean eUmPesquisa(String nomeDaPesquisa, String nomeDoSite){
        return this.driver.getPageSource().contains(nomeDaPesquisa) &&
        this.driver.getPageSource().contains(nomeDoSite);
    }


}