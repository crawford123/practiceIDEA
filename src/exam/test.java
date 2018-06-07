package exam;


import java.util.Scanner;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 3/24/2018
 * Time: 6:55 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class test {

    public static int  test(int a[],int k){
        int b=0;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                    if (((a[j] - a[i] == k)||(a[i] - a[j] == k))){
                        b++;
                    }

                }

        }
        return  b;
    }


    public static void main(String[] args){


        Scanner  in=new Scanner(System.in);
        System.out.println("请输入数字个数n：");
        int n =in.nextInt();
        int a[]=new int[n];
        System.out.println("请输入差值：");
        int k =in.nextInt();
        System.out.println("请输入"+n+"个正整数：");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        //System.out.println("数组的值为："+a[4]);
        int b= test(a,k);
        System.out.println("差值为"+k+"的数字去重后的个数为:"+b);
    }


}
