package com.ygorhenrique.jwt_authentication.dto;

import com.ygorhenrique.jwt_authentication.entity.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
