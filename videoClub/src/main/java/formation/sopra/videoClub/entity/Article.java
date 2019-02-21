package formation.sopra.videoClub.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public abstract class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noArticle;
	private Integer nbDisque;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "film_titre", nullable = true)
	private Film film;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "adherent_name", nullable = true)
	private Adherent adherent;
	
	@Version
	private int version;
	
		public Article() {
	}


	public Integer getNoArticle() {
		return noArticle;
	}


	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}


	public Integer getNbDisque() {
		return nbDisque;
	}


	public void setNbDisque(Integer nbDisque) {
		this.nbDisque = nbDisque;
	}
	

}
