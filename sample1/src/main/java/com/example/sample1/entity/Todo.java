package com.example.sample1.entity;

import java.time.LocalDate;

public class Todo {
	public int id;
	public int status;
	public String title;
	public LocalDate deadline;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
