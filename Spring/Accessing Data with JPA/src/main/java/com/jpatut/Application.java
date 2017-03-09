package com.jpatut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(GameRepository repository) {
		return (args) -> {

			// save some games
			repository.save(new Game("Baldur's Gate", "PC", "RPG"));
			repository.save(new Game("Assassin's Creed", "PC", "Stealth"));
			repository.save(new Game("Deus Ex", "PC", "Shooter"));
			repository.save(new Game("Tekken", "PS", "Fighting"));
			repository.save(new Game("Super Mario Bros", "Wii", "Platform"));
			repository.save(new Game("Halo", "XBox", "Shooter"));
			repository.save(new Game("Resident Evil", "PS", "Survival"));
			repository.save(new Game("Warcraft", "PC", "Strategy"));
			repository.save(new Game("Starcraft", "PC", "Strategy"));
			repository.save(new Game("World of Warcraft", "PC", "MMO"));
			repository.save(new Game("Guild Wars", "PC", "MMO"));

			// fetch all games
			log.info("All games:");
			log.info("----------------------------------------");
			for(Game game : repository.findAll()) {
				log.info(game.toString());
			}
			log.info("");

			// fetch game by id
			Game game = repository.findOne(9L);
			log.info("One specyfic game:");
			log.info("----------------------------------------");
			log.info(game.toString());
			log.info("");

			// fetch games by name
			log.info("Games found by name 'Warcraft':");
			log.info("----------------------------------------");
			for(Game warcraft : repository.findByName("Warcraft")) {
				log.info(warcraft.toString());
			}
			log.info("");

			// fetch games by platform
			log.info("Games found by platform 'PC':");
			log.info("----------------------------------------");
			for(Game pc : repository.findByPlatform("PC")) {
				log.info(pc.toString());
			}
			log.info("");

			// fetch games by genre
			log.info("Games found by genre 'MMO':");
			log.info("----------------------------------------");
			for(Game mmo : repository.findByGenre("MMO")) {
				log.info(mmo.toString());
			}
			log.info("");
		};
	}
}
