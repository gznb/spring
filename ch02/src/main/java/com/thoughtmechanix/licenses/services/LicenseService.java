/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.thoughtmechanix.licenses.services;

import com.thoughtmechanix.licenses.model.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author gz
 * @date 2020/6/3 3:16
 */
@Service
public class LicenseService {
    public License getLicense(String licenseId){
        return new License()
                .withId(licenseId)
                .withOrganizationId(UUID.randomUUID().toString())
                .withProductName("Test Product Name")
                .withLicenseType("PerSeat");
    }
    public void saveLicense(License licenseId){

    }
    public void updateLicense(License licenseId){

    }
    public void deleteLicense(License licenseId){

    }

}