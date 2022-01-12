package metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {

	WebDriver driver;
	
	/**
	 * Metodo para abrir um navegador
	 * @author alefernandesilva
	 */
	public void abrirNavegador(String navegador, String site) {
		try {
			if(navegador.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(navegador.equalsIgnoreCase("EDGE")) {
				System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			} else if(navegador.equalsIgnoreCase("FIREFOX")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Navegador inválido");
			}
		} catch (Exception e) {
			System.out.println("*****----- erro ao abrir navegador -----*****" + e.getMessage());
			System.out.println("*****----- causa do erro -----*****" + e.getCause());
		}
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	/**
	 * Metodo para escrever em um elemento
	 * @author alefernandesilva
	 */
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("*****----- erro ao escrever no elemento -----*****" + e.getMessage());
			System.out.println("*****----- causa do erro -----*****" + e.getCause());
		}
		
	}
	/**
	 * Metodo para abrir clicar em um elemento
	 * @author alefernandesilv
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("*****----- erro ao clicar no elemento -----*****" + e.getMessage());
			System.out.println("*****----- causa do erro -----*****" + e.getCause());
		}
		
	}
	/**
	 * Metodo para validar mensagem
	 * @author alefernandesilva
	 */
	public void validarMensagem(By elemento, String msgEsperada) {
		try {
			String msgAtual = driver.findElement(elemento).getText();
			assertEquals(msgEsperada, msgAtual);
			System.out.println("Msg Capturada: " + msgAtual);
		} catch (Exception e) {
			System.out.println("*****----- erro ao validar mensagem -----*****" + e.getMessage());
			System.out.println("*****----- causa do erro -----*****" + e.getCause());
		}
	}
	/**
	 * Método para fechar todas as abas do navegador
	 * @author alefernandesilva
	 */
	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("-------- erro ao fechar navegador -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());	
		}
	}
}
