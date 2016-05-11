package br.com.impacta.buscadorPotenciaisClientes.orcamento.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * O Histórico de Integração é composto por um conjunto de informações
 * relacionadas a chamada de um serviço externo feita no buscadorPotenciaisClientes. Essas
 * informações são utilizadas, por exemplo, para gerar métricas, checar o SLA
 * dos serviços e verificar erros de integrações.
 */
@Entity
@Table(name = "ACVMINTHST")
public final class HistoricoIntegracao {

	@Id
	@Column(name = "INTHSTSEQNUM")
	@SequenceGenerator(name = "ACVMINTHST_SEQ", 
				sequenceName = "ACVMINTHST_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACVMINTHST_SEQ")
	private Long identificador;
	
	@Column(name = "SUSCOD")
	private String susep;
	
	@Column(name = "CVNPIRCOD")
	private Integer codigoCliente;
	
	@Column(name = "CLDORCNUM")
	private Long numeroOrcamento;
	
	@Column(name = "PRPDIG")
	private Integer numeroOrigem;
	
	@Column(name = "DCTTIPCOD")
	private Integer tipoDocumento;
	
	@Column(name = "INTSRVCOD")
	private Integer codigoIntegracao;
	
	@Column(name = "INIHORDAT")
	private Date dataHoraInicio;
	
	@Column(name = "INTDURTMPQTD")
	private Integer tempo;
	
	@Column(name = "INTSTTFLG")
	private Integer status;
	
	@Column(name = "MSGTXT")
	private String mensagem;
	
	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getSusep() {
		return susep;
	}

	public void setSusep(String susep) {
		this.susep = susep;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Long getNumeroOrcamento() {
		return numeroOrcamento;
	}

	public void setNumeroOrcamento(Long numeroOrcamento) {
		this.numeroOrcamento = numeroOrcamento;
	}

	public Integer getNumeroOrigem() {
		return numeroOrigem;
	}

	public void setNumeroOrigem(Integer numeroOrigem) {
		this.numeroOrigem = numeroOrigem;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getCodigoIntegracao() {
		return codigoIntegracao;
	}

	public void setCodigoIntegracao(Integer codigoIntegracao) {
		this.codigoIntegracao = codigoIntegracao;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "HistoricoIntegracao [identificador=" + identificador
				+ ", susep=" + susep + ", codigoCliente=" + codigoCliente
				+ ", tipoDocumento=" + tipoDocumento + ", codigoIntegracao="
				+ codigoIntegracao + ", dataHoraInicio=" + dataHoraInicio
				+ ", tempo=" + tempo + ", status=" + status + ", mensagem="
				+ mensagem + "]";
	}
	
}
