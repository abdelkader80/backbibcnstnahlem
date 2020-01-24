package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class Livre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String titre;
private String isbn;
@OneToOne(mappedBy = "livres")
private Auteur auteur;
@OneToOne(mappedBy = "livres")
private Categorie categorie;
@OneToMany(mappedBy = "livres")
private Collection<Emprunt> emprunts;

}
