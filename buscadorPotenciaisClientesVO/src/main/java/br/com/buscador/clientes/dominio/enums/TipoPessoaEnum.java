/**
 * 
 */
package br.com.buscador.clientes.dominio.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Enum de Tipo Pessoa
 * @author Saymon
 **/
@XmlEnum
public enum TipoPessoaEnum {
	@XmlEnumValue("F")
	FISICA,
	@XmlEnumValue("J")
	JURIDICA;
}

