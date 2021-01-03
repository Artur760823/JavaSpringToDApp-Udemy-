package com.artur.toDoApp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity //under this will be table from DB (every variable will be collumn in table)
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy of generate id
    private int id; //id needs @Id

    @NotBlank(message="Tasks description must be not null") //validation description
    private String description;
    private boolean done;

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
