package com.jpatut;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameRepository extends CrudRepository<Game, Long> {

    List<Game> findByName(String name);

    List<Game> findByGenre(String genre);

    List<Game> findByPlatform(String platform);

}
