package com.example.sample1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sample1.entity.Todo;
import com.example.sample1.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	private TodoRepository todoRepository;

	public TodoServiceImpl(TodoRepository todoRepository) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.todoRepository = todoRepository;
	}

	@Override
	public List<Todo> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		return this.todoRepository.getAll();
	}

	@Override
	public void add(Todo todo) {
		// TODO 自動生成されたメソッド・スタブ
		this.todoRepository.add(todo);
	}

	@Override
	public void complete(int id) {
		// TODO 自動生成されたメソッド・スタブ
		this.todoRepository.complete(id);
	}

}
