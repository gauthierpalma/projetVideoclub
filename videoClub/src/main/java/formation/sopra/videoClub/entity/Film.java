package formation.sopra.videoClub.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Film {
	
	@Id
	private String titre;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateSortie;
	
	@ManyToMany
	@JoinTable( name="FILM_REALISATEUR",joinColumns=@JoinColumn(name="titre"),inverseJoinColumns=@JoinColumn(name="name") )
	private List<Realisateur> listeRealisateur;

	@Version
	private int version;
	
	
	public Film() {
	}

	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	
	
	

}
