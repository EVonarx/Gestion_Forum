package com.evonarx.entities;

/* Classe Utilisateur */
public class Utilisateur {
	
	/* Données membres */
	private String prenom;
	private String nom;
	private CategorieUtilisateur statut;

	/* Constructeur */
	public Utilisateur(String prenom, String nom, CategorieUtilisateur statut) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.statut = statut;
	}
	
	/* getters et setters */
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public CategorieUtilisateur getStatut() {
		return statut;
	}
	public void setStatut(CategorieUtilisateur statut) {
		this.statut = statut;
	}
	
	@Override
	public String toString() {

		return prenom + " " + nom + ", " + statut;
		
	}
}
