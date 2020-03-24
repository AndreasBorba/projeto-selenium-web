package com.everis.beca;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExemploSelenium {
    static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void testHello() throws Exception {
        // É redirecionado para página solicitada
        driver.get("https://www.google.com");
        // Maximiza o Google Chrome
        driver.manage().window().maximize();

        // Encontra o form e digita everis
        driver.findElement(By.name("q")).sendKeys("everis");
        // Aguarda 2000 milisegundos = 2 segundos
        Thread.sleep(2000);
        // Clica no botão pesquisar
        driver.findElement(By.name("btnK")).click();

        WebElement webTexto1 = driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt i8lZMc']/span"));
        System.out.println("1 - "+webTexto1.getText());

        WebElement webTexto2 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/span[1]/a"));
        System.out.println("2 - "+webTexto2.getText());

        WebElement webTexto3 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/span[2]"));
        System.out.println("3 - "+webTexto3.getText());

        WebElement webTexto4 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[2]/div/div[3]/div/div/span[1]/a"));
        System.out.println("4 - "+webTexto4.getText());

        WebElement webTexto5 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[2]/div/div[3]/div/div/span[2]"));
        System.out.println("5 - "+webTexto5.getText());

        WebElement webTexto6 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/div[1]/a"));
        System.out.println("6 - "+webTexto6.getText());

        WebElement webTexto7 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[3]/div[2]/div[1]/a/div[2]"));
        System.out.println("7 - "+webTexto7.getText());

        WebElement webTexto8 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[3]/div[2]/div[2]/a/div[2]"));
        System.out.println("8 - "+webTexto8.getText());
        
        WebElement webTexto9 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[3]/div[2]/div[3]/a/div[2]"));
        System.out.println("9 - "+webTexto9.getText());

        WebElement webTexto10 = driver.findElement(By.xpath("//*[@id='rhs']/div[1]/div[1]/div[1]/div[1]/div/div[3]/div[2]/div[4]/a/div[2]"));
        System.out.println("10 - "+webTexto10.getText());

        //WebElement webTexto5 = driver.findElement(By.xpath("//*[@id='rhs'/div[1]/div[1]/div[1]/div[1]/div/div[2]/div/div[3]/div/div/span[2]"));
        //System.out.print("5 - "+webTexto5.getText());
        
        // driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[1]/a/h3")).click();;
        
        // Declara que vai utilizar o Javascript para mover a página.
        // JavascriptExecutor js = (JavascriptExecutor) driver;

        // Utiliza o for e o Javascript para descer a pagina.
        // A cada iteração, ele desce 30px.
        // for (int i = 0; i <= 60; i++) {
        //    js.executeScript("window.scrollBy(0,30)", "");
        //    Thread.sleep(150);
        // }

        // assertTrue("O corpo do documento deve conter o texto 'Pesquisa'",
        // driver.getPageSource().contains("Pesquisa"));
    }

    @AfterClass
    public static void quitDriver() throws Exception {
        // SimpleDateFormat formatoDeData = new SimpleDateFormat("ddMMyyyy-HHmmss-SSS");
        // String fileName = formatoDeData.format(new Date());
        // System.out.println(fileName);
        // String shotName = String.format("%s.png", fileName);
        // File finalShotFile = new File("screenshotDir", shotName);
        // File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(shotFile, finalShotFile);
        // Thread.sleep(2000);
         driver.quit();
    }
}
