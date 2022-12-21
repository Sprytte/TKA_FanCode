package com.example.tka_fancode.Entities;

import com.example.tka_fancode.Request.StoryRequest;
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
    @Column(name="brief_summary", nullable = false)
    private String briefSummary;
    @Column(name="rating", nullable = false)
    private double rating;
    @Column(name="creators", nullable = false)
    private String creators;
    @Column(name="length", nullable = false)
    private String length;
    @Column(name="full_summary", nullable = false)
    private String fullSummary;
    @Column(name="extra_information", nullable = false)
    private String extraInformation;
    //Character foreign Key maybe

    public Story(StoryRequest storyRequest){
        adaptationName = storyRequest.getAdaptationName();
        briefSummary = storyRequest.getBriefSummary();
        rating = storyRequest.getRating();
        creators = storyRequest.getCreators();
        length = storyRequest.getLength();
        fullSummary = storyRequest.getFullSummary();
        extraInformation = storyRequest.getExtraInformation();
    }
}
