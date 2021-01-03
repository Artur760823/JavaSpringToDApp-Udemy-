package com.artur.toDoApp.model;
//class to comunicate with DB
//from where it will take data and withu what key JpaRepo<From where, key>


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //with all CRUD
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
