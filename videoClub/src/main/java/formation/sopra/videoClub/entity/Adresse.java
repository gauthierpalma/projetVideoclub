package formation.sopra.videoClub.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse {

	@Id
	private Long id;

	private Integer numero;

	private String rue;

	private String ville;

	private String codePostal;

	@OneToOne(mappedBy="adherent")
	private Adherent adherent;


	

	public Adresse() {
	}




	public Adresse(Integer numero, String rue, String ville, String codePostal){
	this.numero=numero;
	this.rue=rue;
	this.ville=ville;
	this.codePostal=codePostal;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Integer getNumero() {
		return numero;
	}




	public void setNumero(Integer numero) {
		this.numero = numero;
	}




	public String getRue() {
		return rue;
	}




	public void setRue(String rue) {
		this.rue = rue;
	}




	public String getVille() {
		return ville;
	}




	public void setVille(String ville) {
		this.ville = ville;
	}




	public String getCodePostal() {
		return codePostal;
	}




	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}




	public Adherent getAdherent() {
		return adherent;
	}




	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}


	
	
}
