package com.capstone.onda.global.security.dto;

import lombok.Builder;

public record GeneratedToken(
    String accessToken,
    String refreshToken
) {

    @Builder
    public GeneratedToken {
    }
}
