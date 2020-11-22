package ECommerce.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clients")	
public class Client {
	
	
	
	// Attribute 	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom_client",length=30)
	private String nom;
	
	@Column(name="prenom_client",length=30)
	private String prenom;
	
	@Column(name="email_client",length=30)
	private String email;
	
	@Column(name="adresse_client",length=30)
	private String adresse;
	
	@Column(name="telephone_client",length=8)
	private int tel;
	
	@Column(name="login_client",length=10)
	private String login;
	
	@Column(name="password_client",length=20)
	private String password;
	
	

	// Join
	
	@OneToMany(mappedBy = "client")
    private List<Commande> commandes;
	
	
	// Constructor

	
	public Client() {
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public List<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	
	

}
