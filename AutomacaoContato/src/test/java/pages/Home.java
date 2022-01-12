package pages;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Home {
	
	Metodos metodos = new Metodos();
	ElementosWeb elemento = new ElementosWeb();

	@Given("que eu esteja no site da BenFatto {string}")
	public void que_eu_esteja_no_site_da_ben_fatto(String site) {
		metodos.abrirNavegador("FIREFOX", site);
	}
	@When("clico no contato")
	public void clico_no_contato() {
		metodos.clicar(elemento.getBtnContato());
	}
	@When("preencho o nome {string}")
	public void preencho_o_nome(String nome) {
		metodos.escrever(elemento.getCampoNome(), nome);
	}
	@When("preencho o empresa {string}")
	public void preencho_o_empresa(String empresa) {
		metodos.escrever(elemento.getCampoEmpresa(), empresa);
	}
	@When("preencho o email {string}")
	public void preencho_o_email(String email) {
		metodos.escrever(elemento.getCampoEmail(), email);
	}
	@When("preencho o telefone {string}")
	public void preencho_o_telefone(String telefone) {
		metodos.escrever(elemento.getCampoTelefone(), telefone);
	}
	@When("preencho a mensagem {string}")
	public void preencho_a_mensagem(String mensagem) {
		metodos.escrever(elemento.getCampoMensagem(), mensagem);
	}
	@When("clico em enviar")
	public void clico_em_enviar() {
		metodos.clicar(elemento.getBtnEnviar());
	}
	@Then("sistema exibe mensagem de sucesso")
	public void sistema_exibe_mensagem_de_sucesso() {
		metodos.validarMensagem(elemento.getMensagemContato(), "Mensagem enviada. Em breve entraremos em contato.");
		metodos.fecharNavegador();
	}
	@Then("sistema exibe mensagens para preenchimento dos campos")
	public void sistema_exibe_mensagens_para_preenchimento_dos_campos() {
		metodos.fecharNavegador();
	}
}