package com.ghost.todo;

import com.ghost.todo.model.Status;
import com.ghost.todo.model.Task;
import com.ghost.todo.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(TodoRepository taskRepository) {
		return args -> {
			List<Task> tasks = new ArrayList<>();
			tasks.add(new Task(null, "Die", "I want to see hell", Status.completed));
			tasks.add(new Task(null, "Live", "Enjoy earth and all its fruits", Status.undone));
			tasks.add(new Task(null, "Learn Quantum Pyhics", "I want to see what the greatest see", Status.undone));
			tasks.add(new Task(null, "Read Cambidge student guides", "I want to enhance my understanding of natural science", Status.undone));
			tasks.add(new Task(null, "Self teach rocket science", "I want to build a rocket engine", Status.undone));
			tasks.add(new Task(null, "Get a job", "Am broke", Status.undone));
			tasks.add(new Task(null, "Get a love mate", "Its lonely out here", Status.undone));

			taskRepository.saveAll(tasks);
		};
	}

}
