package com.boot.todo.integration.configl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.boot.todo.integration.model.ToDo;

@Component
public class ToDoMessageHandler {
	private Logger log = LoggerFactory.getLogger(ToDoMessageHandler.class);

	public void process(ToDo todo) {
		log.info(">>> {}", todo);
		// More process...
	}
}