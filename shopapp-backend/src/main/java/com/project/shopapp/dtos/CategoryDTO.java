package com.project.shopapp.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data //toString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    @NotEmpty(message = "Category's name cannot be empty")
    private String name;
}
