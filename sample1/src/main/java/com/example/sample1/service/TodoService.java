package com.example.sample1.service;

import java.util.List;

import com.example.sample1.entity.Todo;

public interface TodoService {
	public List<Todo> getAll();

	public void add(Todo todo);

	public void complete(int id);
}
