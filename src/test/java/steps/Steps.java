package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;


	
public class Steps {
	
	ElementosWeb el = new ElementosWeb();
	Metodos met = new Metodos();
	
	
	@Dado("que eu eseja na pagina {string}")
	public void que_eu_eseja_na_pagina(String url) {

		met.abrir(url);
		
	}

	@Quando("preencho o formuario")
	public void preencho_o_formuario() throws IOException, Throwable {
		
		met.escrever("Robson dos Santos", el.getNome() );
		met.evidencia("nome");
		Thread.sleep(2000);
		met.escrever("robsonrsc.stos@gmail.com", el.getEmail());
		met.evidencia("email");
		Thread.sleep(2000);
		met.escrever("Validando informações", el.getMensagem());
		met.evidencia("mensagem");
		
	}

	@Entao("valido as informacoes")
	public void valido_as_informacoes() {

		met.title("Robson Testes UI");
		met.fechar();
	}

}
