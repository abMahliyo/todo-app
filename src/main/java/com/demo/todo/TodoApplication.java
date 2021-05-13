package com.demo.todo;

import com.demo.todo.domain.ToDo;
import com.demo.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	public ToDoRepository toDoRepository;
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<ToDo> todos = Arrays.asList(new ToDo("Play volleyball", "No"),new ToDo("Cooking","Yes"),new ToDo("Learn Kafka","Yes"));
		todos.forEach(toDoRepository::save);
	}
}
