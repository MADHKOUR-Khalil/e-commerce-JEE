package ECommerce.model;
 

import javax.persistence.*;


@Entity
@Table(name="Ligne_Commandes")
public class Ligne_Commande {
	
	// Attribute 	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="quantite")	
	private int quantite;
	
	
	//Join
	
	@ManyToOne
    @JoinColumn(name = "commande_id")
    Commande commande;
	
	@ManyToOne
    @JoinColumn(name = "article_id")
    Article article;
	
	
	
	
	
	
	
	// Constructor
	
	public Ligne_Commande(){
		super();
	}


	// Getter & Setter
	
	
	
	
	
	public int getId() {
		return id;
	}



	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
