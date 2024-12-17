package org.shineyourhobbies.shineyourhobbies.model.entities;

import lombok.Setter;
import org.shineyourhobbies.shineyourhobbies.model.entities.enums.CategoryNameEnum;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Setter
public class Category {
    private CategoryNameEnum name ;

    public Category(CategoryNameEnum name) {
        this.name = name;
    }

    public Category() {
    }

    @Column(unique=true)
    @Enumerated(EnumType.STRING)
    public CategoryNameEnum getName() {
        return name;
    }

}
