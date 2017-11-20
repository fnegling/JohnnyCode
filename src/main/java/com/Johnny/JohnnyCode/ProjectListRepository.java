package com.Johnny.JohnnyCode;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectListRepository extends JpaRepository<Project, Long> {
    List<Project> findByProject(String Project);
}
