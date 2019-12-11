package com.evonarx.entities;

/* Classe MessageUtilisateur */
/* Relie le message à l'utilisateur */
public class MessageUtilisateur {

	/* Données membres */
	private Message message; 
	private Utilisateur utilisateur;

	/* Constructeur */
	public MessageUtilisateur(Message message, Utilisateur utilisateur) {
		super();
		this.message = message;
		this.utilisateur = utilisateur;
	}

	/* Getters et setters */
	public Message getMessage() {
		return message;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public void setMessage(Message message) {
		this.message = message;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "MessageUtilisateur [message=" + message + ", utilisateur=" + utilisateur + "] \n";
	}

}
