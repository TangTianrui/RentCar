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
        /**
         * @param arr int,String,int,int,float
         *            用输入的数据建立一个新的皮卡车对象
         */
        super.number=number;//序号
        super.name=name;//车名
        super.rentpay=rent;//租金
        this.busload=busload;//载客量
        this.cargo=cargo;//载货量
    }
}
