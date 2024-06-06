package com.anil.Jenkins_deploy_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDeployTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeployTestApplication.class, args);
		System.out.println("Boot Started...");
	}

}
