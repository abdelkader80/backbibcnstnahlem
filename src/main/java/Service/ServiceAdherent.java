package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Adherant;

import DAO.AdherentDAO;

@RestController
public class ServiceAdherent {
	@Autowired
private AdherentDAO dao;
	
	//Récuperér la liste des adhérents
	@RequestMapping(value="/adherent",method=RequestMethod.GET)
	public List<Adherant> getAdherent(){
	return dao.findAll();
	
}
	// get one adherent
	@RequestMapping(value="/adherent/{id}",method=RequestMethod.GET)
	public Adherant getadherent(@PathVariable long id) {
		return dao.findOne() {
		
	}
	//delete adherent
	
	@RequestMapping(value="/adherent/{id}",method=RequestMethod.DELETE)
	public boolean deleteadherent(@PathVariable long id) {
		 dao.delete(id);
		 return true;
	}
	//save adherent
	