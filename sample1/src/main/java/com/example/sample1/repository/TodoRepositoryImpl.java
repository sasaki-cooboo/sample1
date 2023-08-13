package com.example.sample1.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sample1.entity.Todo;

@Repository
public class TodoRepositoryImpl implements TodoRepository {
	private final JdbcTemplate jdbcTemplate;

	public TodoRepositoryImpl(JdbcTemplate jdbcTemplate) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Todo> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		String sql = "SELECT * from todos;";
		List<Map<String, Object>> result = this.jdbcTemplate.queryForList(sql);
		List<Todo> todoList = new ArrayList<Todo>();
		for (Map<String, Object> map : result) {
			Todo todo = new Todo();
			todo.setId((int) map.get("id"));
			todo.setStatus((int) map.get("status"));
			todo.setTitle((String) map.get("title"));
			Date deadline = (Date) map.get("deadline");
			todo.setDeadline((LocalDate) deadline.toLocalDate());
			todoList.add(todo);
		}
		return todoList;
	}

	@Override
	public void add(Todo todo) {
		// TODO 自動生成されたメソッド・スタブ
		String sql = "INSERT INTO todos (status,title,deadline) VALUES(1,?,?);";
		this.jdbcTemplate.update(sql, todo.getTitle(), todo.getDeadline());
	}

}
