package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Categorie {
	@Id @GeneratedValue
	private int id;
	private String nomCat;
	@OneToMany(mappedBy = "categorie")
	private Collection<Livre> livres;

}
