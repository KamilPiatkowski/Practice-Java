package com.resttut;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "game", path = "game")
public interface GameRepository extends PagingAndSortingRepository<Game, Long> {

    List<Game> findByName(@Param("name") String name);

    List<Game> findByGenre(@Param("genre") String genre);

    List<Game> findByPlatform(@Param("platform") String platform);

}
