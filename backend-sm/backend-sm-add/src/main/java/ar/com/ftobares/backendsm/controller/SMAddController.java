package ar.com.ftobares.backendsm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ftobares.backendsm.model.Interests;
import ar.com.ftobares.backendsm.model.UserAggregator;
import ar.com.ftobares.backendsm.repository.InterestsRepository;

@RestController
@RequestMapping(value = "/boards")
public class SMAddController {
	
	@Autowired
    private InterestsRepository repository;
	
	/**
	 * Request para obtener info sobre un usuario en particular @GetMapping
	 * */
	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public UserAggregator obtenerUsuario(@PathVariable("user") String userName) {    	
        UserAggregator user = new UserAggregator(userName);
    	return user;
    }
	
	/**
	 * Seguir posts de una cuenta especifica @PostMapping
	 * */
	@RequestMapping(value = "/{user}/follow/account/{smuser}", method = RequestMethod.POST)
	public ResponseEntity<?> seguirCuenta(@PathVariable("user") String userName, @PathVariable("smuser") String userToFollow){
		Interests smuser = new Interests();
		//repository.save(smuser);
		//accedo al model para persistir el interes

		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/**
	 * Seguir posts de una cuenta especifica @PostMapping("/{user}/follow/interests/{hashtag}}")
	 * */
	@RequestMapping(value = "/{user}/follow/interests/{hashtag}}", method = RequestMethod.POST)
	public ResponseEntity<?> seguirHashTag(@PathVariable("user") String userName, @PathVariable("hashtag") String userToFollow){
		
		//accedo al model para persistir el interes

		return new ResponseEntity<>(HttpStatus.CREATED);
	}	
	
	// @PutMapping
	// @DeleteMapping
	
	// @RequestBody Map<String, String> body - para enviar un json body

}
