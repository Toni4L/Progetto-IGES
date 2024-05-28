package prodottosistema;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GestioneOrdineTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
  System.setProperty("webdriver.chrome.driver", "test/acquistosistema/chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void ordineNonSpedito() throws InterruptedException {
    // Test name: OrdineNonSpedito
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/RAAF-GAMING/servletaccessoadmin | 
    driver.get("http://localhost:8080/RAAF-GAMING/servletaccessoadmin");
   
    driver.findElement(By.id("exampleInputEmail1")).click();
    // 4 | type | id=exampleInputEmail1 | ordine@admin.com
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("ordine@admin.com");
    // 5 | click | id=exampleInputPassword1 | 
    driver.findElement(By.id("exampleInputPassword1")).click();
    // 6 | type | id=exampleInputPassword1 | veloce123
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("veloce123");
    // 7 | click | css=.btn | 
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".btn")).click();
    // 8 | click | id=spedizioneProdotto | 
    Thread.sleep(2000);
    driver.findElement(By.id("spedizioneProdotto")).click();
    // 9 | click | id=consegnaOrdine | 
    Thread.sleep(2000);
    Thread.sleep(2000);
    driver.findElement(By.id("consegnaOrdine")).sendKeys("06-12-2021");
    // 11 | click | css=.ml-3 |
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".ml-3")).click();
    Thread.sleep(5000);
    WebElement input = driver.findElement(By.id("consegnaOrdine"));
    String style= input.getCssValue("border-color");
    assertEquals(style, "rgb(255, 0, 0)");
  }
  @Test
  public void ordineSpedito() throws InterruptedException {
    // Test name: OrdineSpedito
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/RAAF-GAMING/servletaccessoadmin | 
    driver.get("http://localhost:8080/RAAF-GAMING/servletaccessoadmin");
    // 2 | setWindowSize | 945x1020 | 
    driver.manage().window().setSize(new Dimension(945, 1020));
    // 3 | click | id=exampleInputEmail1 | 
    driver.findElement(By.id("exampleInputEmail1")).click();
    // 4 | type | id=exampleInputEmail1 | ordine@admin.com
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("ordine@admin.com");
    Thread.sleep(2000);
    // 5 | click | id=exampleInputPassword1 | 
    driver.findElement(By.id("exampleInputPassword1")).click();
    Thread.sleep(2000);
    // 6 | type | id=exampleInputPassword1 | veloce123
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("veloce123");
    Thread.sleep(2000);
    // 7 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    Thread.sleep(2000);
    // 8 | click | id=spedizioneProdotto | 
    driver.findElement(By.id("spedizioneProdotto")).click();
    Thread.sleep(2000);
    // 9 | click | id=consegnaOrdine | 
    Thread.sleep(2000);
    driver.findElement(By.id("consegnaOrdine")).sendKeys("04/02/2022");
    // 14 | click | css=.ml-3 |
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".ml-3")).click();
    Thread.sleep(2000);
    assertEquals("Ordine spedito con successo!",driver.findElement(By.id("peppe")).getText());
  }
  
}