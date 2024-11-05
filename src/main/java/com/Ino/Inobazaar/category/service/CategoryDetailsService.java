package com.Ino.Inobazaar.category.service;


import com.Ino.Inobazaar.base.repository.BaseRepository;
import com.Ino.Inobazaar.base.service.BaseService;
import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.repository.CategoryDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryDetailsService extends BaseService<CategoryDetailsEntity> {


    public CategoryDetailsService(BaseRepository<CategoryDetailsEntity> repository) {
        super(repository);

    }

    public List<CategoryDetailsEntity> findAll(List<Long> Ids){
        return getRepository().findCategoryDetailsBy(Ids);
    }



    @Override
    public CategoryDetailsRepository getRepository(){
        return (CategoryDetailsRepository) super.getRepository();
    }


}
