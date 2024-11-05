package com.Ino.Inobazaar.category.web.dto;


import com.Ino.Inobazaar.base.web.dto.BaseDTO;

import java.util.List;

public class CategoryDetailsDTO extends BaseDTO {

    String name;

    List<CategoryDetailsDTO> categoryList;


    public List<CategoryDetailsDTO> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(final List<CategoryDetailsDTO> categoryList) {
        this.categoryList = categoryList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
