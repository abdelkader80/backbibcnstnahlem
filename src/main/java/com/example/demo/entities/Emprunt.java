package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity @Data
public class Emprunt {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;	
private Date dateEmprunt;
private Date dateRetour;
@OneToOne(mappedBy = "emprunts")
private Livre livres;
@OneToOne(mappedBy = "emprunts")
private Adherant adherant;

}
