package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	/*Não precisa criar a implementação da interface, pois o Spring Data SPA já
	tem uma implementação padrão para essa interface através da extensão*/
	
}
