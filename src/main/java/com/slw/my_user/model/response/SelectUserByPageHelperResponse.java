package com.slw.my_user.model.response;

import com.slw.my_user.model.User;
import lombok.Data;

import java.util.List;

@Data
public class SelectUserByPageHelperResponse {
    List<User> list;
    long nums;
}
