package com.example.tka_fancode.Response;

import com.example.tka_fancode.Entities.Summary;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SummaryResponse {
    private String summaryDescription;

    public SummaryResponse(Summary summary) {
        summaryDescription = summary.getSummaryDescription();
    }
}

