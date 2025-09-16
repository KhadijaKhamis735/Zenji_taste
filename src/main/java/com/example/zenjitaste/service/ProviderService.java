package com.example.zenjitaste.service;



import com.example.zenjitaste.model.Provider;
import com.example.zenjitaste.repository.Providerrepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final Providerrepository providerRepository;

    public Provider saveProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public Provider findProviderById(Long id) {
        return providerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Provider not found"));
    }
}
