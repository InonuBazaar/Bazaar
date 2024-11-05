
package com.Ino.Inobazaar.category.web.rest;


import com.Ino.Inobazaar.base.web.rest.BaseResource;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.facade.CategoryDetailsFacade;
import com.Ino.Inobazaar.category.web.dto.CategoryDetailsDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/catDetails")

public class CategoryDetailsResource extends BaseResource<CategoryDetailsDTO, CategoryDetailsEntity> {


    public CategoryDetailsResource(final CategoryDetailsFacade facade) {
        super(facade);
    }


    @Override
    public Class<?> getLoggerClass() {
        return this.getClass();
    }

    @Override
    public CategoryDetailsFacade getFacade() {
        return (CategoryDetailsFacade) super.getFacade();
    }
}

