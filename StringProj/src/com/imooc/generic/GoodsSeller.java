package com.imooc.generic;

import java.util.List;

public class GoodsSeller {
    //泛型作为方法参数
    public void sellGoods(List<? extends Goods> goods){
        //调用集合中的sell方法
        for(Goods g:goods){
            g.sell();
        }
    }
}
