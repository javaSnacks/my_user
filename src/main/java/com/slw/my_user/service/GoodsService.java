package com.slw.my_user.service;

import com.slw.my_user.dao.GoodsMapper;
import com.slw.my_user.model.Goods;
import com.slw.my_user.model.GoodsExample;
import com.slw.my_user.model.enums.SqlStatus;
import com.slw.my_user.model.request.UpdateOneGoodsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsHistoryService goodsHistoryService;


    public SqlStatus addOneGoods(String name, Integer price, String description, Integer expiredDay, Integer operator) {
        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(price);
        goods.setDescription(description);
        goods.setCreateTime(ZonedDateTime.now().toEpochSecond());
        ZonedDateTime expiredTime = ZonedDateTime.now().plusDays(expiredDay);
        goods.setExpireTime(expiredTime.toEpochSecond());
        goods.setDeleteTime(null);
        goods.setValid(1);
        goods.setOperator(operator);
        int insert = goodsMapper.insert(goods);
        if (insert > 0) {
            return SqlStatus.SUCCESS;
        }
        return SqlStatus.FAILURE;
    }


    public Goods selectOneGoods(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods;
    }

    public List<Goods> selectAllGoods() {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.or().getAllCriteria();
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        Long createTime = goods.get(1).getCreateTime();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochSecond(createTime), ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL);
        System.out.println(zonedDateTime.format(dateTimeFormatter));
        return goods;
    }

    public SqlStatus updateOneGoods(Integer goodsId, UpdateOneGoodsRequest goodsRequest) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        SqlStatus status = goodsHistoryService.addOneGoodsHistory(goods, goodsRequest.getOperator());
        if (!status.equals(SqlStatus.SUCCESS)) {
//            throw new
        }
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.or().andNameEqualTo(goodsRequest.getName())
                .andPriceEqualTo(goodsRequest.getPrice())
                .andDescriptionEqualTo(goodsRequest.getDescription())
                .andOperatorEqualTo(goodsRequest.getOperator());
        int update = goodsMapper.updateByExampleSelective(goods, goodsExample);
        if (update > 0) {
            return SqlStatus.SUCCESS;
        }
        return SqlStatus.FAILURE;
    }
}
