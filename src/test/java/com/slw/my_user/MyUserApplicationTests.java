package com.slw.my_user;

import com.slw.my_user.model.Goods;
import com.slw.my_user.model.request.AddGoodsRequest;
import com.slw.my_user.model.request.UpdateOneGoodsRequest;
import com.slw.my_user.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MyUserApplicationTests {

	@Autowired
	GoodsService goodsService;

	@Test
	void contextLoads() throws InterruptedException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
//		String format = dateFormat.format(1590028258510L);
//		System.out.println("***********"+format);
//		List list = new ArrayList();

		Price price1 = new Price();
		Price price2 = new Price();
		price1.start();
		price2.start();
		Thread.currentThread().sleep(30000);
	}

	class Price extends Thread{

		@Override
		public void run() {
			try {
				this.modifyPrice(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public void modifyPrice(int id) throws InterruptedException {
			Goods goods = goodsService.selectOneGoods(id);
			Thread.currentThread().sleep(10000);
			Integer price = goods.getPrice();
			UpdateOneGoodsRequest request = new UpdateOneGoodsRequest();
			request.setPrice(price+1);
			request.setOperator(1);
			goodsService.updateOneGoods(2,request);
			System.out.println("修改商品价格成功！！！！——" + Thread.currentThread().getName());
		}

	}

}
