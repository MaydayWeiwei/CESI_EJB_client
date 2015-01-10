package eu.telecom_bretagne.CESI.service;

import java.util.List;

import javax.ejb.Remote;

import eu.telecom_bretagne.CESI.data.model.Employe;

@Remote
public interface IGestionEmploye {
	
	public static final String JNDI_NAME = "java:global/CESI_EAR/CESI_EJB/GestionEmploye!eu.telecom_bretagne.CESI.service.IGestionEmploye";
	
	public List<Employe> listeEmployes();
	public Employe lireEmploye(int identifiant);
	public Employe creerEmploye(String nom, String prenom, int serviceId);

}
