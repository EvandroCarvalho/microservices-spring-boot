package com.microservice.devdojo.core.repository;

import com.microservice.devdojo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
