package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	/*Não precisa criar a implementação da interface, pois o Spring Data SPA já
	tem uma implementação padrão para essa interface através da extensão*/
	
}
