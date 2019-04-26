package com.infotel.ProjetMavenJava.dao;

import com.infotel.ProjetMavenJava.metier.Dev;
import com.infotel.ProjetMavenJava.metier.Etudiant;
import com.infotel.ProjetMavenJava.metier.Formation;

public interface Idao {
	
	public int ajouterDev(Dev d);
	public int ajouterEtudiant(Etudiant e);
	public int ajouterFormation(Formation f);

}
