package com.slw.my_user.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddGoodsRequest {

    private String name;

    private Integer price;

    private String picUrl;

    private Integer stock;

    private String description;

    private Integer category;

    private Integer expiredDay;

    private Integer operator;
}
