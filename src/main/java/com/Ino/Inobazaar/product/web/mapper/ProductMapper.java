package com.Ino.Inobazaar.product.web.mapper;


import com.Ino.Inobazaar.base.web.mapper.BaseMapper;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import com.Ino.Inobazaar.product.web.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<ProductDTO, ProductEntity> {


}
