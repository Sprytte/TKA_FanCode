package com.example.tka_fancode.Request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

@Getter
@Setter
public class StoryRequest {
    //@NotBlank
    private String adaptationName;

    /*@NotNull
    @Valid
    private AddressRequest address;*/
}