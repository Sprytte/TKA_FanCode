package com.example.tka_fancode.Response;

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
    private long id;
    private String summaryDescription;
}
/*
    private TeacherResponse teacher;

    public CourseResponse(Course course){
        id = course.getId();
        name = course.getName();
        credits = course.getCredits();
        teacher = new TeacherResponse(course.getTeacher());
    }
*/

