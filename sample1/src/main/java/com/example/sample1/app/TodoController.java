package com.example.sample1.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {
	public TodoController() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@GetMapping("/")
	public String index() {
		return "todo/index";
	}

	@GetMapping("/add")
	public String add() {
		return "todo/add";
	}
}