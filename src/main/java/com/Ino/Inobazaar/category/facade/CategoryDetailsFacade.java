package com.Ino.Inobazaar.category.facade;


import com.Ino.Inobazaar.base.facade.BaseFacade;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.service.CategoryDetailsService;
import com.Ino.Inobazaar.category.web.dto.CategoryDetailsDTO;
import com.Ino.Inobazaar.category.web.mapper.CategoryDetailsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryDetailsFacade extends BaseFacade<CategoryDetailsDTO, CategoryDetailsEntity> {

    public CategoryDetailsFacade(final CategoryDetailsService service,
                                 final CategoryDetailsMapper mapper) {
        super(service, mapper);
    }

    @Override
    public Class<CategoryDetailsDTO> getDtoClass() {
        return CategoryDetailsDTO.class;
    }
}
