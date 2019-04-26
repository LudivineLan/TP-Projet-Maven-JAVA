package com.infotel.ProjetMavenJava.service;

import com.infotel.ProjetMavenJava.metier.Dev;
import com.infotel.ProjetMavenJava.metier.Etudiant;
import com.infotel.ProjetMavenJava.metier.Formation;

public interface Iservice {

	public int ajouterDev(Dev d);
	public int ajouterEtudiant(Etudiant e);
	public int ajouterFormation(Formation f);
}
