/**
 * 
 */
package br.com.buscador.clientes.dominio.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author user
 *
 */
@XmlEnum(Integer.class)
public enum TipoContatoEnum {
	@XmlEnumValue("1")
	EMAIL,
	@XmlEnumValue("2")
	TELEFONE;
}
