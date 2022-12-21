package com.example.tka_fancode.Response;

import com.example.tka_fancode.Entities.Story;
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
    private String briefSummary;
    private String rating;
    private String creators;
    private String length;
    private String fullSummary;
    private String extraInformation;

    public StoryResponse(Story story){
        id = story.getId();
        adaptationName = story.getAdaptationName();
        briefSummary = story.getBriefSummary();
        rating = story.getRating();
        creators = story.getCreators();
        length = story.getLength();
        fullSummary = story.getFullSummary();
        extraInformation = story.getExtraInformation();
    }

    /*private AddressResponse address;
    public TeacherResponse(Teacher teacher){
        address = new AddressResponse(teacher.getAddress());
    }*/
}

