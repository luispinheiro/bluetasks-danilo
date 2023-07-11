package com.codeeaser.bluetasks.data;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.codeeaser.bluetasks.Domain.task.Task;
import com.codeeaser.bluetasks.Domain.task.TaskRepository;
import com.codeeaser.bluetasks.Domain.user.AppUser;
import com.codeeaser.bluetasks.Domain.user.AppUserRepository;

@Component
public class InsertTestData {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private TaskRepository taskRepository;

//    public InsertTestData(AppUserRepository appUserRepository, TaskRepository taskRepository) {
//        this.appUserRepository = appUserRepository;
//        this.taskRepository = taskRepository;
//    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //TODO: Criptografar senha
        AppUser appUser = new AppUser(null, "luis", "abc", "Luis Eduardo S Pinheiro");
        appUserRepository.save(appUser);

        LocalDate baseDate = LocalDate.parse("2023-08-15");

        for (int i = 0; i <= 10; i++) {
//            Task task = new Task("Tarefa #" + i, baseDate.plusDays(i), false);

            Task task = new Task("" + i, "desc:" + i, "TODO", true);

            task.setAppUser(appUser);

//            taskRepository.save(task);
            taskRepository.save(task);
        }
        
    }
}
