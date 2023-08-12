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

}
