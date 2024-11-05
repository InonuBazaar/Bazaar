package com.Ino.Inobazaar.category.repository;
import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.domain.CategoryEntity;
import com.Ino.Inobazaar.product.domain.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin ( "http://localhost:4200" )
public interface CategoryRepository extends BaseRepository<CategoryEntity> {

    @Query("SELECT c FROM CategoryEntity c WHERE c.id IN (:Ids)")
    List<CategoryEntity> findCategoriesBy(List<Long> Ids);

    CategoryEntity findCategoryByProductEntitySet(List<ProductEntity> productEntityList);

    @Query("SELECT c.categoryDetailsEntityList FROM CategoryEntity c WHERE c.id = :id")
    List<CategoryDetailsEntity> findCategoryDetailsByCategoryId(Long id);

}
