package com.sec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Matieres")
public class Matiere {

	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String nom;
   
   @ManyToMany(mappedBy ="matieres")
   private List<Classe> classes;
   
   
   
   
}
