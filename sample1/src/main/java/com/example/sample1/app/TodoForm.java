package com.example.sample1.app;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TodoForm {
	public int status;
	@NotBlank
	@Length(min = 1, max = 20)
	public String title;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate deadline;
}
