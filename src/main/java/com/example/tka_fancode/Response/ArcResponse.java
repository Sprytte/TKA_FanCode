package com.example.tka_fancode.Response;

import com.example.tka_fancode.Entities.Arc;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArcResponse {
    private long id;
    private String arcName;
    private String arcDescription;
    private StoryResponse story;

    private SummaryResponse summary;

    public ArcResponse(Arc arc) {
        id = arc.getId();
        arcName = arc.getArcName();
        arcDescription = arc.getArcDescription();

        summary = new SummaryResponse(arc.getSummary());
        story = new StoryResponse(arc.getStory());
    }
}

