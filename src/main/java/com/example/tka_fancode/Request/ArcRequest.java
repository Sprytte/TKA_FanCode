package com.example.tka_fancode.Request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArcRequest {
    @NotBlank
    private String arcName;
    @NotBlank
    private String arcDescription;

    @NotNull
    @Valid
    private SummaryRequest summary;
}
