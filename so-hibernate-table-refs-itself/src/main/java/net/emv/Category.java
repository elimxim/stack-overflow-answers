package net.emv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.lang.annotation.Inherited;
import java.util.List;

@Getter
@Setter
@Entity
@Embeddable
public class Category implements Serializable {

    @Id
    private String name;
    private String parent;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "parent", insertable = false, updatable = false)
    private Category parentCategory;

    @OneToMany
    @JsonIgnore
    @JoinTable(name = "category",
            joinColumns = {@JoinColumn(name = "parent")},
            inverseJoinColumns = {@JoinColumn(name = "name")})
    private List<Category> childCategories;
}
