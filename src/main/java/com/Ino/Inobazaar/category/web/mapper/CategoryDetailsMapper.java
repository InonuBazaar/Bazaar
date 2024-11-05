package com.Ino.Inobazaar.category.web.mapper;


import com.Ino.Inobazaar.base.web.mapper.BaseMapper;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.web.dto.CategoryDetailsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryDetailsMapper extends BaseMapper<CategoryDetailsDTO, CategoryDetailsEntity> {

}
