package com.example.tka_fancode.Entities;

import com.example.tka_fancode.Request.SummaryRequest;
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

    public Summary(SummaryRequest summaryRequest){
        summaryDescription = summaryRequest.getSummaryDescription();
    }
}
