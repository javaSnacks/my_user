package com.slw.my_user.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateOneGoodsRequest {

    String name;

    String description;

    Integer price;

    Integer operator;
}
