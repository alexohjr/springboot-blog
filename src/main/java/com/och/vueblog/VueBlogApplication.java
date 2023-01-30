package com.och.vueblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class VueBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueBlogApplication.class, args);
	}

}
