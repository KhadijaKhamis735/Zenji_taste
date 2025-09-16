package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface Providerrepository extends JpaRepository<Provider, Long> {
    }



