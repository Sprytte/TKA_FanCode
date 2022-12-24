package com.example.tka_fancode.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoriteRequest {
    @NotBlank
    private String chapters;
    @NotBlank
    private String description;
    @NotBlank
    private String username;
}
