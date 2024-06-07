package com.example.demo.basic.Ajax.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AjaxDto {
    private String param1;
    private String param2;

    public AjaxDto(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
}
