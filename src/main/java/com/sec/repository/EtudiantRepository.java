package com.sec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sec.model.Etudiant;



@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

@Query (value="SELECT * FROM estudiants ", nativeQuery = true)	
 public List<Etudiant>	getAllStaticStudents();
// type de retour seulement dynamic

@Query (value="SELECT * FROM estudiants WHERE nom=? ", nativeQuery = true)	
public List<Etudiant> getAllStudents(@Param(value="nom") String nom) ;

@Query(value="SELECT COUNT (*) as Number, nom FROM etudiants GROUP BY nom", nativeQuery=true)
public List<Object> getNumberOfStudent();

@Query(value="SELECT COUNT (*) as Number FROM etudiants  WHERE nom=?", nativeQuery=true)
public int getNumberOfStudentDynamic();



}
