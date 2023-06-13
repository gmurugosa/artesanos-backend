package com.murugosa.dao;

import com.murugosa.model.Artesano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtesanoRepository
        extends JpaRepository<Artesano, String> {
}
