package com.example.sample1.app;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TodoUpdateForm {
	//	@Pattern(regexp = "^[0-9]+$", message = "半角数字で入力してください")
	@NotNull
	public int id;
}
