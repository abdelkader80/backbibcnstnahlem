package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Livre;

@RepositoryRestResource
public interface LivreDAO extends JpaRepository<Livre,Long> {

}
