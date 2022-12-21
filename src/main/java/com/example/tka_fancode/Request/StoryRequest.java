package com.example.tka_fancode.Request;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

@Getter
@Setter
public class StoryRequest {
    //@NotBlank
    private String adaptationName;
    private String briefSummary;
    private double rating;
    private String creators;
    private String length;
    private String fullSummary;
    private String extraInformation;

    /*@NotNull
    @Valid
    private AddressRequest address;*/
}