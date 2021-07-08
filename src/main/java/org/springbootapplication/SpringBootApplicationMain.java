package org.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.imaginnovate")
@SpringBootApplication
@Configuration
public class SpringBootApplicationMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationMain.class, args);
	}
}