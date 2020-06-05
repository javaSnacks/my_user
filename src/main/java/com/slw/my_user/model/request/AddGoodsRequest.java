package com.slw.my_user.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddGoodsRequest {

    private String name;

    private Integer price;

    private String description;

    private Integer expiredDay;

    private Integer operator;
}
