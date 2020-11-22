package ECommerce.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Vendeurs")	
public class Vendeur {
	
	// Attribute 	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom_vendeur",length=30)
	private String nom;
	
	@Column(name="prenom_vendeur",length=30)
	private String prenom;
	
	@Column(name="email_vendeur",length=30)
	private String email;
	
	@Column(name="adresse_vendeur",length=30)
	private String adresse;
	
	@Column(name="telephone_vendeur",length=8)
	private int tel;
	
	@Column(name="login_vendeur",length=10)
	private String login;
	
	@Column(name="password_vendeur",length=20)
	private String password;
	

	// Join
	
	@OneToMany(mappedBy = "vendeur")
    private List<Article> articles;
	
	

	// Constructor
	
	public Vendeur() {
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



	public List<Article> getArticles() {
		return articles;
	}



	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	

}
