package com.practice.restTemplateExample.serviceImpl;

import com.practice.restTemplateExample.output.PostOfficeDetails;
import com.practice.restTemplateExample.output.PostOfficeResponseDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PostalService{

    @Autowired
    RestTemplate restTemplate;

    public PostOfficeResponseDetails fetchPostOfficeDetailsByCity(String cityValue) {

        String url = "https://api.postalpincode.in/postoffice/{city}";
        url = url.replace("{city}", cityValue);
        System.out.println("Url is : " + url);

        ResponseEntity<PostOfficeResponseDetails[]> postalResponseEntity =
                restTemplate.getForEntity(url, PostOfficeResponseDetails[].class);

        System.out.println("Response status code : " + postalResponseEntity.getStatusCode());
        PostOfficeResponseDetails[] responseArray = postalResponseEntity.getBody();

        for (PostOfficeResponseDetails responseItem : responseArray){
            List<PostOfficeDetails> postOfficeList = responseItem.getPostOfficeDetailsList();
            for (PostOfficeDetails pob : postOfficeList){
                System.out.println(pob.getName()+"****"+pob.getBranchType()+"****"+pob.getPincode());
            }
        }
        return responseArray[0];
    }
}
