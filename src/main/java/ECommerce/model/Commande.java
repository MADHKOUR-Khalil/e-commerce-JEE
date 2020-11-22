package ECommerce.model;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Commandes")	
public class Commande {
	
	
	// Attribute 	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date_commande",length=30)	
	private String date;
	
	@Column(name="etat_commande",length=30)
	private String etat;
	
	
	
	// Join 	

	@ManyToOne
    private Client client;
	
	@OneToMany(mappedBy = "commande")
	Set<Ligne_Commande> ligne_Commande;	
	
	
	
	// Constructor

	public Commande() {
		super();
	}

	
	

	// Getter & Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}




	public Client getClient() {
		return client;
	}




	public void setClient(Client client) {
		this.client = client;
	}




	public Set<Ligne_Commande> getLigne_Commande() {
		return ligne_Commande;
	}




	public void setLigne_Commande(Set<Ligne_Commande> ligne_Commande) {
		this.ligne_Commande = ligne_Commande;
	}
	
	
	
}
