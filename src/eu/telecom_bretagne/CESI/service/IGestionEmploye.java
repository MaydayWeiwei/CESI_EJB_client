package eu.telecom_bretagne.CESI.service;

import java.util.List;

import javax.ejb.Remote;

import eu.telecom_bretagne.CESI.data.model.Employe;

@Remote
public interface IGestionEmploye {
	
	public static final String JNDI_NAME = "java:global/CESI_EAR/CESI_EJB/GestionEmploye!eu.telecom_bretagne.CESI.service.IGestionEmploye";
	
	public List<Employe> listeEmployes();
	public Employe lireEmploye(int identifiant);
	public void modifierEmploye(int identifiant, String nouveauNom);
	public void modifierEmploye(int identifiant, String nouveauNom, int departement_id);
	public Employe creerEmploye(String nouveauNom, int identifiant);
	public void supprimerEmploye(int identifiant);

}
