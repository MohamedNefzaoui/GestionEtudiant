package com.sec.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.annotations.FilterJoinTable;


@Entity
@Table(name="Classes")
public class Classe {

	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String nom;
   private int nbrClasse;

   @OneToMany(mappedBy = "classe_etudiant") 
   private List<Etudiant> etudiatns;
   
   
   
   @OneToMany(mappedBy = "classes") 
   private List<Departement> departements;
   
   
   @ManyToMany(cascade =CascadeType.ALL)
   @JoinTable(name="classe_salle", joinColumns = @JoinColumn(name="classe_id",referencedColumnName ="id"), 
   inverseJoinColumns = @JoinColumn(name="salle_id", referencedColumnName = "id" ))
    private List<Salle> salles;
   
   
   @ManyToMany(cascade =CascadeType.ALL)
   @JoinTable(name="classe_matiere", joinColumns = @JoinColumn(name="classe_id",referencedColumnName ="id"), 
   inverseJoinColumns = @JoinColumn(name="matiere_id", referencedColumnName = "id" ))
    private List<Matiere> matieres;
   
   
   public Classe() {
	super();
}




public Classe(int id, String nom, int nbrClasse) {
	super();
	this.id = id;
	this.nom = nom;
	this.nbrClasse = nbrClasse;
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




public int getNbrClasse() {
	return nbrClasse;
}




public void setNbrClasse(int nbrClasse) {
	this.nbrClasse = nbrClasse;
}
   

  
  
}
