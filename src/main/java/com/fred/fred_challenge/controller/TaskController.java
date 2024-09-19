package com.fred.fred_challenge.controller;

import com.fred.fred_challenge.model.Task;
import com.fred.fred_challenge.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    // Mostrar formulario para crear una nueva tarea
    @GetMapping("/create")
    public String showCreateTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "create-task";
    }


    @PostMapping("/create")
    public String createTask(@ModelAttribute Task task, @RequestParam("startDate") String startDate) {
        System.out.println("Fecha recibida como String: " + startDate);

        // Intentar convertir manualmente el String a LocalDate
        try {
            task.setStartDate(LocalDate.parse(startDate));  // Aquí estamos convirtiendo el String
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }

        System.out.println("Fecha de inicio después de la conversión: " + task.getStartDate());

        taskService.saveTask(task);
        return "redirect:/tasks";
    }


    // Mostrar el listado de tareas
    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "task-list";
    }
}
