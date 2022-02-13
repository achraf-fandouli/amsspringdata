package com.sip.ams;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.controllers.ArticleController;

import java.io.File;
@SpringBootApplication
public class AmsdataApplication {

	public static void main(String[] args) {
		//to create the folder on project starting
		new File(ArticleController.uploadDirectory).mkdir();
		
		SpringApplication.run(AmsdataApplication.class, args);
	}

}
