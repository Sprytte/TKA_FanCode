package com.example.tka_fancode.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name="summaries")
@Entity
public class Summary {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="summary_Description", nullable = false)
    private String summaryDescription;
    /*Arc id FK from Arc table
    @Column(name="arc_id", nullable = false)
    private int arcId;*/
    //Adaptation id fk from Story table
}
