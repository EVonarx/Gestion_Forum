package com.evonarx.application;

import javax.security.auth.login.FailedLoginException;
import javax.swing.JOptionPane;

import com.evonarx.entities.CategorieUtilisateur;
import com.evonarx.entities.Forum;
import com.evonarx.entities.Message;
import com.evonarx.entities.Utilisateur;

public class TestForum {
	
	

public static void main(String[] args) {
	boolean result = false;
	
	/* Cr�ation d'utilisateurs */
	Utilisateur u1 = new Utilisateur("Eric", "Vonarx", CategorieUtilisateur.Moderateur);
	Utilisateur u2 = new Utilisateur("Eric", "Martin", CategorieUtilisateur.Standard);
	Utilisateur u3 = new Utilisateur("Léo", "Scomazzon", CategorieUtilisateur.Standard);

	//JOptionPane.showMessageDialog(null, u1);
	
	/* Cr�ation de messages */
	Message message1 = new Message("Java SE", "L'encapsulation est une propriété fondamentale");
	Message message2 = new Message("Visual Basic", "C'est interessant pour se familiariser avec les interfaces graphiques");
	Message message3 = new Message("SQL Server", "Un SGBD permet de stocker les données d'une application");
	
	//JOptionPane.showMessageDialog(null, message1);
	//Message.forum.toString();
	
	
	/* Cr�ation d'un forum */
	Forum f1 = new Forum();
	
	/* Ajout de messages au forum */
	f1.ajouterUtilisateurMessages(message1, u1);
	f1.ajouterUtilisateurMessages(message2, u2);
	f1.ajouterUtilisateurMessages(message3, u3);
	
	/* Affiche tous les messages du forum */
	JOptionPane.showMessageDialog(null, f1.toString());
	
	
	
}



	
}
