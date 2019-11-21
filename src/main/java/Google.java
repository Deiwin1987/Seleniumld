import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
public class Google {

    public static WebDriver driver;
    public void abrirNavegador(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com.co");
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
    }
    public void buscar(){
        WebElement buscar;
        buscar = driver.findElement(By.xpath("//input[@class= 'gLFyf gsfi' ]"));
        buscar.sendKeys("Medellin\n");
    }
    public void buscarWikipedia(){
        WebElement wiki;
        wiki = driver.findElement(By.xpath("//cite[@class= 'iUh30 bc']"));
        wiki.click();

        WebElement llamarTe;
        llamarTe = driver.findElement(By.xpath("//h1[@id= 'firstHeading']"));
        System.out.println(llamarTe.getText());
        if(llamarTe.getText().equalsIgnoreCase("Medellín")){
            System.out.println("Es igual a Medellín");
        } else {
            System.out.println("No es igual a Medellín");
        }
    }

    public void extcepcion(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement buscarInfo;
        buscarInfo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type = 'search']")));
        buscarInfo.sendKeys("Esto es una prueba");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void close(){
        driver.close();
        System.out.println("Fin de la Prueba");
    }
}
