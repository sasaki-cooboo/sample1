package com.example.sample1.app;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TodoForm {
	public int status;
	@NotBlank
	@Size(max = 50)
	public String title;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate deadline;
}
