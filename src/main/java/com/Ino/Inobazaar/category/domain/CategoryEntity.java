package com.Ino.Inobazaar.category.domain;


import com.Ino.Inobazaar.base.domain.BaseEntity;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="categories")
public class CategoryEntity extends BaseEntity {

    @Column(name="parent_id")
    private Long parentId;

    @Column
    String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryEntity")
    private Set<ProductEntity> productEntitySet = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "category_category_details",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "category_details_id"))
    private List<CategoryDetailsEntity> categoryDetailsEntityList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id" ,insertable = false,updatable = false)
    CategoryEntity parent;

    public List<CategoryDetailsEntity> getCategoryDetailsList() {
        return categoryDetailsEntityList;
    }

    public void setCategoryDetailsList(List<CategoryDetailsEntity> categoryDetailsEntityList) {
        this.categoryDetailsEntityList = categoryDetailsEntityList;
    }

    public CategoryEntity getParent() {
        return parent;
    }

    public void setParent(CategoryEntity parent) {
        this.parent = parent;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<ProductEntity> getProductSet() {
        return productEntitySet;
    }

    public void setProductSet(Set<ProductEntity> productEntitySet) {
        this.productEntitySet = productEntitySet;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(final Long parentId) {
        this.parentId = parentId;
    }
}
