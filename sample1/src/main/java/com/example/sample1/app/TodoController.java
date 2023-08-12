package com.example.sample1.app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sample1.entity.Todo;
import com.example.sample1.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	private final TodoService todoService;

	public TodoController(TodoService todoService) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.todoService = todoService;
	}

	@GetMapping("/")
	public String index(Model model) {
		String sql = "SELECT * from todos;";
		List<Todo> result = this.todoService.getAll();
		model.addAttribute("todoList", result);
		return "todo/index";
	}

	@GetMapping("/add")
	public String add() {
		return "todo/add";
	}
}