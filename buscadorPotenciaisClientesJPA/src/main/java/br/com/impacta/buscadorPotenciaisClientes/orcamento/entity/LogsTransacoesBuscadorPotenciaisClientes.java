package br.com.impacta.buscadorPotenciaisClientes.orcamento.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Estrutura da tabela Acvmcnvwbslogtrn
 * 
 * @author Saymon
 * 
 */
@Entity
@Table(name = "acvmcnvwbslogtrn")
@NamedQueries({
	
	@NamedQuery(name = LogsTransacoesBuscadorPotenciaisClientes.OBTER_TRANSACAO_NEW,
			query = "SELECT a FROM LogsTransacoesbuscadorPotenciaisClientes a "
					+"WHERE a.numeroDigitoProposta = :prpnumdig AND a.codigoServicoConvenio = :cnvsrvcod AND a.dataTermino in "
					+ "(SELECT MAX(a.dataTermino) FROM LogsTransacoesbuscadorPotenciaisClientes a "
					+   "WHERE a.numeroDigitoProposta = :prpnumdig AND a.codigoServicoConvenio = :cnvsrvcod)")

	
})
public class LogsTransacoesBuscadorPotenciaisClientes implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String OBTER_TRANSACAO = "LogsTransacoesbuscadorPotenciaisClientes.obterTransacao";
	public static final String MAX_CODIGO_TRANSACAO = "LogsTransacoesbuscadorPotenciaisClientes.obterMaxCodigoTransacaoLog";
	public static final String OBTER_TRANSACAO_NEW = "LogsTransacoesbuscadorPotenciaisClientes.obterTransacaoNew";
	
	@Id
	@Column(name = "wbslogtrncod")
	@SequenceGenerator(name = "acvmcnvwbslogtrn_trngrpcod_seq", 
			sequenceName = "acvmcnvwbslogtrn_trngrpcod_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acvmcnvwbslogtrn_trngrpcod_seq")
	private BigInteger codigoTransacaoLog;

	@Column(name = "trngrpcod")
	private BigInteger codigoGrupoTransacao;

	@Column(name = "corsus")
	private String susepCorretor;

	@Column(name = "inidat")
	private Date dataInicio;

	@Column(name = "cnvprccod")
	private BigInteger codigoParceiroConvenio;

	@Column(name = "fimdat")
	private Date dataTermino;

	@Column(name = "prporg")
	private Short origemProposta;

	@Column(name = "prpnumdig")
	private Integer numeroDigitoProposta;

	@Column(name = "cnvsrvcod")
	private BigInteger codigoServicoConvenio;

	@Column(name = "ppwprpnum")
	private BigInteger numeroPropostaPPW;

	@Column(name = "azlprpnumdig")
	private String numeroDigitoPropostaAzul;

	@Column(name = "trnstt")
	private String statusTransacao;

	@Column(name = "prcincdat")
	private Date dataInicioProcesso;

	@Column(name = "paddscflg")
	private String flagDescontoPadrao;

	@Column(name = "prcorcnum")
	private BigInteger numeroOrcamentoParceiro;
	
	/**
	 * @param codigoTransacaoLog codigoTransacaoLog
	 */
	public void setCodigoTransacaoLog(final BigInteger codigoTransacaoLog) {
		this.codigoTransacaoLog = codigoTransacaoLog;
	}

	/**
	 * @return codigoTransacaoLog codigoTransacaoLog
	 */
	public BigInteger getCodigoTransacaoLog() {
		return codigoTransacaoLog;
	}

	/**
	 * Código do Grupo Transação
	 * 
	 * @return codigoGrupoTransacao
	 */
	public BigInteger getCodigoGrupoTransacao() {
		return this.codigoGrupoTransacao;
	}

	/**
	 * 
	 * @param codigoGrupoTransacao
	 *            - Código do Grupo Transação
	 */
	public void setCodigoGrupoTransacao(final BigInteger codigoGrupoTransacao) {
		this.codigoGrupoTransacao = codigoGrupoTransacao;
	}

	/**
	 * Corretor
	 * 
	 * @return susepCorretor susepCorretor
	 */
	public String getSusepCorretor() {
		return this.susepCorretor;
	}

	/**
	 * 
	 * @param susepCorretor susepCorretor
	 */
	public void setSusepCorretor(final String susepCorretor) {
		this.susepCorretor = susepCorretor;
	}

	/**
	 * 
	 * @return dataInicio
	 */
	public Date getDataInicio() {
		return this.dataInicio;
	}

	/**
	 * dataInicio
	 * 
	 * @param dataInicio
	 *            - dataInicio
	 */
	public void setDataInicio(final Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * codigoParceiroConvenio
	 * 
	 * @return codigoParceiroConvenio - codigoParceiroConvenio
	 */
	public BigInteger getCodigoParceiroConvenio() {
		return this.codigoParceiroConvenio;
	}

	/**
	 * 
	 * @param codigoParceiroConvenio
	 *            - codigoParceiroConvenio
	 */
	public void setCodigoParceiroConvenio(final BigInteger codigoParceiroConvenio) {
		this.codigoParceiroConvenio = codigoParceiroConvenio;
	}

	/**
	 * 
	 * @return dataTermino - dataTermino
	 */
	public Date getDataTermino() {
		return this.dataTermino;
	}

	/**
	 * 
	 * @param dataTermino
	 *            - dataTermino
	 */
	public void setDataTermino(final Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	/**
	 * 
	 * @return origemProposta
	 */
	public Short getOrigemProposta() {
		return this.origemProposta;
	}

	/**
	 * 
	 * @param origemProposta
	 *            - origemProposta
	 */
	public void setOrigemProposta(final Short origemProposta) {
		this.origemProposta = origemProposta;
	}

	/**
	 * 
	 * @return numeroDigitoProposta
	 */
	public Integer getNumeroDigitoProposta() {
		return this.numeroDigitoProposta;
	}

	/**
	 * 
	 * @param numeroDigitoProposta
	 *            - numeroDigitoProposta
	 */
	public void setNumeroDigitoProposta(final Integer numeroDigitoProposta) {
		this.numeroDigitoProposta = numeroDigitoProposta;
	}

	/**
	 * 
	 * @return codigoServicoConvenio
	 */
	public BigInteger getCodigoServicoConvenio() {
		return this.codigoServicoConvenio;
	}

	/**
	 * 
	 * @param codigoServicoConvenio
	 *            - codigoServicoConvenio
	 */
	public void setCodigoServicoConvenio(final BigInteger codigoServicoConvenio) {
		this.codigoServicoConvenio = codigoServicoConvenio;
	}

	/**
	 * 
	 * @return numeroPropostaPPW
	 */
	public BigInteger getNumeroPropostaPPW() {
		return this.numeroPropostaPPW;
	}

	/**
	 * 
	 * @param numeroPropostaPPW
	 *            - numeroPropostaPPW
	 */
	public void setNumeroPropostaPPW(final BigInteger numeroPropostaPPW) {
		this.numeroPropostaPPW = numeroPropostaPPW;
	}

	/**
	 * 
	 * @return numeroDigitoPropostaAzul
	 */
	public String getNumeroDigitoPropostaAzul() {
		return this.numeroDigitoPropostaAzul;
	}

	/**
	 * 
	 * @param numeroDigitoPropostaAzul
	 *            - numeroDigitoPropostaAzul
	 */
	public void setNumeroDigitoPropostaAzul(final String numeroDigitoPropostaAzul) {
		this.numeroDigitoPropostaAzul = numeroDigitoPropostaAzul;
	}

	/**
	 * 
	 * @return statusTransacao
	 */
	public String getStatusTransacao() {
		return this.statusTransacao;
	}

	/**
	 * 
	 * @param statusTransacao
	 *            - statusTransacao
	 */
	public void setStatusTransacao(final String statusTransacao) {
		this.statusTransacao = statusTransacao;
	}

	/**
	 * 
	 * @return dataInicioProcesso
	 */
	public Date getDataInicioProcesso() {
		return this.dataInicioProcesso;
	}

	/**
	 * 
	 * @param dataInicioProcesso
	 *            - dataInicioProcesso
	 */
	public void setDataInicioProcesso(final Date dataInicioProcesso) {
		this.dataInicioProcesso = dataInicioProcesso;
	}

	/**
	 * 
	 * @return flagDescontoPadrao
	 */
	public String getFlagDescontoPadrao() {
		return this.flagDescontoPadrao;
	}

	/**
	 * 
	 * @param flagDescontoPadrao
	 *            - flagDescontoPadrao
	 */
	public void setFlagDescontoPadrao(final String flagDescontoPadrao) {
		this.flagDescontoPadrao = flagDescontoPadrao;
	}

	/**
	 * 
	 * @return numeroOrcamentoParceiro
	 */
	public BigInteger getNumeroOrcamentoParceiro() {
		return this.numeroOrcamentoParceiro;
	}

	/**
	 * 
	 * @param numeroOrcamentoParceiro
	 *            - numeroOrcamentoParceiro
	 */
	public void setNumeroOrcamentoParceiro(final BigInteger numeroOrcamentoParceiro) {
		this.numeroOrcamentoParceiro = numeroOrcamentoParceiro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoTransacaoLog == null) ? 0 : codigoTransacaoLog
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogsTransacoesBuscadorPotenciaisClientes other = (LogsTransacoesBuscadorPotenciaisClientes) obj;
		if (codigoTransacaoLog == null) {
			if (other.codigoTransacaoLog != null)
				return false;
		} else if (!codigoTransacaoLog.equals(other.codigoTransacaoLog))
			return false;
		return true;
	}
}
