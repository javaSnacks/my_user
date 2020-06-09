package com.slw.my_user.service;

import cn.xinzhili.xutils.core.FailureException;
import com.slw.my_user.dao.GoodsMapper;
import com.slw.my_user.model.Goods;
import com.slw.my_user.model.GoodsExample;
import com.slw.my_user.model.enums.SqlStatusEnum;
import com.slw.my_user.model.request.AddGoodsRequest;
import com.slw.my_user.model.request.UpdateOneGoodsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Objects;

import static com.slw.my_user.error.GoodsErrorCode.*;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsHistoryService goodsHistoryService;


    public SqlStatusEnum addOneGoods(AddGoodsRequest addGoodsRequest) {
        Goods goods = new Goods();
        goods.setName(addGoodsRequest.getName());
        goods.setPrice(addGoodsRequest.getPrice());
        goods.setPicUrl(addGoodsRequest.getPicUrl());
        goods.setStock(addGoodsRequest.getStock());
        goods.setDescription(addGoodsRequest.getDescription());
        goods.setCategory(addGoodsRequest.getCategory());
        goods.setCreateTime(ZonedDateTime.now().toEpochSecond());
        ZonedDateTime expiredTime = ZonedDateTime.now().plusDays(addGoodsRequest.getExpiredDay());
        goods.setExpireTime(expiredTime.toEpochSecond());
        goods.setDeleteTime(null);
        goods.setValid(1);
        goods.setOperator(addGoodsRequest.getOperator());
        int insert = goodsMapper.insert(goods);
        if (insert > 0) {
            return SqlStatusEnum.SUCCESS;
        }
        return SqlStatusEnum.FAILURE;
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

    @Transactional
    public SqlStatusEnum updateOneGoods(Integer goodsId, UpdateOneGoodsRequest goodsRequest) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (Objects.isNull(goods)){
            throw new FailureException(GOODS_UNPRESENCE_ERROR);
        }
        SqlStatusEnum status = goodsHistoryService.addOneGoodsHistory(goods, goodsRequest.getOperator());
        if (!status.equals(SqlStatusEnum.SUCCESS)) {
            throw new FailureException(GOODS_ADD_HISTORY_ERROR);
        }
        goods.setName(goodsRequest.getName());
        goods.setPicUrl(goodsRequest.getPicUrl());
        goods.setStock(goodsRequest.getStock());
        goods.setDescription(goodsRequest.getDescription());
        goods.setCategory(goodsRequest.getCategory());
        goods.setOperator(goodsRequest.getOperator());
        goods.setPrice(goodsRequest.getPrice());
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.or().andIdEqualTo(goodsId);
        int update = goodsMapper.updateByExampleSelective(goods, goodsExample);
        if (update < 1) {
            throw new FailureException(GOODS_MODIFY_FAILUER_ERROR);
        }
        return SqlStatusEnum.SUCCESS;
    }
}
