package ECommerce.model;

import javax.persistence.*;



@Entity
@Table(name="Commentaires")
public class Commentaire {
	// Attribute 	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="continue_commentaire")	
	private String continue_commentaire ;
	
	@Column(name="date_commentaire")	
	private String date ;
	
	// Constructor
	
	public Commentaire(){
		super();
	}
	
	
	
	
	// Getter & Setter


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContinue_commentaire() {
		return continue_commentaire;
	}

	public void setContinue_commentaire(String continue_commentaire) {
		this.continue_commentaire = continue_commentaire;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

	
	
}
