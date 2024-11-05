package com.Ino.Inobazaar.category.repository;


import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin( "http://localhost:4200" )
@Repository
public interface CategoryDetailsRepository extends BaseRepository<CategoryDetailsEntity> {

    @Query("SELECT c FROM CategoryDetailsEntity c WHERE c.id IN (:Ids)")
    List<CategoryDetailsEntity> findCategoryDetailsBy(List<Long> Ids);

}
