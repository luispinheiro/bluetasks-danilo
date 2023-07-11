package com.codeeaser.bluetasks.Domain.task;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    
    Task findByDescription(String description);

    Task save(Task task);

}
