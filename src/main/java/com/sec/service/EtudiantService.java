package com.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.Etudiant;
import com.sec.repository.EtudiantRepository;

@Service
public class EtudiantService {
	
@Autowired 
	private EtudiantRepository etudiantrep;

 // call of method from repository EtudiantRepository STATIC
public List<Etudiant> getAllStaticStudents(){
	return etudiantrep.getAllStaticStudents();
    }


// call of method from repository EtudiantRepository DYNAMIC
public List<Etudiant> getAllDynamicStudentsByNom(String nom){
	return etudiantrep.getAllStudents(nom);
   }

//call of method from repository JPARepository
 public List<Etudiant> getAllStudent() {
	 return etudiantrep.findAll();
 }
 
 
 

}
