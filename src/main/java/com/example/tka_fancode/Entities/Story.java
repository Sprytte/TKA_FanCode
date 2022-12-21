package com.example.tka_fancode.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="stories")
public class Story {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="adaptation_name", nullable = false)
    private String adaptationName;
    //Character foreign Key maybe

    /*@OneToOne(cascade = CascadeType.ALL, optional = false)
    private Address address;

    public Teacher(TeacherRequest teacherRequest)
    {
        firstName = teacherRequest.getFirstName();
        lastName = teacherRequest.getLastName();
        email = teacherRequest.getEmail();
        age = teacherRequest.getAge();

        address = new Address(teacherRequest.getAddress());
    }*/
}
