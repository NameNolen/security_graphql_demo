package cn.ccc.security_graphql_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SecurityGraphqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityGraphqlDemoApplication.class, args);
	}

	@RestController
	public static class SecurityGraphqlDemoController {
		@RequestMapping("/")
		public String index() {
			return "Hello World";
		}
		@RequestMapping("/graphql")
		public String indexA() {
			return "Hello World";
		}
	}
}
