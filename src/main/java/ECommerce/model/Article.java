package ECommerce.model;

import java.util.Set;

import javax.persistence.*;

/**
 * @author MADHKOUR
 *
 */

@Entity
@Table(name="Articles")
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom_article",length=30)	
	private String nom;

	@Column(name="description_article",length=30)	
	private String description;
	
	@Column(name="prix_article",length=30)	
	private String prix;
	
	

	// Join
	
    @ManyToOne
    private Vendeur vendeur;
    
    @OneToMany(mappedBy = "article")
	Set<Ligne_Commande> ligne_Commande;	
	
    
    
    
	
	// Constructor


	public Article() {
		super();
	}
	
	
// Getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}


	public Vendeur getVendeur() {
		return vendeur;
	}


	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}


	public Set<Ligne_Commande> getLigne_Commande() {
		return ligne_Commande;
	}


	public void setLigne_Commande(Set<Ligne_Commande> ligne_Commande) {
		this.ligne_Commande = ligne_Commande;
	}

	
	
	
	

}
