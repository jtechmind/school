package com.jtech.school.repositories;

import com.jtech.school.models.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student, ObjectId> {
}
