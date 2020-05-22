package com.pakage;


import java.util.Scanner;

/**
 * @author TangTianrui
 * @create 2020-05-21-22:58
 */
public class RentCar {
    RentCar() {
        People p=People.GetPeople();//获得People对象。
        int i, number,day,amount;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 7; i++) {
            /**
             * 进行租车的选择，以及对对象选择的筛选判断。
             * 再展示要租选的车辆信息，并询问租车的数量以及天数。
             * 最后将记录的数据全部存储到People对象中。
             */
            System.out.println("请输入您想要租赁的车的序号:(或者输入0结束选择)");
            number = sc.nextInt();//键盘键入租车的序号
            if (number == 0) {
                /**
                 * 当输入0时，循环结束，租车结束。跳出循环，进行结算。
                 */
                i--;
                break;
            }
            if (number < 0 || number > 7) {
                /**
                 * 当输入为负数，或者输入的序号不存在于列表中时，作废此次数据，重新循环。
                 */
                i--;
                System.out.println("输入错误!请正确输入要租赁车的序号1-7，或者输入0选择完成。");
                continue;
            }
            ShowCar.ShowOneCar(number);//选择的车序号正常，展示该车的信息。
            System.out.println("============================================================================");
            while(true) {
                /**
                 * 键入租车数量的信息，直到正确。
                 */
                System.out.println("请输入要租赁的数量：");
                amount = sc.nextInt();
                if(amount<0){
                    System.out.println("输入错误！请正确输入数量！");
                }
                else
                    break;
            }
            while(true) {
                /**
                 * 键入租车天数的信息，直到正确
                 */
                System.out.println("请输入要租赁的天数：");
                day = sc.nextInt();
                if(day<=0){
                    System.out.println("输入错误！请正确输入天数！");
                }
                else
                    break;
            }
            p.Input(number,amount,day);//将记录得的信息传给Input函数，交由Input函数进行保存操作。
            System.out.println("============================================================================");
            System.out.print("请问还有想要租赁的车辆吗？");
        }
    }
}

