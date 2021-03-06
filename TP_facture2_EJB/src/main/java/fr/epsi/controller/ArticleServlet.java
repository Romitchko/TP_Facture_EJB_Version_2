package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.service.ArticleService;

//Couche WEB
public class ArticleServlet extends HttpServlet{
	
	@EJB
	private ArticleService service;
	//m�me chose 
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		  this.getServletContext().getRequestDispatcher("/WEB-INF/createArticle.jsp").forward(req, resp);
	    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		
			ArticleDTO aDTO=new ArticleDTO();
			aDTO.setNom( req.getParameter("nomArticle"));
			aDTO.setArticle(req.getParameter("codebarreArticle"));
			aDTO.setPrix(req.getParameter("prixArticle"));
			service.create(aDTO);
			
	    }

}
