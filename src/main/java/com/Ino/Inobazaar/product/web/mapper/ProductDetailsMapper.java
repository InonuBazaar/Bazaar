package com.Ino.Inobazaar.product.web.mapper;


import com.Ino.Inobazaar.base.web.mapper.BaseMapper;
import com.Ino.Inobazaar.product.domain.ProductDetailsEntity;
import com.Ino.Inobazaar.product.web.dto.ProductDetailsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDetailsMapper extends BaseMapper<ProductDetailsDTO, ProductDetailsEntity> {
}
