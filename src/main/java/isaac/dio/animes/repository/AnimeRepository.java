package isaac.dio.animes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isaac.dio.animes.model.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer> {
}
