package com.codeeaser.bluetasks.Domain.task;

import com.codeeaser.bluetasks.Domain.user.AppUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
    
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private String whenToDO;

    private Boolean done;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    public Task() {

    }

    public Task(Long id, String description, String whenToDO, Boolean done) {
        this.id = id;
        this.description = description;
        this.whenToDO = whenToDO;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return description;
    }

    public void setDescricao(String description) {
        this.description = description;
    }

    public String getWhenToDO() {
        return whenToDO;
    }

    public void setWhenToDO(String whenToDO) {
        this.whenToDO = whenToDO;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }


}
