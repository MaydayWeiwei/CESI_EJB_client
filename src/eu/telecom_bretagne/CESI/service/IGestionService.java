package eu.telecom_bretagne.CESI.service;

import java.util.List;

import javax.ejb.Remote;

import eu.telecom_bretagne.CESI.data.model.Service;

@Remote
public interface IGestionService {

	public static final String JNDI_NAME = "java:global/CESI_EAR/CESI_EJB/GestionService!eu.telecom_bretagne.CESI.service.IGestionService";

	public Service lireService(int identifiant);

	public List<Service> listeServices();
}
