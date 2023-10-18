package com.ghost.todo.controller;

import com.ghost.todo.model.Task;
import com.ghost.todo.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
@CrossOrigin
public class TodoController {
    private final TodoRepository taskRepository;
    public TodoController(TodoRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("")
    public List<Task> findAll() {
        return this.taskRepository.findAll();
    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("")
//    public void createTask(@Valid @RequestBody CreateTaskDto createTaskDto) {
//        Task task = new Task(null, createTaskDto.title(), createTaskDto.description(), Status.undone);
//        taskRepository.save(task);
//    }

//    @ResponseStatus(HttpStatus.ACCEPTED)
//    @PatchMapping("/task/{id}")
//    public void update(@Valid @RequestBody UpdateTaskDto updateTaskDto, @PathVariable Integer id) {
//        if (taskRepository.existsById(id)) {
//            taskRepository.deleteById(id);
//            Task task = new Task(id, updateTaskDto.title(), updateTaskDto.description(), updateTaskDto.status());
//            taskRepository.save(task);
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found in your tasks!");
//        }
//    }


//    @ResponseStatus(HttpStatus.ACCEPTED)
//    @PutMapping("/task/{id}")
//    public void setStatus(@RequestBody Status status, @PathVariable UUID id) {
//        if (taskRepository.existsById(id)) {
//            taskRepository.updateTaskStatusById(id, status);
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found in your tasks!");
//        }
//    }

//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/task/{id}")
//    public void deleteTask(@PathVariable Integer id) {
//        taskRepository.deleteById(id);
//    }

}
