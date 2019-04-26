package com.infotel.ProjetMavenJava.dao;

import org.springframework.stereotype.Repository;

import com.infotel.ProjetMavenJava.metier.Dev;
import com.infotel.ProjetMavenJava.metier.Etudiant;
import com.infotel.ProjetMavenJava.metier.Formation;

@Repository("dao")
public class DaoImpl implements Idao {

	@Override
	public int ajouterDev(Dev d) {
		System.out.println("Dev a été ajoutée");
		return d.getIdDev();
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		System.out.println("Etudiant a été ajoutée");
		return e.getIdEtudiant();
	}

	@Override
	public int ajouterFormation(Formation f) {
		System.out.println("La formation a été ajouté");
		return f.getIdFormation();
	}

}
