
package com.Ino.Inobazaar.category.web.rest;


import com.Ino.Inobazaar.base.web.rest.BaseResource;
import com.Ino.Inobazaar.category.domain.CategoryEntity;
import com.Ino.Inobazaar.category.facade.CategoryFacade;
import com.Ino.Inobazaar.category.web.dto.CategoryDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")

public class CategoryResource extends BaseResource<CategoryDTO, CategoryEntity> {

    public CategoryResource(final CategoryFacade facade) {
        super(facade);
    }

    @Override
    public Class<?> getLoggerClass() {
        return this.getClass();
    }

    @Override
    public CategoryFacade getFacade() {
        return (CategoryFacade) super.getFacade();
    }
}

