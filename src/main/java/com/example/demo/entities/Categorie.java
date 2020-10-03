package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	 long id;
	 private String nom_cat;
	@OneToMany(mappedBy = "categorie")
	private Collection<Livre> livres;
	

}
