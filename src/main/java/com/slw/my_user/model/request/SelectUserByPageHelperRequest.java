package com.slw.my_user.model.request;

import lombok.Data;

@Data
public class SelectUserByPageHelperRequest {
    int pageNum;
    int pageSize;
}
