package com.course.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
