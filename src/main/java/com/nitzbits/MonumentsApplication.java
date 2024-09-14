package com.nitzbits;

import com.nitzbits.model.Users;
import com.nitzbits.repository.UsersRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableWebMvc
@OpenAPIDefinition
public class MonumentsApplication implements CommandLineRunner {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(MonumentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.usersRepository.save(new Users("admin",this.passwordEncoder.encode("admin#112"),"admin@mail.com","ROLE_ADMIN"));

	}
}
