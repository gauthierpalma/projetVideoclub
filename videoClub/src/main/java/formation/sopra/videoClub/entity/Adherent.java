package formation.sopra.videoClub.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Adherent {

	private Titre civilite;
	private String prenom;
	private String nom;

	@Id
	private Long id;


	private Integer noAdherent;

	@OneToOne
	private Adresse adresse;

	@OneToMany(mappedBy="article")
	private Article article;

	@Version
	private int version;


	public Adherent() {
	}


	public Titre getCivilite() {
		return civilite;
	}


	public void setCivilite(Titre civilite) {
		this.civilite = civilite;
	}


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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getNoAdherent() {
		return noAdherent;
	}


	public void setNoAdherent(Integer noAdherent) {
		this.noAdherent = noAdherent;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	
	
}
