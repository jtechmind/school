package com.jtech.school.repositories;

import com.jtech.school.models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher,String> {
}
