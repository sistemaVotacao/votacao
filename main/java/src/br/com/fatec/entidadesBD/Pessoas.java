package br.com.fatec.entidadesBD;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Pessoas {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne
	private Municipio municipio;
	@OneToOne
	private UF uf;
	private Date dataNascimento;
	public Pessoas() {}
	private Pessoas(PessoaBuilder builder) {
		this.nome = builder.nome;
		this.municipio = builder.municipio;
		this.uf = builder.uf;
		this.dataNascimento = builder.dataNascimento;
	}
	
	public static final class PessoaBuilder{
		private String nome;
		private Municipio municipio;
		private UF uf;
		private Date dataNascimento;

		public PessoaBuilder chamado(String nome) {
			this.nome = nome;
			return this;
		}
		public PessoaBuilder doMunicipio(Municipio municipio) {
			this.municipio = municipio;
			return this;
		}
		public PessoaBuilder doEstado(UF uf) {
			this.uf = uf;
			return this;
		}
		public PessoaBuilder dataDeNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
			return this;
		}
		public Pessoas build() {
			return new Pessoas(this);
		}
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public UF getUF() {
		return uf;
	}
	public void setUF(UF uf) {
		this.uf = uf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
