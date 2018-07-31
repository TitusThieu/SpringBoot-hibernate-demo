package com.higgsup.service.impl;

import com.higgsup.model.entity.BrandEntity;
import com.higgsup.service.BrandRepository;
import com.higgsup.service.ISetupDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetupDemoService implements ISetupDemoService {
    @Autowired
    private BrandRepository brandRepository;

    public void insertDataForBrand() {
        BrandEntity brand1 = new BrandEntity();
        brand1.setBrandName("Honda");
        brandRepository.save(brand1);

        BrandEntity brand2 = new BrandEntity();
        brand2.setBrandName("Yamaha");
        brandRepository.save(brand2);

        BrandEntity brand3 = new BrandEntity();
        brand3.setBrandName("Kawasaki");
        brandRepository.save(brand3);
    }
}
