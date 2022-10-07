package com.sec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="Salles")
public class Salle {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@NotBlank
private int numero;

@ManyToMany(mappedBy = "salles")
private List<Classe> classes;



public Salle() {
	super();
}

public Salle(int id, @NotBlank int numero) {
	super();
	this.id = id;
	this.numero = numero;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}



	

}
