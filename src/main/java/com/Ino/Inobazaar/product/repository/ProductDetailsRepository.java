package com.Ino.Inobazaar.product.repository;


import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.product.domain.ProductDetailsEntity;

import java.util.List;

public interface ProductDetailsRepository extends BaseRepository<ProductDetailsEntity> {
    List<ProductDetailsEntity> findByProductId(Long productId);
}
