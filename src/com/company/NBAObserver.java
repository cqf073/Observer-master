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
public class NBAObserver extends Observer{
    public NBAObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
    }
}
