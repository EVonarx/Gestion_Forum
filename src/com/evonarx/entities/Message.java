package com.evonarx.entities;

import java.text.DateFormat;
import java.util.Date;

/* Classe Message */
public class Message {

	/* Données membres */
	private String titre;
	private String texte; 
	private Date dateCreation;
	
	/* Constructeur */
	public Message(String titre, String texte) {
		super();
		this.titre = titre;
		this.texte = texte;
		this.dateCreation = new Date();
	}


	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getDateCreation() {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL); 
		return df.format(dateCreation);
		
	}
	
	@Override
	public String toString() {

		return titre + "--" + texte + "--" + dateCreation;
	}

}
