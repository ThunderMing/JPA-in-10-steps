package com.thunder.learning.jpa.jpain10steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thunder.learning.jpa.jpain10steps.entity.User;
import com.thunder.learning.jpa.jpain10steps.service.UserDaoService;

//@Deprecated
@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner  {
	
//	private static final Logger log = (Logger) LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	Logger logger = LogManager.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	private UserDaoService userDaoService;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		userDaoService.insert(user);
		logger.info("New User is created: " + user);
	}

}
