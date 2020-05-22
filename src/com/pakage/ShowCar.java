package com.pakage;

/**
 * @author TangTianrui
 * @create 2020-05-21-22:51
 */

/**
 * 展示所有车；
 */
public class ShowCar {
    ShowCar(){
        /**
         * 根据车的种类，按框架把所有车展示出来。
         */
        SetCar.Show(1);
        SetCar.Show(SetCar.a);
        SetCar.Show(SetCar.b);
        SetCar.Show(SetCar.c);
        SetCar.Show(2);
        SetCar.Show(SetCar.d);
        SetCar.Show(SetCar.e);
        SetCar.Show(SetCar.f);
        SetCar.Show(3);
        SetCar.Show(SetCar.g);
        SetCar.Show(SetCar.h);
        System.out.println("============================================================================");

    }
    static void ShowOneCar(int i){
        /**
         * @param arr int 序号
         *            根据传入的序号，进行判断，根据不同信号代表的车不同，其种类也不同，向外界展示各自的数据。
         */
        switch(i){
            case 1:
                SetCar.Show(1);
                SetCar.Show(SetCar.a);
                break;
            case 2:
                SetCar.Show(1);
                SetCar.Show(SetCar.b);
                break;
            case 3:
                SetCar.Show(1);
                SetCar.Show(SetCar.c);
                break;
            case 4:
                SetCar.Show(2);
                SetCar.Show(SetCar.d);
                break;
            case 5:
                SetCar.Show(2);
                SetCar.Show(SetCar.e);
                break;
            case 6:
                SetCar.Show(2);
                SetCar.Show(SetCar.f);
                break;
            case 7:
                SetCar.Show(3);
                SetCar.Show(SetCar.g);
                break;
            case 8:
                SetCar.Show(3);
                SetCar.Show(SetCar.h);
                break;
        }
    }
}
