package br.com.fatec.DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.fatec.connectors.ConnectionFactory;
import br.com.fatec.entidadesBD.Eleitor;
import br.com.fatec.entidadesBD.Funcionario;

public class ContatoDAO {
	private Session session;
	private SessionFactory sessionFactory;

	public ContatoDAO() {
		this.sessionFactory = new ConnectionFactory().getConnection();
	}

	public Eleitor getEleitor(String numeroTituloEleitor) throws Exception {
		Eleitor eleitor;
		int i = 1;
		while (true) {
			eleitor = session.get(Eleitor.class, (long) i);
			if (eleitor != null && eleitor.getNumeroTituloEleitor().intern() == numeroTituloEleitor.intern()) {
				session.close();
				return eleitor;
			} else if (eleitor == null) {
				session.close();
				return null;
			} else {
				i++;
			}
		}
	}

	public String updateVotou(String numeroTituloEleitor, int nVoto) {
		try {
			Eleitor eleitor = getEleitor(numeroTituloEleitor);
			eleitor.setVotou(nVoto);
			session.update(eleitor);
			session.close();
			return "Voto cadastrado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Usuario nao encontrado";
		}
	}

	public Funcionario getFuncionario(String numeroTituloEleitor) {
		Funcionario funcionario;
		int i = 1;
		while (true) {
			funcionario = session.get(Funcionario.class, (long) i);
			if (funcionario != null && funcionario.getNumeroTituloEleitor().intern() == numeroTituloEleitor.intern()) {
				session.close();
				return funcionario;
			} else if (funcionario == null) {
				session.close();
				return null;
			} else {
				i++;
			}
		}
	}

	public ArrayList<Eleitor> getEleitoresVotou() {
		ArrayList<Eleitor> lista = new ArrayList<>();
		Eleitor eleitor;
		int i = 1;
		while (true) {
			eleitor = session.get(Eleitor.class, (long) i);
			if (eleitor != null) {
				lista.add(eleitor);
				i++;
			} else {
				session.close();
				return lista;
			}
		}
	}
	
	public void updateEleitor(Eleitor eleitor) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(eleitor);
		session.getTransaction().commit();
		session.close();
	}
}
