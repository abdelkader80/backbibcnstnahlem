package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Emprunt {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private Date date_emprunt;
private Date date_retour;
@ManyToOne
private Livre livre;
@ManyToOne
private Adherant adherant;
}
