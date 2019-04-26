package com.infotel.ProjetMavenJava.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.ProjetMavenJava.metier.Devlogiciel;
import com.infotel.ProjetMavenJava.metier.Etudiant;
import com.infotel.ProjetMavenJava.metier.Formation;
import com.infotel.ProjetMavenJava.service.Iservice;
import com.infotel.ProjetMavenJava.service.ServiceImpl;

public class App 
{
    public static void main( String[] args )
    
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Devlogiciel d1 = context.getBean("devlog1", Devlogiciel.class);
    	System.out.println(d1);
    	
    	Devlogiciel d2 = context.getBean("devlog2", Devlogiciel.class);
    	System.out.println(d2);
    	
    	Etudiant e = context.getBean("etudiant", Etudiant.class);
    	Iservice service = context.getBean("service", ServiceImpl.class);
    	service.ajouterEtudiant(e);
    	
    	Formation f = context.getBean("formation", Formation.class);
    	service.ajouterFormation(f);
    }
}
