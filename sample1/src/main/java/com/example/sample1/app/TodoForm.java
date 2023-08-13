package com.example.sample1.app;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TodoForm {
	public int id;
	public int status;
	@NotBlank
	@Size(max = 50)
	public String title;
	public LocalDate deadline;
}
