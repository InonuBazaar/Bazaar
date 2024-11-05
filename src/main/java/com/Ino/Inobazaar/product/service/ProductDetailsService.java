package com.Ino.Inobazaar.product.service;

import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.base.service.BaseService;
import com.Ino.Inobazaar.product.domain.ProductDetailsEntity;
import com.Ino.Inobazaar.product.repository.ProductDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailsService extends BaseService<ProductDetailsEntity> {
    private final ProductDetailsRepository productDetailsRepository;

    public ProductDetailsService(BaseRepository<ProductDetailsEntity> repository, ProductDetailsRepository productDetailsRepository) {
        super(repository);
        this.productDetailsRepository = productDetailsRepository;
    }

    public List<ProductDetailsEntity> getProductDetails(Long productId){
        return productDetailsRepository.findByProductId(productId);
    }

}
