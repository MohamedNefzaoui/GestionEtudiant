package com.sec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Departements")
public class Departement {

	  @Id
	     @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private String nom;
		
	  
	    @OneToOne
	    @JoinColumn(name="responsable_id")
	    private Responsable responsable;
	    
	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    private Classe classes;
	    
	    @OneToMany(mappedBy = "departements")
	    private List<Etudiant> etudiants;
	   
	    
	    
	    
	    public Departement() {
			super();
		}


		public Departement(int id, String nom) {
			super();
			this.id = id;
			this.nom = nom;
		}


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
	    
	   
}
