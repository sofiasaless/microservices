package com.learningms.course.endpoint.service;


import com.learningms.core.model.Course;
import com.learningms.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class CourseService {

    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable page) {
        log.info("Listing all courses");
        return courseRepository.findAll(page);
    }

}
