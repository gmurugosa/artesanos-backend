package com.murugosa.controller;
import com.murugosa.model.Artesano;
import com.murugosa.service.ArtesanoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artesanos")
public class ArtesanoController {
    private final ArtesanoService artesanoService;
    public ArtesanoController(ArtesanoService artesanoService) {
        this.artesanoService = artesanoService;
    }
    @GetMapping("/")
    public List<Artesano> listarArtesanos(){
        return artesanoService.obtenerArtesanos();
    }

    @GetMapping("/{id}")
    public Artesano obtenerArtesano(@PathVariable String id){
        return artesanoService.obtenerArtesano(id).get();
    }


}
