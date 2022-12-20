package com.example.tka_fancode.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArcRequest {
    //@NotBlank
    private String arcName;
    private String arcRequest;

    /*@NotNull
    @Valid
    private AddressRequest address;*/
}
