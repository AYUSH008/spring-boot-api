package com.springboot.learning;

import com.springboot.learning.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        //System.out.println("calling all course endpoint");
        return Arrays.asList(
                new Course(1,"Learn Spring","Youtube"),
                new Course(2,"Learn Docker","Youtube")

                );
    }
}
