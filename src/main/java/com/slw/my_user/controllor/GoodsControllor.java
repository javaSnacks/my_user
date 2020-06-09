package com.slw.my_user.controllor;

import com.slw.my_user.model.Goods;
import com.slw.my_user.model.enums.SqlStatusEnum;
import com.slw.my_user.model.request.AddGoodsRequest;
import com.slw.my_user.model.request.UpdateOneGoodsRequest;
import com.slw.my_user.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/goods")
public class GoodsControllor {

    @Autowired
    GoodsService goodsService;

    @PostMapping
    public String addOneGoods(@RequestBody AddGoodsRequest addGoodsRequest){
        SqlStatusEnum status = goodsService.addOneGoods(addGoodsRequest);
        if (status.equals(SqlStatusEnum.SUCCESS)){
            return "addGoods success";
        }
        return "addGoods failed";
    }

    @GetMapping("/{id}")
    public Goods selectOneGoods(@PathVariable Integer id){
        return goodsService.selectOneGoods(id);
    }

    @GetMapping
    public List<Goods> selectAllGoods(){
        return goodsService.selectAllGoods();
    }

    @PatchMapping("/{id}")
    public SqlStatusEnum updateOneGoods(@RequestBody @Valid UpdateOneGoodsRequest updateOneGoodsRequest, @PathVariable Integer id){
        return goodsService.updateOneGoods(id, updateOneGoodsRequest);
    }


}
