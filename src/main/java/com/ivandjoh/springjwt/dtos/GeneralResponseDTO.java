package com.ivandjoh.springjwt.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonPropertyOrder({"code", "status_code"})
public class GeneralResponseDTO {

    @JsonProperty("code")
    private int code;
    @JsonProperty("status_code")
    private String codeStatus;
}
