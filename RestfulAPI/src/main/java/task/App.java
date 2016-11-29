package task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	static final Logger logger = LoggerFactory.getLogger(App.class.getName());

	public static void main(String[] args) {
		logger.info("entered application");
		SpringApplication.run(App.class, args);
	}

}
