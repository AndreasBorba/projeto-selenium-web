package com.everis.beca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Teste{

    private Pesquisar p;


    @Before
    public void iniciarTeste(){
        WebDriver chrome = new ChromeDriver();
        this.p = new Pesquisar(chrome, "https://www.google.com");
    }

    @Test
    public void testar() throws Exception {
        p.iniciarPesquisa("Andreas Borba").scrollPagina();
        p.iniciarPesquisa("Grand Theft Auto San Andreas").scrollPagina();
    }

    @After
    public void finalizarTeste(){
        p.fecharNavegador();
    }


}