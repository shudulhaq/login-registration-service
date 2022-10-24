package com.example.loginregistrationservice.service;

import com.example.loginregistrationservice.model.ConfirmationToken;
import com.example.loginregistrationservice.repository.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository repository;

    public void saveConfirmationToken(ConfirmationToken token){
        repository.save(token);
    }

    public Optional<ConfirmationToken> getToken(String token){
        return repository.findByToken(token);
    }

    public int setConfirmedDate(String token) {
        return repository.updateConfirmedDate(
                token, LocalDateTime.now());
    }
}
