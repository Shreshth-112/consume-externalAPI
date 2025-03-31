package com.practice.restTemplateExample.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class PostOfficeResponseDetails {

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Status")
    private String status;


    @JsonProperty("PostOffice")
    private List<PostOfficeDetails> postOfficeDetailsList;

    public List<PostOfficeDetails> getPostOfficeDetailsList() {
        return postOfficeDetailsList;
    }

    public void setPostOfficeDetailsList(List<PostOfficeDetails> postOfficeDetailsList) {
        this.postOfficeDetailsList = postOfficeDetailsList;
    }
}
