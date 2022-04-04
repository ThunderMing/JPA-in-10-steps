package com.thunder.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thunder.learning.jpa.jpain10steps.entity.User;
import com.thunder.learning.jpa.jpain10steps.service.UserDaoService;
import com.thunder.learning.jpa.jpain10steps.service.UserRepository;

//@Deprecated
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner  {
	
	Logger logger = LogManager.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Thunder", "Admin2");
		userRepository.save(user);
		logger.info("New User is created: " + user);
		Optional<User> userWithIdOne = userRepository.findById(1L);
		logger.info("User is retrived: " + userWithIdOne);
		List<User> users = userRepository.findAll();
		logger.info("All users: " + users);
		
		
	}

}
