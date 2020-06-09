package com.slw.my_user.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOneGoodsRequest {

    String name;

    String picUrl;

    Integer stock;

    String description;

    Integer category;

    Integer price;

    @NotNull
    Integer operator;
}
