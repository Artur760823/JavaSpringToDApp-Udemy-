package com.artur.toDoApp.model;
//class to communicate with DB
//from where it will take data and withu what key JpaRepo<From where, key>

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//with all CRUD
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @RestResource(path="done", rel="done")
    List<Task> findByDone(@Param("state") boolean done);
}
