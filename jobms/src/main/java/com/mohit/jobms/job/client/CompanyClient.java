package com.mohit.jobms.job.client;


import com.mohit.jobms.job.external.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="COMPANYMS",url = "${company-service.url}")
public interface CompanyClient {

    @GetMapping("/companies/{id}")
    Company getCompany(@PathVariable("id" )Long id);




}
