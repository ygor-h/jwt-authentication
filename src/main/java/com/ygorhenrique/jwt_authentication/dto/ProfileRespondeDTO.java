package com.ygorhenrique.jwt_authentication.dto;

import java.util.UUID;

public record ProfileRespondeDTO(String login, String role, UUID id) {

}
