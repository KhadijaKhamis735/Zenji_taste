package com.example.zenjitaste.Service;



import com.example.zenjitaste.Models.Provider;
import com.example.zenjitaste.Repository.ProviderRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final ProviderRepository providerRepository;

    public Provider saveProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public Provider findProviderById(Long id) {
        return providerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Provider not found"));
    }
}
