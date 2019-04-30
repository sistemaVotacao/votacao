package br.com.fatec.connectors;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class ConnectionFactory {
	public SessionFactory getConnection()  {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
    }

}
