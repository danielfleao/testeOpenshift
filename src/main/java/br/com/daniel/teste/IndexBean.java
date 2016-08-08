package br.com.daniel.teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class IndexBean {

	private String resposta;

	
	public String acao(){
		resposta = "Acionou";
		return null;
	}
	
	public String getResposta() {return resposta;}
	public void setResposta(String resposta) {this.resposta = resposta;}
}
