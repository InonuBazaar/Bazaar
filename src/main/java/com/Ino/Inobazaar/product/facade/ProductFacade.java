package com.Ino.Inobazaar.product.facade;


import com.Ino.Inobazaar.base.facade.BaseFacade;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import com.Ino.Inobazaar.product.service.ProductService;
import com.Ino.Inobazaar.product.web.dto.ProductDTO;
import com.Ino.Inobazaar.product.web.mapper.ProductMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class ProductFacade extends BaseFacade<ProductDTO, ProductEntity> {

    public ProductFacade(final ProductService service, final ProductMapper mapper) {
        super(service, mapper);
    }
    @Override
    public Page<ProductDTO> findAll(final Pageable pageable) {
        Page<ProductEntity> productPage = getService().findAll(pageable);
        return productPage.map(getMapper()::toDto);
    }

    public Page<ProductDTO> findByCategoryId(Long categoryId , Pageable pageable) {
        Page<ProductEntity> productPage = getService().findByCategoryId(categoryId,pageable);
        return productPage.map(getMapper()::toDto);
    }

    public Page<ProductDTO> findByName(String name , Pageable pageable) {
        Page<ProductEntity> productPage = getService().findByName(name,pageable);
        return productPage.map(getMapper()::toDto);
    }

    public Map<String,String> showDetails(Long Id){
        return getService().showDetails(Id);
    }

    @Override
    public ProductService getService() {
        return (ProductService) super.getService();
    }

    @Override
    public ProductMapper getMapper() {
        return (ProductMapper) super.getMapper();
    }

    @Override
    public Class<ProductDTO> getDtoClass() {
        return ProductDTO.class;
    }
}
