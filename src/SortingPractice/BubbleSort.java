package SortingPractice;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/13/2018
 * Time: 4:59 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class BubbleSort {
    public static int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
    public static int temp=0;
    public  static void bubblesort(){
     for(int k=0;k<a.length-1;k++) {
         for (int j = 0; j < a.length - 1 - k; k++) {
             if (a[j] > a[j + 1]){
                 temp = a[j];
                 a[j] = a[j + 1];
                 a[j + 1] = temp;
             }

         }
     }
        for (int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }

    }
    public  static  void main(String[] args){

        bubblesort();
    }


}
