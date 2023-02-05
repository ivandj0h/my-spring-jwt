package com.ivandjoh.springjwt.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"name", "welcome_message", "data"})
public class HomeDTO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("welcome_message")
    private String wecomeMessage;
    @JsonProperty("data")
    private GeneralResponseDTO data;

    public HomeDTO(String s) {
        this.wecomeMessage = s;
    }
}
