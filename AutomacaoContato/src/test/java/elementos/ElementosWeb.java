package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	private By btnContato = By.id("menu-1-439e4cce");
	//private By btnContato = By.className("\"elementor-item elementor-item-anchor __mPS2id _mPS2id-h mPS2id-clicked\"");
	private By campoNome = By.id("form-field-nome");
	private By campoEmpresa = By.id("form-field-empresa");
	private By campoEmail = By.id("form-field-email");
	private By campoTelefone = By.id("form-field-telefone");
	private By campoMensagem = By.id("form-field-mensagem");
	private By btnEnviar = By.xpath("//*[@id=\"contato\"]/div[2]/div/div[2]/div/div/div[3]/div/form/div/div[6]/button/span/span[2]");
	private By mensagemContato = By.cssSelector("#contato > div.elementor-container.elementor-column-gap-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-97ebccb > div > div > div.elementor-element.elementor-element-a36765e.elementor-button-align-start.elementor-mobile-button-align-stretch.elementor-tablet-button-align-stretch.elementor-widget.elementor-widget-form > div > form > div.elementor-message.elementor-message-success");
	
	public By getBtnContato() {
		return btnContato;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoEmpresa() {
		return campoEmpresa;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoMensagem() {
		return campoMensagem;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	public By getMensagemContato() {
		return mensagemContato;
	}
}