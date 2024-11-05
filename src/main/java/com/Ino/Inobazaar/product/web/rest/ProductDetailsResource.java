
package com.Ino.Inobazaar.product.web.rest;

import com.Ino.Inobazaar.base.web.rest.BaseResource;
import com.Ino.Inobazaar.product.domain.ProductDetailsEntity;
import com.Ino.Inobazaar.product.facade.ProductDetailsFacade;
import com.Ino.Inobazaar.product.web.dto.ProductDetailsDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prdDetails")
public class ProductDetailsResource extends BaseResource<ProductDetailsDTO, ProductDetailsEntity> {


    public ProductDetailsResource(final ProductDetailsFacade facade) {
        super(facade);
    }

    @Override
    public Class<?> getLoggerClass() {
        return this.getClass();
    }
    @Override
    public ProductDetailsFacade getFacade() {
        return (ProductDetailsFacade) super.getFacade();
    }
}

