package br.com.buscadorPotenciaisClientes.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Classe para o serviço de cálculo
 * 
 * @author Saymon
 * 
 */
@WebService(targetNamespace = "http://webservice.buscadorPotenciaisClientes.impacta.com.br/")
public class CalculoSeguroWeb {

	
	/**
	 * 
	 * @param String de entrada
	 * 
	 * @return String de Saida
	 */
	@WebMethod
	public @WebResult(name = "resultado")
	String buscarClientes(@WebParam(name = "solicitacao") final String orcamento) {
		return "Teste de Resultado";
	}
	
}
