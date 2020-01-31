package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Emprunt;

@RepositoryRestResource
interface EmpruntDAO extends JpaRepository <Emprunt,Long> {

}
