package com.greatlearning.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.serviceImpl.LibraryReadServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	@Autowired
	LibraryReadServiceImpl libraryReadServiceImpl;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hello!!!!");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Fetch all librearies-->{}",libraryReadServiceImpl.getAllLibrary());
	}

}
