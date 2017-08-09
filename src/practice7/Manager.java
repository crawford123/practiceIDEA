package practice7;

/**
 *
 *
 * 定义经理类，继承员工类
 */
public class Manager  extends  Employee{
   //奖金
    private  int bonus;

    public  Manager(String  name,String id,double pay,int bonus){
         super(name,id,pay);
         this.bonus=bonus;

    }
    @Override
    //重写（覆盖）
    public void work() {
        System.out.println("管理");
    }
}
