package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration  //Para avisar ao SpringBoot que esta é uma classe de teste
@Profile("test")   //Somente irá rodar essa aplicação quando estiver no perfil de teste no application.properties 
public class TestConfig implements CommandLineRunner{
	
	@Autowired //O SpringBoot irá realizar a injeção de dependência
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(1L, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(2L, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		userRepository.saveAll(Arrays.asList(u1, u2)); // Recebe uma Lista de obj e salva no Banco de Dados
	}
}
