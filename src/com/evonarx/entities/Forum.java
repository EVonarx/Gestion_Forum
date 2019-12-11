package com.evonarx.entities;

import java.util.Arrays;

import javax.swing.JOptionPane;

import com.sun.net.httpserver.Authenticator.Result;

/* Classe Forum */
public class Forum {

	/* Données membres */
	static  int NBR_MESSAGES_DANS_FORUM = 0;

	private static final int NBR_MESSAGES_MAX = 100;
	public static MessageUtilisateur messagesUtilisateurs[];

	/* Constructeur */
	public Forum() {
		super();
		messagesUtilisateurs = new MessageUtilisateur[NBR_MESSAGES_MAX];
	}

	/* Ajouter un message et un utilisateur dans MessageUtilisateur s'il y a encore de la place */
	public void ajouterUtilisateurMessages(Message message, Utilisateur utilisateur) {

		boolean result = false;
		MessageUtilisateur mUtMessageUtilisateur = new MessageUtilisateur(message, utilisateur);
		
		if (NBR_MESSAGES_DANS_FORUM < NBR_MESSAGES_MAX) {
			messagesUtilisateurs[NBR_MESSAGES_DANS_FORUM] =  mUtMessageUtilisateur;
			NBR_MESSAGES_DANS_FORUM++;
			result = true;	
		}
		
		/*
		if (result)
			JOptionPane.showMessageDialog(null, "The message has been successfully inserted in the forum. There are " + NBR_MESSAGES_DANS_FORUM + " messages in the forum");
		else
			JOptionPane.showMessageDialog(null, "Failed to insert the message in the forum. The full capacity has been reached.");
	*/
	}
	
	@Override
	public String toString() {
		//return super.toString();
		String result = "";
		 result = "Forum => messages et utilisateurs : \n\n";
		
		for (int i=0; i<NBR_MESSAGES_MAX; i++) {
			if (messagesUtilisateurs[i] != null)
			result = result + messagesUtilisateurs[i];
		}
		
		result = result + "\n Il y a " + NBR_MESSAGES_DANS_FORUM + " messages dans le forum";
		//return  + Arrays.toString(messagesUtilisateurs) + "\n" + 
		
		return result;
	}
	

}
