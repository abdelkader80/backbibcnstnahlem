package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Categorie;

public interface CategorieDAO  extends JpaRepository<Categorie,Long>{

}
