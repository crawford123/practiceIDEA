/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 05/07/2019
 * Time: 00:36
 * Email:2045532295@qq.com
 * Addres:GZ
 * Description:
 */
public class Pizza {
    private  PizzaStatus pizzaStatus;
    private int timeToDelivery;

    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public enum PizzaStatusImprovement{
        ORDERED(5)

    }

    public boolean isDeliverable() {
        if (getPizzaStatus() == PizzaStatus.READY) {
            return true;
        }
        return false;
    }

    public PizzaStatus getPizzaStatus() {
        return pizzaStatus;
    }

    public void setPizzaStatus(PizzaStatus pizzaStatus) {
        this.pizzaStatus = pizzaStatus;
    }

    public int getDeliveryTimeInDays(){
        if (pizzaStatus != null){
            switch (pizzaStatus){
                case READY:
                    return  5;
                case ORDERED:
                    return 2;
                case DELIVERED:
                    return  0;
            }
        }
        return  0;

    }

    public  boolean isOrdered(){
        return  false;
    }
    public  boolean isReady(){
        return  false;
    }
    public boolean isDelivered(){
        return false;
    }

    public int getTimeToDelivery(){
        return  timeToDelivery;
    }
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        //容易导致空指针异常
       /* if (pizza.getPizzaStatus().equals(PizzaStatus.DELIVERED)){

        }
        //这种写法比较稳妥
        if (pizza.getPizzaStatus() == PizzaStatus.DELIVERED){

        }
*/
    }
}
