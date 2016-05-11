package br.com.impacta.buscadorPotenciaisClientes.orcamento.entity;

import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Estrutura da tabela acvminfenvcnvxml
 * 
 * @author Saymon
 * 
 */
@Entity
@Table(name = "acvminfenvcnvxml")
@NamedQuery(name = "XMLTrafegadosbuscadorPotenciaisClientes.obterXml", 
		query = "SELECT a.dadosXML from XMLTrafegadosbuscadorPotenciaisClientes a where a.codigoTransacaoLog = :codigoTransacao")
public class XMLTrafegadosBuscadorPotenciaisClientes {
	
	public static final String OBTER_XML = "XMLTrafegadosbuscadorPotenciaisClientes.obterXml";
	
	@Id
	@Column(name = "envinfcod")
	@SequenceGenerator(name = "acvminfenvcnvxml_seq", 
			sequenceName = "acvminfenvcnvxml_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acvminfenvcnvxml_seq")
	private Integer codigoInformacaoEnviada;

	@Column(name = "wbslogtrncod")
	private BigInteger codigoTransacaoLog;

	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name = "xmlschdad")
	private String dadosXML;

	/**
	 * @return codigoInformacaoEnviada codigoInformacaoEnviada
	 */
	public Integer getCodigoInformacaoEnviada() {
		return codigoInformacaoEnviada;
	}

	/**
	 * @param codigoInformacaoEnviada codigoInformacaoEnviada
	 */
	public void setCodigoInformacaoEnviada(final Integer codigoInformacaoEnviada) {
		this.codigoInformacaoEnviada = codigoInformacaoEnviada;
	}
	
	/**
	 * 
	 * @param codigoTransacaoLog
	 *            - codigoTransacaoLog
	 */
	public void setCodigoTransacaoLog(final BigInteger codigoTransacaoLog) {
		this.codigoTransacaoLog = codigoTransacaoLog;
	}

	/**
	 * 
	 * @return codigoTransacaoLog
	 */
	public BigInteger getCodigoTransacaoLog() {
		return this.codigoTransacaoLog;
	}

	/**
	 * 
	 * @param dadosXML
	 *            - dadosXML
	 */
	public void setDadosXML(final String dadosXML) {
		this.dadosXML = dadosXML;
	}

	/**
	 * 
	 * @return dadosXML
	 */
	public String getDadosXML() {
		return this.dadosXML;
	}

	/**
	 * @return result result
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoInformacaoEnviada == null) ? 0
						: codigoInformacaoEnviada.hashCode());
		return result;
	}

	/**
	 * @param obj obj
	 * @return boolean boolean
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final XMLTrafegadosBuscadorPotenciaisClientes other = (XMLTrafegadosBuscadorPotenciaisClientes) obj;
		if (codigoInformacaoEnviada == null) {
			if (other.codigoInformacaoEnviada != null) {
				return false;
			}
		} else if (!codigoInformacaoEnviada.equals(other.codigoInformacaoEnviada)) {
			return false;
		}
		return true;
	}
}
