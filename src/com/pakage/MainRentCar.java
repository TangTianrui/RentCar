package com.pakage;

/**
 * @author TangTianrui
 * @create 2020-05-21-20:50
 */

/**
 * 定义主函数
 */
public class MainRentCar {
    public static void main(String[] args){
        new ShowCar();//展示所有车的序号，数据等。
        new RentCar();//实现租车的交互，记录租车的数据。
        People p=People.GetPeople();
        p.show();//计算并展示最终的租车结果以及实际金额。
    }
    }
