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
public abstract class Observer {
    protected String	name;
    protected Subject	sub;

    public Observer(String name, Subject sub)
    {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
