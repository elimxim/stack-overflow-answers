package net.emv;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private String name;
    private String parent;
    private List<String> children;
}
