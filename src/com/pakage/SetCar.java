package com.pakage;

/**
 * @author TangTianrui
 * @create 2020-05-21-20:52
 */

/**
 * 定义所有可供选择的车,并提供展示的方法
 */
 class SetCar {
    /**
     * 定义所有车的种类和数据
     */
    static PeopleCar a =new PeopleCar(1,"小轿车",40,4);
    static PeopleCar b =new PeopleCar(2,"面包车",65,7);
    static PeopleCar c =new PeopleCar(3,"大巴车",180,20);
    static CargoCar d =new CargoCar(4,"低栏车",30,1.5f);
    static CargoCar e =new CargoCar(5,"高栏车",47,2.5f);
    static CargoCar f =new CargoCar(6,"厢式车",80,4.5f);
    static PikaCar g =new PikaCar(7,"日式皮卡车",60,5,1);
    static PikaCar h =new PikaCar(8,"美式皮卡车",60,2,3);
   static void Show(int a){
       /**
        * @param arr int
        *            执行框架的显示，并根据不同的种类展示不同的框架结构
        */
       if(a==1) {
          System.out.println("载客车:    ");
          System.out.println("序号:    车辆名称:    租车费用(元/(车*天)):    最大载人(人):    ");
       }
       else if(a==2){
          System.out.println("载货车:    ");
          System.out.println("序号:    车辆名称:    租车费用(元/(车*天)):    最大载货(吨):    ");
       }
       else if(a==3){
          System.out.println("皮卡车:    ");
          System.out.println("序号:    车辆名称:    租车费用(元/(车*天)):    最大载人(人):    最大载货(吨):    ");
       }
    }
   static void Show(PeopleCar pc){
       /**
        * @param arr PeopleCar
        *            显示载客车的所有信息
        */
       System.out.println(pc.number+"        "+pc.name+"       "+pc.rentpay+"                     "+pc.busload);
    }
   static void Show(CargoCar cc){
       /**
        * @param arr CargoCar
        *            显示载货车的所有信息
        */
       System.out.println(cc.number+"        "+cc.name+"       "+cc.rentpay+"                      "+cc.cargo);
    }
   static void Show(PikaCar pc){
        /**
         * @param arr PikaCar
         *            显示皮卡车的所有信息
         */
        System.out.println(pc.number+"        "+pc.name+"   "+pc.rentpay+"                      "+pc.busload+"               "+pc.cargo);
    }
    static float FindAndCount(int number,int amount,int day){
        /**
         * @param arr int,int,int
         *            输入序号，进行具体车的租金的查找，并且结合传入的数据，进行该类车租金的运算。
         * @return float 单个类的车的租金。
         */
       float pay=0;
       switch(number){
           case 1:
               pay=SetCar.a.rentpay*amount*day;
               break;
           case 2:
               pay=SetCar.b.rentpay*amount*day;
               break;
           case 3:
               pay=SetCar.c.rentpay*amount*day;
               break;
           case 4:
               pay=SetCar.d.rentpay*amount*day;
               break;
           case 5:
               pay=SetCar.e.rentpay*amount*day;
               break;
           case 6:
               pay=SetCar.f.rentpay*amount*day;
               break;
           case 7:
               pay=SetCar.g.rentpay*amount*day;
               break;
           case 8:
               pay=SetCar.h.rentpay*amount*day;
               break;
       }
       return pay;
    }
}
