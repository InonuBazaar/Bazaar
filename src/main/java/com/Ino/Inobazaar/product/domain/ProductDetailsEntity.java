package com.Ino.Inobazaar.product.domain;

import com.Ino.Inobazaar.base.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class ProductDetailsEntity extends BaseEntity {

    @Column(nullable = false)
    private String value;
    @Column(nullable = false)
    private Long productId;
    @Column(nullable = false)
    private Long categoryDetailsId;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCategoryDetailsId() {
        return categoryDetailsId;
    }

    public void setCategoryDetailsId(Long categoryDetailsId) {
        this.categoryDetailsId = categoryDetailsId;
    }
}
