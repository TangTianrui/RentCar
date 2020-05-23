# 简易的租车系统
完成了将系统中的所有车辆的展示，以户在选车时的交互，最后在系统中结算实付金额，并将用户选择的车辆信息展示。
##MainRentCar
主函数，调用方法完成展示，租车以及最后的展示。
```public class MainRentCar {
    public static void main(String[] args){
        new ShowCar();//调用ShowCar函数，展示所有车的序号，数据等。
        new RentCar();//调用RentCar函数，实现租车的交互，记录租车的数据。
        People p=People.GetPeople();//得到People对象
        p.show();//计算并展示最终的租车结果以及实际金额。
    }
    }
```
###Car
* Car
定义车大类
```
public class Car {
     String name;//车名
     int rentpay;//租金
     int number;//序号
}
```
* PeopleCar
初始化载客车
```
public class PeopleCar extends Car {
    int busload;
    PeopleCar(int number,String name,int rent,int busload){
        //用输入的信息建立一个载客车对象。
        super.number=number;//序号
        super.name=name;//车辆名称
        super.rentpay=rent;//租金
        this.busload=busload;//载货量
    }
}
```
* CargoCar
初始化载货车
```
public class CargoCar extends Car {
    float cargo;
    CargoCar(int number,String name,int rent,float cargo){
        //用输入的信息建立一个载货车对象。
        super.number=number;//序号
        super.name=name;//名称
        super.rentpay=rent;//租金
        this.cargo=cargo;//载货量
    }
}
```
* PikaCar
初始化皮卡车
```
public class PikaCar extends Car {
    float cargo;
    int busload;
    PikaCar(int number,String name,int rent,int busload,float cargo){
        //用输入的数据建立一个新的皮卡车对象。
        super.number=number;//序号
        super.name=name;//车名
        super.rentpay=rent;//租金
        this.busload=busload;//载客量
        this.cargo=cargo;//载货量
    }
}
```
###SetCar
* SetCar
建立所有车的对象
```
static PeopleCar a =new PeopleCar(1,"小轿车",40,4);
    static PeopleCar b =new PeopleCar(2,"面包车",65,7);
    static PeopleCar c =new PeopleCar(3,"大巴车",180,20);
    static CargoCar d =new CargoCar(4,"低栏车",30,1.5f);
    static CargoCar e =new CargoCar(5,"高栏车",47,2.5f);
    static CargoCar f =new CargoCar(6,"厢式车",80,4.5f);
    static PikaCar g =new PikaCar(7,"日式皮卡车",60,5,1);
    static PikaCar h =new PikaCar(8,"美式皮卡车",60,2,3);
```
* Show
通用的展示车辆的方法
```
static void Show(int a){
       // 执行框架的显示，并根据不同的种类展示不同的框架结构
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
```
```
static void Show(PeopleCar pc){
       //显示载客车的所有信息
       System.out.println(pc.number+"        "+pc.name+"       "+pc.rentpay+"                     "+pc.busload);
    }
```
```
static void Show(CargoCar cc){
       //显示载货车的所有信息
       System.out.println(cc.number+"        "+cc.name+"       "+cc.rentpay+"                      "+cc.cargo);
    }
```
```
static void Show(PikaCar pc){
        //显示皮卡车的所有信息
        System.out.println(pc.number+"        "+pc.name+"   "+pc.rentpay+"                      "+pc.busload+"               "+pc.cargo);
    }
```
* FindAndCount

传入车辆的序号，租赁数量以及天数，查找该车的租金，并计算出该车的租赁费用。
```
static float FindAndCount(int number,int amount,int day){
        //输入序号，进行具体车的租金的查找，并且结合传入的数据，进行该类车租金的运算。
       float pay=0;
       switch(number){
           case 1:
               pay=SetCar.a.rentpay*amount*day;//租金x数量x天数
               break;
           case 2:
               pay=SetCar.b.rentpay*amount*day;//租金x数量x天数
               break;
           case 3:
               pay=SetCar.c.rentpay*amount*day;//租金x数量x天数
               break;
           case 4:
               pay=SetCar.d.rentpay*amount*day;//租金x数量x天数
               break;
           case 5:
               pay=SetCar.e.rentpay*amount*day;//租金x数量x天数
               break;
           case 6:
               pay=SetCar.f.rentpay*amount*day;//租金x数量x天数
               break;
           case 7:
               pay=SetCar.g.rentpay*amount*day;//租金x数量x天数
               break;
           case 8:
               pay=SetCar.h.rentpay*amount*day;//租金x数量x天数
               break;
       }
       return pay;
    }
```
####ShowCar
*ShowCar
将所有车展示出来
```
    ShowCar(){
        //根据车的种类，按框架把所有车展示出来。
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
```
* ShowOneCar
将一辆车展示出来
```
static void ShowOneCar(int i){
        //根据传入的序号，进行判断，根据不同信号代表的车不同，其种类也不同，向外界展示各自的数据。
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
```
#####RentCar

租车的主要交互界面的实现
* RentCar
```
class RentCar {
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
```
##People
* People
    * Input
    * Show
    
* People    
创建people对象，并将其封装起来，只能通过GetPeople得到对象并进行操作
```
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
```
* Input

接收外界的信息，并将其储存进People对象中
```
public void Input(int number,int amount,int day){
        /**
         *            将一组车的序号，租的数量，租的天数依次存入不同的数组中。
         *            并记录已经租了多少辆车。
         */
        Car[have]=number;
        CarAmount[have]=amount;
        CarDay[have]=day;
        have++;
    }
```
*Show

展示用户选择的所有车辆以及计算租金
```
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
```
*AddCount

将每辆车计算出的租金进行累加计算，得到用户实际需要付的金额。
```
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
```

    