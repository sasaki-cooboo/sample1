package com.example.sample1.repository;

import java.util.List;

import com.example.sample1.entity.Todo;

public interface TodoRepository {
	public List<Todo> getAll();

	public void add(Todo todo);
}
