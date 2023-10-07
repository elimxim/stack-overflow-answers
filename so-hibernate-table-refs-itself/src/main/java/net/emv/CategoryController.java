package net.emv;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/category")
@AllArgsConstructor
public class CategoryController {
    private final CategoryRepository repository;

    @GetMapping(path = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDto> findCategory(@PathVariable(name = "name") String name) {
        Optional<Category> optCategory = repository.findById(name);

        if (optCategory.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        var category = optCategory.get();
        var dto = new CategoryDto();
        dto.setName(category.getName());
        dto.setParent(Optional.ofNullable(category.getParentCategory())
                .map(Category::getName)
                .orElse(null)
        );
        dto.setChildren(Optional.ofNullable(category.getChildCategories())
                .orElse(Collections.emptyList())
                .stream().map(Category::getName)
                .collect(Collectors.toList())
        );

        return ResponseEntity.ok(dto);
    }
}
