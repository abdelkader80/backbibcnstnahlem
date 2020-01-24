package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Auteur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nom;
private String prenom;
private String nationalite;

@OneToMany(mappedBy = "auteur")
private Collection<Livre> livres;
}
