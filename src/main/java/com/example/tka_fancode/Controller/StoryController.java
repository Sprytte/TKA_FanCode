package com.example.tka_fancode.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("TKA/Fan_Page")
public class StoryController {
}

/*@RestController
@CrossOrigin("*")
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{teacher_id}/courses")
    public CourseResponse addCourse(
            @PathVariable long teacher_id,
            @Valid @RequestBody CourseRequest courseRequest
            ){
        return new CourseResponse(teacherService.addCourse(teacher_id, courseRequest));
    }

    @GetMapping("/{teacherId}/courses")
    public List<CourseResponse> getAllCourses(@PathVariable long teacherId){
        List<Course> courses = teacherService.getAllCourses(teacherId);
        List<CourseResponse> courseResponses = new ArrayList<>();
        for(int i=0; i < courses.size(); i++){
            courseResponses.add(new CourseResponse(courses.get(i)));
        }

        return courseResponses;
    }

    @DeleteMapping("/{teacherId}/courses")
    public void deleteAllCourses(@PathVariable long teacherId){
        teacherService.deleteAllCourses(teacherId);
    }
    @GetMapping()
    public List<TeacherResponse> getAllTeachers(@RequestParam(required = false) String firstName){

        List<Teacher> teachers = teacherService.getAllTeachers(firstName);
        List<TeacherResponse> teacherResponses = new ArrayList<>();
        teachers.forEach(teacher -> {
            TeacherResponse teacherResponse = new TeacherResponse(teacher);
            teacherResponses.add(teacherResponse);
        });
        return teacherResponses;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public TeacherResponse addTeacher(@Valid @RequestBody TeacherRequest teacherRequest)
    {

            Teacher savedTeacher = teacherService.addTeacher(teacherRequest);

            return new TeacherResponse(savedTeacher);

    }

    @PutMapping("/{id}")
    public TeacherResponse updateTeacher
            (@PathVariable long id,
             @Valid @RequestBody TeacherRequest teacherRequest){

        Teacher updatedTeacher = teacherService.updateTeacher(id, teacherRequest);
        return new TeacherResponse(updatedTeacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable long id)
    {
        teacherService.deleteTeacher(id);
    }
}*/