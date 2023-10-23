package isaac.dio.animes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isaac.dio.animes.model.Anime;
import isaac.dio.animes.repository.AnimeRepository;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository repository;
    public void createAnime(Anime anime) {
        repository.save(anime);
    }

    public List<Anime> fetchAnime() {
        return repository.findAll();
    }

}
