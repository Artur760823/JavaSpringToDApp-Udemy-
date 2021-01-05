package com.artur.toDoApp.model;
//class to communicate with DB
//from where it will take data and with what key JpaRepo<From where, key>

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//with all CRUD
public interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> { //it can be private becouse BING can find private elements
//    @RestResource(path="done", rel="done")
    List<Task> findByDone(@Param("state") boolean done);
}
