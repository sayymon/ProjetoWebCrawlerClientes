package br.com.buscador.clientes.dominio;

import java.util.List;

import br.com.buscador.clientes.dominio.enums.EstadoCivilEnum;
import br.com.buscador.clientes.dominio.enums.SexoEnum;
import br.com.buscador.clientes.dominio.enums.TipoPessoaEnum;

public class DadosPessoais {
	private TipoPessoaEnum tipoPessoa;
	private SexoEnum sexo;
	private EstadoCivilEnum estadoCivil;
	private List<Contato> contatos;
	private Endereco endereco;

	public DadosPessoais() {
	}

	public TipoPessoaEnum getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
}