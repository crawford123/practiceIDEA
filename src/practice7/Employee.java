package practice7;

/**
 *
 *
 * 定义员工类
 */
abstract class Employee {
    //姓名
    private  String  name;
    //工号
    private  String id;
    //工资
    private  double pay;
    public  Employee(String  name,String id,double pay){

        this.name=name;
        this.id=id;
        this.pay=pay;

    }

    public  abstract void work();
}
