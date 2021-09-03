package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By nome = By.name("nome_usuario");
	private By email = By.name("email_usuario");
	private By mensagem = By.name("user_msg");
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getMensagem() {
		return mensagem;
	}
	public By getBotao() {
		return botao;
	}
	private By botao = By.xpath("/html/body/form/div[4]/button/a");
	
	

}
