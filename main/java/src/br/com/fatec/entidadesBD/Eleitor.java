package br.com.fatec.entidadesBD;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Eleitor{
	@OneToOne
	@JoinColumn(name = "id_pessoa")
	private Pessoas pessoa;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEleitor;
	@OneToOne
	private Zona zona;
	@OneToOne
	private SecaoEleitoral secaoEleitoral;
	private String numeroTituloEleitor;
	private Date dataEmissao;
	private String senha;
	private int votou;
	
	public Eleitor() {}

	private Eleitor(EleitorBuilder builder) {
		this.numeroTituloEleitor = builder.numeroTituloEleitor;
		this.pessoa = builder.pessoa;
		this.senha = builder.senha;
		this.zona = builder.zona;
		this.secaoEleitoral = builder.secaoEleitoral;
		this.dataEmissao = builder.dataEmissao;
		this.votou = 1;
	}

	public static final class EleitorBuilder {
		private String numeroTituloEleitor;
		private String senha;
		private Pessoas pessoa;
		private Zona zona;
		private SecaoEleitoral secaoEleitoral;
		private Date dataEmissao;
		
		public EleitorBuilder numeroSenha(String senha) {
			this.senha = senha;
			return this;
		}
		
		public EleitorBuilder numeroDoTitulo(String numeroTituloEleitor) {
			this.numeroTituloEleitor = numeroTituloEleitor;
			return this;
		}
		public EleitorBuilder idPessoaNovoEleitor(Pessoas pessoa) {
			this.pessoa = pessoa;
			return this;
		}
		
		public EleitorBuilder numeroZonaEleitoral(Zona zona) {
			this.zona = zona;
			return this;
		}

		public EleitorBuilder numeroSecaoEleitoral(SecaoEleitoral secaoEleitoral) {
			this.secaoEleitoral = secaoEleitoral;
			return this;
		}

		public EleitorBuilder dataEmissaoTitulo(Date data) {
			this.dataEmissao = data;
			return this;
		}

		public Eleitor Build() {
			return new Eleitor(this);
		}

	}
	
	
	public int getVotou() {
		return votou;
	}

	public void setVotou(int votou) {
		this.votou = votou;
	}

	public Long getIdEleitor() {
		return idEleitor;
	}

	public void setIdEleitor(Long idEleitor) {
		this.idEleitor = idEleitor;
	}

	public void setNumeroTituloEleitor(String numeroTituloEleitor) {
		this.numeroTituloEleitor = numeroTituloEleitor;
	}

	public String getNumeroTituloEleitor() {
		return numeroTituloEleitor;
	}

	public  String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoas getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoas pessoa) {
		this.pessoa = pessoa;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public SecaoEleitoral getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(SecaoEleitoral secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}

