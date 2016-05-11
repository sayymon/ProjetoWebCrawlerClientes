package br.com.buscadorPotenciaisClientes.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Disponibiliza serviços para inicialização do minicache ou habilitação de todos os projeto
 * 
 * @author Saymon
 * 
 */
@WebService(targetNamespace = "http://webservice.buscadorPotenciaisClientes.impacta.com.br/")
public class MiniCacheWeb {

	/**
	 * 
	 * Inicialização do MiniCache
	 * 
	 * @return String - Mensagem de sucesso ou erro na inicialização
	 */
	@WebMethod
	public String inicializarMiniCache() {
		return null;//this.miniCache.inicializarMiniCache();
	}

	/**
	 * Habilita todos os projetos
	 * @return string string
	 */
	@WebMethod
	public String habilitarTodosProjetos() {
		return null;//this.miniCache.habilitarTodosProjetos();
	}

}
