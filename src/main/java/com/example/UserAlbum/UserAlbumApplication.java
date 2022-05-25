package com.example.UserAlbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserAlbumApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAlbumApplication.class, args);
	}

}
