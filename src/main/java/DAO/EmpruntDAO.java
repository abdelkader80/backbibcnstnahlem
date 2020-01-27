package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Emprunt;

 interface EmpruntDAO extends JpaRepository <Emprunt,Long> {

}
