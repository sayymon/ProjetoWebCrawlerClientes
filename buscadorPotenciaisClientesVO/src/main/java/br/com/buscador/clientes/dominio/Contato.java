/**
 * 
 */
package br.com.buscador.clientes.dominio;

import br.com.buscador.clientes.dominio.enums.TipoContatoEnum;

/**
 * Classe de Tipo Contato
 * 
 * @author Saymon
 *
 */
public abstract class Contato {
	protected TipoContatoEnum tipoContato;

	/**
	 * @return the tipoContato
	 */
	public TipoContatoEnum getTipoContato() {
		return tipoContato;
	}

	/**
	 * @param tipoContato the tipoContato to set
	 */
	public void setTipoContato(final TipoContatoEnum tipoContato) {
		this.tipoContato = tipoContato;
	}
	
	
}
