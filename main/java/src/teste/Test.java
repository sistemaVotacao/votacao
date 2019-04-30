package teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.fatec.entidadesBD.Eleitor;
import br.com.fatec.entidadesBD.Funcionario;
import br.com.fatec.entidadesBD.Municipio;
import br.com.fatec.entidadesBD.Pessoas;
import br.com.fatec.entidadesBD.SecaoEleitoral;
import br.com.fatec.entidadesBD.UF;
import br.com.fatec.entidadesBD.Zona;
import br.com.fatec.geradoresSenhaNumeroTitulo.GeradorNumeroTitulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeradorNumeroTitulo num = new GeradorNumeroTitulo();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.getTransaction().commit();
		session.close();
		
		
		
		/*Eleitor eleitor = session.get(Eleitor.class, (long)1);
		Funcionario funcionario = new Funcionario.FuncinarioBuilder()
				.oEleitor(eleitor)
				.numeroTituloEleitor(eleitor.getNumeroTituloEleitor())
				.senhaFuncionario("funcionario")
				.seuCargo("mesario")
				.Build();
		session.save(funcionario);
				session.getTransaction().commit();*/
		
		
		/*Pessoas pessoa1 = session.get(Pessoas.class, (long)1);
		Pessoas pessoa2 = session.get(Pessoas.class, (long)2);
		SecaoEleitoral secao1 = pessoa1.getMunicipio().getZona().getListaSecoesEletorais().iterator().next();
		SecaoEleitoral secao2 = pessoa1.getMunicipio().getZona().getListaSecoesEletorais().iterator().next();
		Zona zona = pessoa1.getMunicipio().getZona();
		Eleitor eleitor = new Eleitor.EleitorBuilder()
				.numeroDoTitulo("123")
				.numeroSenha(Long.toString(123) + "abc")
				.numeroSecaoEleitoral(secao1)
				.idPessoaNovoEleitor(pessoa1)
				.numeroZonaEleitoral(zona)
				.dataEmissaoTitulo(new Date())
				.Build();
		
		session.save(eleitor);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		eleitor = new Eleitor.EleitorBuilder()
				.numeroDoTitulo("456")
				.numeroSenha(Long.toString(123) + "abc")
				.numeroSecaoEleitoral(secao2)
				.idPessoaNovoEleitor(pessoa2)
				.numeroZonaEleitoral(zona)
				.dataEmissaoTitulo(new Date())
				.Build();
		
		session.save(eleitor);
		session.getTransaction().commit();
		
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		pessoa1 = session.get(Pessoas.class, (long)3);
		pessoa2 = session.get(Pessoas.class, (long)4);
		secao1 = pessoa1.getMunicipio().getZona().getListaSecoesEletorais().iterator().next();
		secao2 = pessoa1.getMunicipio().getZona().getListaSecoesEletorais().iterator().next();
		zona = pessoa1.getMunicipio().getZona();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		eleitor = new Eleitor.EleitorBuilder()
				.numeroDoTitulo("222")
				.numeroSenha(Long.toString(123) + "abc")
				.numeroSecaoEleitoral(secao1)
				.idPessoaNovoEleitor(pessoa1)
				.numeroZonaEleitoral(zona)
				.dataEmissaoTitulo(new Date())
				.Build();
		
		session.save(eleitor);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		eleitor = new Eleitor.EleitorBuilder()
				.numeroDoTitulo("333")
				.numeroSenha(Long.toString(123) + "abc")
				.numeroSecaoEleitoral(secao2)
				.idPessoaNovoEleitor(pessoa2)
				.numeroZonaEleitoral(zona)
				.dataEmissaoTitulo(new Date())
				.Build();*/
		
		
		/*Iterator<Municipio> inte = null;
		for(Long i = (long) 1; i < 3; i++ ) {
			
		}*/
		
		
		/*UF ufSP = session.get(UF.class, (long)1);
		UF ufMG = session.get(UF.class, (long)2);
		Municipio muniSP = ufSP.getListaMunicipios().iterator().next();
		Municipio muniMG = ufMG.getListaMunicipios().iterator().next();
		
		Pessoas pessoa = new Pessoas.PessoaBuilder()
				.chamado("Rodrigo")
				.dataDeNascimento(new Date())
				.doEstado(ufSP)
				.doMunicipio(muniSP)
				.build();
		session.save(pessoa);
		session.getTransaction().commit();
		session.close();
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		pessoa = new Pessoas.PessoaBuilder()
				.chamado("Miriam")
				.dataDeNascimento(new Date())
				.doEstado(ufMG)
				.doMunicipio(muniMG)
				.build();
		session.save(pessoa);
		session.getTransaction().commit();
		session.close();
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		pessoa = new Pessoas.PessoaBuilder()
				.chamado("Renato")
				.dataDeNascimento(new Date())
				.doEstado(ufSP)
				.doMunicipio(muniSP)
				.build();
		session.save(pessoa);*/

		/*Zona zona = new Zona();
		Zona zona2 = new Zona();

		Municipio municipio = new Municipio();
		Municipio municipio2 = new Municipio();

		SecaoEleitoral secao = new SecaoEleitoral();
		SecaoEleitoral secao2 = new SecaoEleitoral();
		SecaoEleitoral secao3 = new SecaoEleitoral();
		SecaoEleitoral secao4 = new SecaoEleitoral();

		UF ufSP = new UF();
		ufSP.setUF("SP");

		UF ufMG = new UF();
		ufMG.setUF("MG");

		secao.setLocal("Escola Maria de melo");
		secao2.setLocal("Escola Malba Thereza");
		secao3.setLocal("Escola Alguma Escola de minas 1");
		secao4.setLocal("Escola Alguma Escola de minas 2");

		municipio.setNomeMunicipio("São José dos Campos");
		municipio2.setNomeMunicipio("Abaté");

		zona.getListaSecoesEletorais().add(secao);
		zona.getListaSecoesEletorais().add(secao2);
		zona.setMunicipio(municipio);

		zona2.getListaSecoesEletorais().add(secao3);
		zona2.getListaSecoesEletorais().add(secao4);
		zona2.setMunicipio(municipio2);

		ufSP.getListaZonas().add(zona);
		ufSP.getListaMunicipios().add(municipio);

		ufMG.getListaZonas().add(zona2);
		ufMG.getListaMunicipios().add(municipio2);

		municipio.setUf(ufSP);
		municipio.setZona(zona);

		municipio2.setUf(ufMG);
		municipio2.setZona(zona2);

		zona.setUf(ufSP);

		zona2.setUf(ufMG);

		secao.setZona(zona);
		secao.setMunicipio(municipio);

		secao2.setZona(zona);
		secao2.setMunicipio(municipio);

		secao3.setZona(zona2);
		secao3.setMunicipio(municipio2);

		secao4.setZona(zona2);
		secao4.setMunicipio(municipio2);

		session.save(ufSP);
		session.save(ufMG);
		session.save(zona);
		session.save(zona2);
		session.save(municipio);
		session.save(municipio2);
		session.save(secao);
		session.save(secao2);
		session.save(secao3);
		session.save(secao4);
*/

	}

}
