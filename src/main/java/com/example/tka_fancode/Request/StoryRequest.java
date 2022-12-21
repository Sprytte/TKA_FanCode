package com.example.tka_fancode.Request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

@Getter
@Setter
public class StoryRequest {
    @NotBlank
    private String adaptationName;
    @NotBlank
    private String briefSummary;
    @NotBlank
    private String rating;
    @NotBlank
    private String creators;
    @NotBlank
    private String length;
    @NotBlank
    private String fullSummary;
    @NotBlank
    private String extraInformation;

}