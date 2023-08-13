package com.example.sample1.app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		List<Todo> result = this.todoService.getAll();
		model.addAttribute("todoList", result);
		return "todo/index";
	}

	@GetMapping("/add")
	public String add(TodoForm todoForm) {
		return "todo/add";
	}

	@PostMapping("/add")
	public String insert(Model model, @Validated TodoForm todoForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "todo/add";
		}
		Todo todo = new Todo();
		todo.setTitle(todoForm.getTitle());
		todo.setDeadline(todoForm.getDeadline());
		this.todoService.add(todo);
		List<Todo> result = this.todoService.getAll();
		model.addAttribute("todoList", result);
		return "redirect:";
	}

	@PostMapping("/update")
	public String update(Model model, @Validated TodoUpdateForm todoUpdateForm) {
		this.todoService.complete(todoUpdateForm.getId());
		List<Todo> result = this.todoService.getAll();
		model.addAttribute("todoList", result);
		return "redirect:";
	}
}