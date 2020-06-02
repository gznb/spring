/*
 * Copyright 2020 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author gz
 * @date 2020/6/3 2:54
 */
@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @Autowired
    private LicenseService licenseService;

    @RequestMapping(value = "/{licenseId}",method = RequestMethod.GET)
    public License getLicense(
        @PathVariable("organizationId") String organizationId,
        @PathVariable("licenseId") String licenseId) {
        return new License()
                .withId(licenseId)
                .withProductName("项目名")
                .withLicenseType("许可类型")
                .withOrganizationId(organizationId);
    }

    @RequestMapping(value = "/{licenseId}",method = RequestMethod.PUT)
    public String updateLicense(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the put");
    }

    @RequestMapping(value = "/{licenseId}",method = RequestMethod.POST)
    public String saveLicense(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the save");
    }


    @RequestMapping(value = "/{licenseId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicense(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the delete");
    }
}