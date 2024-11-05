package com.Ino.Inobazaar.product.service;

import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.base.service.BaseService;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.domain.CategoryEntity;
import com.Ino.Inobazaar.category.service.CategoryService;
import com.Ino.Inobazaar.product.domain.ProductDetailsEntity;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import com.Ino.Inobazaar.product.repository.ProductRepository;
import com.Ino.Inobazaar.product.web.mapper.ProductMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductService extends BaseService<ProductEntity> {

    private final CategoryService categoryService;
    private final ProductRepository productRepository;
    private final ProductDetailsService productDetailsService;

    private final ProductMapper productMapper;

    public ProductService(BaseRepository<ProductEntity> repository, CategoryService categoryService, ProductRepository productRepository, ProductDetailsService productDetailsService,
                          final ProductMapper productMapper) {
        super(repository);
        this.categoryService = categoryService;
        this.productRepository = productRepository;
        this.productDetailsService = productDetailsService;
        this.productMapper = productMapper;
    }

    public Page<ProductEntity> pageable(List<ProductEntity> productEntities, Pageable pageable) {
        int page=pageable.getPageNumber();
        int size=pageable.getPageSize();
        int startIndex = (page - 1) * size;
        int endIndex = Math.min(startIndex + size, productEntities.size());
        List<ProductEntity> pageContent = productEntities.subList(startIndex, endIndex);
        long totalElements = productEntities.size();
        return new PageImpl<>(pageContent, PageRequest.of(page - 1, size), totalElements);
    }


    public Page<ProductEntity> findByCategoryId(Long id, Pageable pageable) {
        List<ProductEntity> productEntities =productRepository.findByCategoryId(id);
        return  pageable(productEntities,pageable);
    }

    public Page<ProductEntity> findByName(String name, Pageable pageable) {
        List<ProductEntity> productEntities =productRepository.findByNameContaining(name);
        return  pageable(productEntities,pageable);
    }

    public Map<String,String> showDetails(Long Id){
        ProductEntity productEntity =findOne(Id).get();
        CategoryEntity categoryEntity = categoryService.findByCategoryProductId(productEntity);
        List<CategoryDetailsEntity> categoryDetailEntities = categoryEntity.getCategoryDetailsList();
        List<ProductDetailsEntity> productDetailEntities =productDetailsService.getProductDetails(productEntity.getId());
        Map<String,String> detailsMap = new HashMap<String,String>();
        int i=0;
        if(categoryDetailEntities !=null&& productDetailEntities !=null){
            for(ProductDetailsEntity d: productDetailEntities){
                detailsMap.put(categoryDetailEntities.get(i++).getName(),d.getValue());
            }
        }
        return detailsMap;
    }

}
