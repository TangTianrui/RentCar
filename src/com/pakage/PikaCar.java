package com.pakage;

/**
 * @author TangTianrui
 * @create 2020-05-20-23:47
 */

/**
 *定义皮卡车
 */
public class PikaCar extends Car {
    float cargo;
    int busload;
    PikaCar(int number,String name,int rent,int busload,float cargo){
        super.number=number;
        super.name=name;
        super.rentpay=rent;
        this.busload=busload;
        this.cargo=cargo;
    }
}
