package com.Ino.Inobazaar.base.repository;

import com.Ino.Inobazaar.base.domain.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@NoRepositoryBean

public interface SolidRepository <T extends BaseEntity,ID> extends JpaRepository<T,ID> {
    Optional<T> findByIdWithEagerRelations(Long id, final Set<String> relations);

    List<T> findAllByIdsInWithEagerRelations(List<Long> ids, final Set<String> relations);

    EntityManager getEntityManager();

    CriteriaQuery<T> criteriaQuery();

    void detach(T entity);

    T attach(T entity);

    Class<T> getEntityClass();
}
