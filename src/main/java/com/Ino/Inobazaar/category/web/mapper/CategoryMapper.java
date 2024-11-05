package com.Ino.Inobazaar.category.web.mapper;


import com.Ino.Inobazaar.base.web.mapper.BaseMapper;
import com.Ino.Inobazaar.category.domain.CategoryEntity;
import com.Ino.Inobazaar.category.web.dto.CategoryDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<CategoryDTO, CategoryEntity> {

    //@Mapping(target = "productSet", conditionExpression = "java(entity.getProductSet())")
   // public abstract CategoryDto toDto(Category entity);



}
