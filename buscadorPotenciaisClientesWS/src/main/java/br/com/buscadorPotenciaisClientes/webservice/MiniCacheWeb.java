package br.com.buscadorPotenciaisClientes.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Disponibiliza servi�os para inicializa��o do minicache ou habilita��o de todos os projeto
 * 
 * @author Saymon
 * 
 */
@WebService(targetNamespace = "http://webservice.buscadorPotenciaisClientes.impacta.com.br/")
public class MiniCacheWeb {

	/**
	 * 
	 * Inicializa��o do MiniCache
	 * 
	 * @return String - Mensagem de sucesso ou erro na inicializa��o
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
