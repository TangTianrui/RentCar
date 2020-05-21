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
        super.number=number;
        super.name=name;
        super.rentpay=rent;
        this.busload=busload;
    }
}
