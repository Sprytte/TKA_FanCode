package com.example.tka_fancode.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoryResponse {
    private long id;
    private String adaptationName;

    /*private AddressResponse address;
    public TeacherResponse(Teacher teacher){
        id = teacher.getId();
        fullName = teacher.getFirstName() + " " + teacher.getLastName();
        //lastName = teacher.getLastName();
        email = teacher.getEmail();
        age = teacher.getAge();
        address = new AddressResponse(teacher.getAddress());
    }*/
}

