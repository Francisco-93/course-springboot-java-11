package com.educandoweb.course.resoursces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	//ResponseEntity é um tipo específico para retornar respostas de requisições web
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Francisco", "francisco.fro.agui@gmail.com", "994011975", "237461");
		return ResponseEntity.ok().body(u);
	}
}
