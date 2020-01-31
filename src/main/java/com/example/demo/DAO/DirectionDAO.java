package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Direction;

@RepositoryRestResource
public interface DirectionDAO  extends JpaRepository<Direction,Long>{

}
