package formation.sopra.videoClub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Realisateur {
	
	@Id
	private String nom;
	
	private String prenom;
	
	@ManyToMany (mappedBy="listeRealisateur")
	private List<Film> listeFilm;
	
	@Version
	private int version;

	
	public Realisateur() {
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
