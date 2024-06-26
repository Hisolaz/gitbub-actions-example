package com.cicd.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsDemoApplication {

	@RequestMapping("/hello")
	public String hello() {
		return "This is the Project Skeleton !";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsDemoApplication.class, args);
	}

}
