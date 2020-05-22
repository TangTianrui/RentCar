package com.pakage;

/**
 * @author TangTianrui
 * @create 2020-05-20-23:42
 */

/**
 定义载人车
 */
public class PeopleCar extends Car {
    int busload;
    PeopleCar(int number,String name,int rent,int busload){
        /**
         * @param arr int，String，int，int
         *            用输入的信息建立一个载客车对象。
         */
        super.number=number;//序号
        super.name=name;//车辆名称
        super.rentpay=rent;//租金
        this.busload=busload;//载货量
    }
}
