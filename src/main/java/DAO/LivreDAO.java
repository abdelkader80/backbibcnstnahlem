package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Livre;

public interface LivreDAO extends JpaRepository<Livre,Long> {

}
