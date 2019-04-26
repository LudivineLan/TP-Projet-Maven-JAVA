package com.infotel.ProjetMavenJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.ProjetMavenJava.dao.Idao;
import com.infotel.ProjetMavenJava.metier.Dev;
import com.infotel.ProjetMavenJava.metier.Etudiant;
import com.infotel.ProjetMavenJava.metier.Formation;

@Service("service")
public class ServiceImpl implements Iservice {
	@Autowired
	private Idao dao;
	
	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		return dao.ajouterDev(d);
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e);
	}

	@Override
	public int ajouterFormation(Formation f) {
		// TODO Auto-generated method stub
		return dao.ajouterFormation(f);
	}

}
