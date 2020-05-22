package com.pakage;

import java.util.Scanner;

/**
 * @author TangTianrui
 * @create 2020-05-21-23:09
 */
public class People {
    int[] Car=new int[7];//存储选择了的车的序号
    int[] CarAmount=new int[7];//存储对应车的序号的选择的数量
    int[] CarDay=new int[7];//存储对应车的序号的选择的天数
    int pay;
    int have=0;//已选车的数量
    public static People p=new People();//单例设计对象
    private People(){}
    public static People GetPeople(){
        return p;
    }
    public void Input(int number,int amount,int day){
        /**
         * @param arr int，int，int
         *            将一组车的序号，租的数量，租的天数依次存入不同的数组中。
         *            并记录已经租了多少辆车。
         */
        Car[have]=number;
        CarAmount[have]=amount;
        CarDay[have]=day;
        have++;
    }
    void show(){
        /**
         * 将已经选择的车辆信息，全部从之前的数组中调出，并且打印出相关的数据。
         * 将相关数据进行运算并打印出需要的租金。
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("您选择的车辆情况如下：");
        for(int i=0;i<have;i++){
            ShowCar.ShowOneCar(Car[i]);
            System.out.println("您选择的租赁数量为："+CarAmount[i]+"辆，您选择的租赁时间为："+CarDay[i]+"天。");
            System.out.println("============================================================================");
        }
        System.out.println("您一共需要支付的租金为："+AddCount()+"元");
        System.out.println("请按下Enter以确认。");
        scanner.nextLine();//最后按下Enter结束函数。
    }
    float AddCount(){
        /**
         * @return float
         * 调用FindAndCount函数，将每一组的数据进行运算并且进行累加最终得到总租金。
         */
        float pay=0;
            for(int i=0;i<have;i++){
                pay+=SetCar.FindAndCount(Car[i],CarAmount[i],CarDay[i]);
            }
            return pay;
    }
}
