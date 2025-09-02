package com.example.zenjitaste.Repository;

import com.example.zenjitaste.Models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ProviderRepository extends JpaRepository<Provider, Long> {
    }



