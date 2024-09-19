package com.fred.fred_challenge.repository;

import com.fred.fred_challenge.model.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {

    // Insertar una nueva tarea en la base de datos
    @Insert("INSERT INTO tasks (name, description, start_date) VALUES (#{name}, #{description}, #{startDate})")
    void insertTask(Task task);

    // Obtener todas las tareas desde la base de datos
    @Select("SELECT * FROM tasks")
    List<Task> findAllTasks();
}
