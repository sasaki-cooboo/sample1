package com.example.sample1.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Todo {
	public int id;
	public int status;
	public String title;
	public LocalDate deadline;
}
