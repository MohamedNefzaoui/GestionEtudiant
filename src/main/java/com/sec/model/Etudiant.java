package com.sec.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="etudiants")
public class Etudiant {
         
	   @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String nom;
      private String prenom;
      private Date dateDeNaissance;
      private String adresse;
      private String telephone;
      private String email;
      private String password;
      
      @ManyToOne (fetch = FetchType.LAZY, optional = false)
      private Classe classes;
	
      @ManyToOne(fetch = FetchType.LAZY, optional = false)
      @JoinColumn
	    private Departement departements;
      
      
      
      public Etudiant() {
		super();
	}

	public Etudiant(int id, String nom, String prenom, Date dateDeNaissance, String adresse, String telephone,
			String email, String password) {
		super();
		this.id = (long) id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
	}
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="classe_id")
    private Classe classe_etudiant;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
      
      
     
   
     
     
      
}