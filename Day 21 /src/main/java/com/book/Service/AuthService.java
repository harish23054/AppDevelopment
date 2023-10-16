package com.book.Service;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.book.dto.request.AuthenticationRequest;
import com.book.dto.request.RegisterRequest;
import com.book.dto.response.AuthenticationResponse;
import com.book.model.User;
import com.book.model.enumerate.Role;
import com.book.repository.UserRepository;
import com.book.util.JwtUtil;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    public boolean userRegistration(RegisterRequest request) {
        Optional<User> isUserExists = userRepository.findByEmail(request.getEmail());
        if (!isUserExists.isPresent()) {
            var user = User.builder()
                    .name(request.getName())
                    .email(request.getEmail())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .isEnabled(true)
                    .role(Role.valueOf(request.getRole().toUpperCase()))
                    .build();
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

    
    public AuthenticationResponse userAuthentication(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        var token = jwtUtil.generateToken(user);
        return AuthenticationResponse.builder()
                .token(token)
                .uid(user.getUid())
                .email(user.getEmail())
                .build();
    }
}
