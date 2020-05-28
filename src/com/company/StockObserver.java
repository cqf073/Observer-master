package com.company;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/2816:22
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class StockObserver  extends Observer {
    public StockObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
    }

}
