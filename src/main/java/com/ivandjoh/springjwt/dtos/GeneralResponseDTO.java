package com.ivandjoh.springjwt.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"code", "status_code", "message"})
public class GeneralResponseDTO {

    @JsonProperty("code")
    private int code;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("message")
    private String message;
}
