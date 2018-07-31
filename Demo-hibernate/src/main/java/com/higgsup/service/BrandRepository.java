package com.higgsup.service;

import com.higgsup.model.entity.BrandEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends PagingAndSortingRepository<BrandEntity, String> {
}
