package com.Ino.Inobazaar.product.facade;

import com.Ino.Inobazaar.base.facade.BaseFacade;
import com.Ino.Inobazaar.product.domain.ProductDetailsEntity;
import com.Ino.Inobazaar.product.service.ProductDetailsService;
import com.Ino.Inobazaar.product.web.dto.ProductDetailsDTO;
import com.Ino.Inobazaar.product.web.mapper.ProductDetailsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductDetailsFacade extends BaseFacade<ProductDetailsDTO, ProductDetailsEntity> {
    public ProductDetailsFacade(final ProductDetailsService service,
                                final ProductDetailsMapper mapper) {
        super(service, mapper);
    }

    @Override
    public Class<ProductDetailsDTO> getDtoClass() {
        return ProductDetailsDTO.class;
    }

    @Override
    public ProductDetailsService getService() {
        return (ProductDetailsService) super.getService();
    }

    @Override
    public ProductDetailsMapper getMapper() {
        return (ProductDetailsMapper) super.getMapper();
    }
}
