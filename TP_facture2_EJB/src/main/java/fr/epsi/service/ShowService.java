package fr.epsi.service;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.FactureDTO;
import fr.epsi.entite.Client;

public interface ShowService {
	
	void find(FactureDTO f, ArticleDTO a, Client c);

}
