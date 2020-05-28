package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/2816:22
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Secretary {
    private List<StockObserver> observers	= new ArrayList<StockObserver>();
    private String	action;

    public void attach(StockObserver observer)
    {
        observers.add(observer);
    }

    public void announce()
    {
        for (StockObserver obj : observers)
        {
            obj.update();
        }
    }

    public String getAction()
    {
        return action;
    }

    public void setAction(String action)
    {
        this.action = action;
    }
}
