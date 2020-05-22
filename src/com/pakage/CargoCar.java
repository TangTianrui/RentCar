package com.pakage;

/**
 * @author TangTianrui
 * @create 2020-05-20-23:45
 */

/**
 *定义载货车
 */
public class CargoCar extends Car {
    float cargo;
    CargoCar(int number,String name,int rent,float cargo){
        /**
         * @param arr int，String，int，float
         *            进行一个载货车对象的定义
         */
        super.number=number;
        super.name=name;
        super.rentpay=rent;
        this.cargo=cargo;
    }
}
