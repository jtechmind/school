package com.jtech.school.repositories;

import com.jtech.school.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,String> {
}
