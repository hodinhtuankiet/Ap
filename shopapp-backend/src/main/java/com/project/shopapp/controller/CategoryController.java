package com.project.shopapp.controller;

import com.project.shopapp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
//@Validated
public class CategoryController {
    @GetMapping("")
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok(String.format("getAllCategory, page = %d, limit = %d", page, limit));
    }

    @PostMapping("")
    public ResponseEntity<?> insertCategory(
            // ở đây dùng ? vì dùng cho cả List<String> và String categoryDTO
            @Valid @RequestBody CategoryDTO categoryDTO,
            BindingResult result) {
        // Kiểm tra nếu có lỗi validate
        if (result.hasErrors()) {
            // Lấy danh sách lỗi từ BindingResult
            List<String> errorMessages = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage) // Lấy thông báo lỗi mặc định
                    .toList(); // Chuyển thành List<String>

            // Trả về phản hồi với mã lỗi 400 và danh sách thông báo lỗi
            return ResponseEntity.badRequest().body(errorMessages);
        }
        return ResponseEntity.ok("This is insertCategory: " + categoryDTO);
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategories(@PathVariable Long id) {
        return ResponseEntity.ok("update categories with id " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategories(@PathVariable Long id) {
        return ResponseEntity.ok("del categories");
    }
}
