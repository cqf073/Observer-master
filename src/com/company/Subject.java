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
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void announce();

    String getAction();

    void setAction(String action);
}
