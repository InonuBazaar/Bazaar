package com.Ino.Inobazaar.category.domain;

import com.Ino.Inobazaar.base.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category_details")
public class CategoryDetailsEntity extends BaseEntity {

    @Column()
    String name;

    @ManyToMany(mappedBy = "categoryDetailsEntityList", fetch = FetchType.LAZY)
    private List<CategoryEntity> categoryEntityList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryEntity> getCategoryList() {
        return categoryEntityList;
    }

    public void setCategoryList(List<CategoryEntity> categoryEntityList) {
        this.categoryEntityList = categoryEntityList;
    }
}
