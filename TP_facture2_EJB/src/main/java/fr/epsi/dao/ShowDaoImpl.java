package fr.epsi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.dto.ClientDTO;
import fr.epsi.dto.FactureDTO;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

public class ShowDaoImpl implements ArticleDao, ClientDao, FactureDao{
	
	EntityManager em;
	UserTransaction utx;

	public ShowDaoImpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}
	public void find(Article s, Client c, Facture f) {
		try {
			utx.begin();
			Client client = em.find(Client.class, 1);
			Query getclient = em.createQuery("Select * from Client");
			getclient.getResultList();
			Article article = em.find(Article.class, 1);
			Query getarticle = em.createQuery("Select * from Article");
			getclient.getResultList();
			Facture facture = em.find(Facture.class, 1);
			Query getfacture = em.createQuery("Select * from Facture");
			getclient.getResultList();
			
			
			// utx.commit();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
