package com.artur.toDoApp.model;
//class to comunicate with DB
//from where it will take data and withu what key JpaRepo<From where, key>

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource //with all CRUD
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Task task);

    @RestResource(path="done", rel="done")
    List<Task> findByDone(@Param("state") boolean done);
}
