package com.hind.stars;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hind.stars.entities.Star;
import com.hind.stars.service.StarService;

@SpringBootApplication
public class StarsApplication implements CommandLineRunner {

	@Autowired
	StarService starService;
	
	public static void main(String[] args) {
		SpringApplication.run(StarsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	//starService.saveStar(new Star("Vega", 260, new Date()));
	//starService.saveStar(new Star("Alpha Centauri A", 280, new Date()));
	//starService.saveStar(new Star("Polaris", 900, new Date()));

	}
}

