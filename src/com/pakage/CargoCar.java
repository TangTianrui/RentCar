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
        super.number=number;
        super.name=name;
        super.rentpay=rent;
        this.cargo=cargo;
    }
}
