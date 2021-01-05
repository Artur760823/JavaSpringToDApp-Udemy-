package com.artur.toDoApp.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

//white list of methods
public interface TaskRepository {
    List<Task> findAll();
    Optional<Task> findById(Integer id);
    boolean existsById(Integer id);
    List<Task> findByDone(@Param("state") boolean done);
    Task save(Task entity);
    Page<Task> findAll(Pageable page);
}
