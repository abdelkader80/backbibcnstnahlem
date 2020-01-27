package DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Auteur;

public interface AuteurDAO extends JpaRepository<Auteur,Long> {

}
