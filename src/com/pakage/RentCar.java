package com.pakage;


import java.util.Scanner;

/**
 * @author TangTianrui
 * @create 2020-05-21-22:58
 */
public class RentCar {
    RentCar(){
        People p=new People();
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<7;i++) {
            System.out.println("请输入您想要租赁的车的序号:(输入0结束选择)");
            p.Car[i] = sc.nextInt();
            if(p.Car[i]==0){
                i--;
                break;
            }
            if(p.Car[i]<0||p.Car[i]>7){
                i--;
                continue;
            }
        }


    }
}
