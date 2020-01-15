package com.login.webapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class WebappApplication implements CommandLineRunner {

//	private final Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@Override
	public void run(String... args) throws ParseException {

//		logger.info("=================================");
//		logger.info("====FIND User By Email====");
//		Optional<LoginUser> foundUser = userService.findByEmail("tolstoy@test.com");
//		foundUser.ifPresent(loginUser -> logger.info(loginUser.toString()));
//		logger.info("=================================");
//		logger.info("=================================");

	}
}
