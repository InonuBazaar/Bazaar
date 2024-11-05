package com.Ino.Inobazaar.base.repository;

import com.Ino.Inobazaar.base.domain.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Set;

@NoRepositoryBean
public interface BaseRepository <T extends BaseEntity> extends SolidRepository<T,Long> {
    Set<T> findAllByIdIn(Set<Long> ids);

}
