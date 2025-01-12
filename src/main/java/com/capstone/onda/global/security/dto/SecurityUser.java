package com.capstone.onda.global.security.dto;

import lombok.Builder;

public record SecurityUser(
    String email,
    String nickname,
    String role
) {

    @Builder
    public SecurityUser {
    }
}
