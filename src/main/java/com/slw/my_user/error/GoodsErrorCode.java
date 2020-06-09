package com.slw.my_user.error;

import cn.xinzhili.xutils.core.Code;

public enum GoodsErrorCode implements Code {

    GOODS_ADD_HISTORY_ERROR(1000,"添加商品历史异常"),
    GOODS_UNPRESENCE_ERROR(1001,"待添加商品不存在"),
    GOODS_MODIFY_FAILUER_ERROR(1002,"商品更新失败");

    int code;

    String description;

    GoodsErrorCode(int code, String description){
        this.code = code;
        this.description = description;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
