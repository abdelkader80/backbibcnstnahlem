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
public class Adherant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String nom;
private String prenom;
private String fonction;
@ManyToOne
private Direction direction;
@OneToMany
private Collection<Emprunt> emprunt;
}
