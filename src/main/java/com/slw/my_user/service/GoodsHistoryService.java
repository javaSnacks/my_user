package com.slw.my_user.service;

import com.slw.my_user.dao.GoodsHistoryMapper;
import com.slw.my_user.model.Goods;
import com.slw.my_user.model.GoodsHistory;
import com.slw.my_user.model.enums.SqlStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsHistoryService {

    @Autowired
    GoodsHistoryMapper goodsHistoryMapper;

    SqlStatus addOneGoodsHistory(Goods goods,Integer historyOperator){
        GoodsHistory goodsHistory = new GoodsHistory(null, goods.getId(), goods.getName(),
                goods.getPrice(), goods.getDescription(), goods.getCreateTime(),
                goods.getExpireTime(), goods.getDeleteTime(), 3, goods.getOperator(), historyOperator);
        int insert = goodsHistoryMapper.insert(goodsHistory);
        if (insert > 0){
            return SqlStatus.SUCCESS;
        }
        return SqlStatus.FAILURE;
    }


}
