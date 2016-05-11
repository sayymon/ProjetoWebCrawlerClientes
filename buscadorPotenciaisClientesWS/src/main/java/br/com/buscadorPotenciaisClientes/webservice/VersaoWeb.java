package br.com.buscadorPotenciaisClientes.webservice;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.commons.lang3.StringUtils;

/**
 * Disponibiliza serviços para Consulta da versão do buscadorPotenciaisClientes gravado na
 * constante.
 * 
 */
@WebService(targetNamespace = "http://webservice.buscadorPotenciaisClientes.impacta.com.br/")
public class VersaoWeb {

	private static final String VERSAO = "Buscados de Clientes Potenciais";

	/**
	 * Consulta da versão do buscadorPotenciaisClientes gravado na constante.
	 * 
	 * @return String - versao
	 */
	@WebMethod
	public String consultarVersaobuscadorPotenciaisClientes() {
		ResourceBundle bundle = ResourceBundle.getBundle("properties/versao");
		String version = bundle.getString("app.version");
		
		if(!StringUtils.isEmpty(version)){
			version = version.replace("-SNAPSHOT", "");
		}else {
			version = StringUtils.EMPTY;
		}
		
		
		return VERSAO + version ;
	}
	
	@WebMethod
	public String propertiesbuscadorPotenciaisClientes(String properties) throws IOException{
		String retorno = " ";
		if("celulabuscadorPotenciaisClientes".equalsIgnoreCase(properties)){
			retorno =  null;//Utils.propertiesbuscadorPotenciaisClientes();
		}else{
			retorno = "indisponivel"; 
		}
		return retorno;
	}
}
