package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Adherant;

public interface AdherentDAO extends JpaRepository<Adherant,Long> {

}
