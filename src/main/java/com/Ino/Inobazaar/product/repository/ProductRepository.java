package com.Ino.Inobazaar.product.repository;


import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

public interface ProductRepository extends BaseRepository<ProductEntity> {
    List<ProductEntity> findByCategoryId(@Param("id") Long id);

    List<ProductEntity> findByNameContaining(@Param("name") String name);
}
