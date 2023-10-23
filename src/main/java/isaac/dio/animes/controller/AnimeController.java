package isaac.dio.animes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isaac.dio.animes.model.Anime;
import isaac.dio.animes.service.AnimeService;

@RestController
@RequestMapping("/animes")
public class AnimeController {
    @Autowired
    private AnimeService service;
    @PostMapping
    public void postAnime(@RequestBody Anime anime) {
        service.createAnime(anime);
    }
    @GetMapping
    public List<Anime> getAnime() {
        return service.fetchAnime();
    }
}
