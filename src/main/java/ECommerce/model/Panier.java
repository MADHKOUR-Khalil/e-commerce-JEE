package ECommerce.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

@Entity
@Table(name="Paniers")
public class Panier {

	
	
	
	// Attribute 	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
		
	private Map<Long, Ligne_Commande> 
	
	items=new HashMap<Long, Ligne_Commande>();
	
	
	// Constructor
	
	public Panier(){
		super();
	}

	// Getter & Setter


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public Map<Long, Ligne_Commande> getItems() {
		return items;
	}

	public void setItems(Map<Long, Ligne_Commande> items) {
		this.items = items;
	}
	
	
	

	
	
}
