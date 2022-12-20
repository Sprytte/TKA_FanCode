package com.example.tka_fancode.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="arcs")
public class Arc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="arc_name", nullable = false)
    private String arcName;
    @Column(name="arc_description", nullable = false)
    private String arcDescription;
    //Adaptation id FK from Story table

}
