package fr.epsi.dao;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

public interface ShowDao {
  void find(Article a, Facture f, Client c);
}
