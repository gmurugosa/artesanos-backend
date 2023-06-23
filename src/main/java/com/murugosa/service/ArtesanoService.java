package com.murugosa.service;

import com.murugosa.dao.ArtesanoRepository;
import com.murugosa.model.Artesano;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtesanoService {

    private final ArtesanoRepository artesanoRepository;

    public ArtesanoService(ArtesanoRepository artesanoRepository) {
        this.artesanoRepository = artesanoRepository;
    }

    public List<Artesano> obtenerArtesanos(){
        return artesanoRepository.findAll();
    }

    public Optional<Artesano> obtenerArtesano(String id){
        return artesanoRepository.findById(id);
    }
}
