//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.28 at 04:22:35 PM BRT 
//


package br.com.buscador.clientes.dominio.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipos de telefone informado
 * 
 * <p>Java class for tipoTelefoneEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoTelefoneEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="11"/>
 *     &lt;enumeration value="996"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoTelefoneEnum", namespace = "http://client.orcamento.multicalculoauto.automovel.porto.com")
@XmlEnum(Integer.class)
public enum TipoTelefoneEnum {


    /**
     * Tipo de telefone informado: Comercial
     * 
     */
    @XmlEnumValue("2")
    COMERCIAL(2),

    /**
     * Tipo de telefone informado: Residencial
     * 
     */
    @XmlEnumValue("3")
    RESIDENCIAL(3),

    /**
     * Tipo de telefone informado: Fax
     * 
     */
    @XmlEnumValue("8")
    FAX(8),

    /**
     * Tipo de telefone informado: Apenas para Recados
     * 
     */
    @XmlEnumValue("10")
    RECADOS(10),

    /**
     * Tipo de telefone informado: Celular
     * 
     */
    @XmlEnumValue("11")
    CELULAR(11);

    private final int value;

    TipoTelefoneEnum(int v) {
        value = v;
    }

    public int value() {
        return value;
    }

    public static TipoTelefoneEnum fromValue(int v) {
        for (TipoTelefoneEnum c: TipoTelefoneEnum.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
