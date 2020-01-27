package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Livre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String isbn;
	@ManyToOne
	private Auteur auteur;
	@ManyToOne
	private Categorie categorie;
	@OneToMany
	private Collection<Emprunt> emprunt;

}
