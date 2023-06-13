package com.murugosa.controller;
import com.murugosa.model.Artesano;
import com.murugosa.service.ArtesanoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtesanoController {

    private final ArtesanoService artesanoService;

    public ArtesanoController(ArtesanoService artesanoService) {
        this.artesanoService = artesanoService;
    }


    @GetMapping("/")
    public List<Artesano> greeting(){
        return artesanoService.obtenerArtesanos();
    }

}
