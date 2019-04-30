package br.com.fatec.entidadesBD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Funcionario {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdFuncionario;
	
	@OneToOne
	@JoinColumn(name = "id_pessoa")
	private Eleitor eleitor;
	private String cargo;
	private String numeroTituloEleitor;
	private String senha;
	public Funcionario() {}
	private Funcionario(FuncinarioBuilder builder) {
		this.eleitor = builder.eleitor;
		this.cargo = builder.cargo;
		this.numeroTituloEleitor = builder.numeroTituloEleitor;
		this.senha = builder.senha;
	}
	
	public static final class FuncinarioBuilder{
		private String numeroTituloEleitor;
		private Eleitor eleitor;
		private String cargo;
		private String senha;
		
		public FuncinarioBuilder senhaFuncionario(String senha) {
			this.senha = senha;
			return this;
		}
		
		public FuncinarioBuilder numeroTituloEleitor(String numeroTituloEleitor) {
			this.numeroTituloEleitor = numeroTituloEleitor;
			return this;
		}
		
		public FuncinarioBuilder seuCargo(String cargo) {
			this.cargo = cargo;
			return this;
		}
		public FuncinarioBuilder oEleitor(Eleitor eleitor) {
			this.eleitor = eleitor;
			return this;
		}
		public Funcionario Build() {
			return new Funcionario(this); 
		}
		
		
	}
	
	public String getNumeroTituloEleitor() {
		return numeroTituloEleitor;
	}
	public void setNumeroTituloEleitor(String numeroTituloEleitor) {
		this.numeroTituloEleitor = numeroTituloEleitor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Long getIdFuncionario() {
		return IdFuncionario;
	}
	public void setIdFuncionario(Long idFuncionario) {
		IdFuncionario = idFuncionario;
	}
	
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
