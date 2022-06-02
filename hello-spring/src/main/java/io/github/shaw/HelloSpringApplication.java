package io.github.shaw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 应用程序启动类.
 *
 * @author <a href="mailto:missyou5957@gmail.com">shaw</a>
 * @since 1.0
 */
@SpringBootApplication
@RestController
public class HelloSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello Spring";
	}
}
