package com.example.demo.entities;

import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Direction {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String nom;
@OneToMany(mappedBy = "direction")
private Collection<Adherant> adherant;
}
