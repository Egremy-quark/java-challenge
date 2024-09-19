package com.fred.fred_challenge.service;

import com.fred.fred_challenge.model.Task;
import com.fred.fred_challenge.repository.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskMapper taskMapper;

    // Guardar una nueva tarea
    public void saveTask(Task task) {
        taskMapper.insertTask(task);
    }

    // Obtener todas las tareas
    public List<Task> getAllTasks() {
        return taskMapper.findAllTasks();
    }
}
