package com.ygorhenrique.jwt_authentication.controller;

import com.ygorhenrique.jwt_authentication.dto.ProfileRespondeDTO;
import com.ygorhenrique.jwt_authentication.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/me")
    public ResponseEntity<ProfileRespondeDTO> me(@AuthenticationPrincipal User user) {
        String login = user.getLogin();
        String role = user.getRole().getRole();
        UUID id = user.getId();

        ProfileRespondeDTO profileRespondeDTO = new ProfileRespondeDTO(login, role, id);

        return ResponseEntity.ok(profileRespondeDTO);
    }
}
