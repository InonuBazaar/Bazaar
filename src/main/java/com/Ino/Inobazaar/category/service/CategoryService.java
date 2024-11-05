package com.Ino.Inobazaar.category.service;


import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.base.service.BaseService;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.domain.CategoryEntity;
import com.Ino.Inobazaar.category.repository.CategoryRepository;
import com.Ino.Inobazaar.category.web.dto.CategoryDetailsDTO;
import com.Ino.Inobazaar.category.web.mapper.CategoryDetailsMapper;
import com.Ino.Inobazaar.category.web.mapper.CategoryMapper;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService extends BaseService<CategoryEntity> {

    private  final CategoryDetailsService categoryDetailsService;
    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    private final CategoryDetailsMapper categoryDetailsMapper;


    public CategoryService(BaseRepository<CategoryEntity> repository, CategoryDetailsService categoryDetailsService,
                           CategoryRepository categoryRepository, final CategoryMapper categoryMapper,
                           final CategoryDetailsMapper categoryDetailsMapper) {
        super(repository);
        this.categoryDetailsService = categoryDetailsService;
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
        this.categoryDetailsMapper = categoryDetailsMapper;
    }

    public CategoryEntity findByCategoryProductId(ProductEntity productEntity){
        List<ProductEntity> productEntities =new ArrayList<>();
        productEntities.add(productEntity);
        CategoryEntity categoryEntity =categoryRepository.findCategoryByProductEntitySet(productEntities);
        return categoryEntity;
    }

    public List<CategoryDetailsDTO> getCategoryDetails(Long categoryId) {
        List<CategoryDetailsEntity> categoryDetailsEntityList = categoryRepository.findCategoryDetailsByCategoryId(categoryId);
        List<CategoryDetailsDTO> categoryDetailsDTOS =new ArrayList<>();
        for(CategoryDetailsEntity categoryDetailsEntity : categoryDetailsEntityList){
            categoryDetailsDTOS.add(categoryDetailsMapper.toDto(categoryDetailsEntity));
        }
       return categoryDetailsDTOS;
    }
    public List<CategoryEntity> findAll(List<Long> Ids){
        return categoryRepository.findCategoriesBy(Ids);
    }




}
