package com.Ino.Inobazaar.category.facade;

import com.Ino.Inobazaar.base.facade.BaseFacade;
import com.Ino.Inobazaar.category.domain.CategoryEntity;
import com.Ino.Inobazaar.category.service.CategoryService;
import com.Ino.Inobazaar.category.web.dto.CategoryDTO;
import com.Ino.Inobazaar.category.web.mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryFacade extends BaseFacade<CategoryDTO, CategoryEntity> {
    public CategoryFacade(final CategoryService service,
                          final CategoryMapper mapper) {
        super(service, mapper);
    }

    @Override
    public Class<CategoryDTO> getDtoClass() {
        return CategoryDTO.class;
    }
}
