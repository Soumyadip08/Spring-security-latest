package com.security;

import com.security.Repository.UserRepository;
import com.security.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setEmail("soumyadipmallick8@gmail.com");
		user.setUsername("Soumyadip");
		user.setPassword(this.bCryptPasswordEncoder.encode("soumyadip"));
		user.setRole("ADMIN");
		this.userRepository.save(user);

		User user1 = new User();
		user1.setEmail("ankita.roy@gmail.com");
		user1.setUsername("Ankita");
		user1.setPassword(this.bCryptPasswordEncoder.encode("ankita"));
		user1.setRole("NORMAL");
		this.userRepository.save(user1);
	}
}
