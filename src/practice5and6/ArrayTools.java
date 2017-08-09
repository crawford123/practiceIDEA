package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 *
 * 数组工具
 *
 * @author  Paul
 *
 */
public class ArrayTools {
    /**
     * 求一个数组的最大值
     *
     *@param  arr
     *@return  int
     *
     */
       public  static  int getMax(int[] arr) {
           int max = 0;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] > arr[max]) {

                   max = i;
               }
           }
           return arr[max];

       }

    /**
     * 求一个数组的最小值
     *
     * @param arr
     * @return
     */


    public  static  int getMin(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < arr[min]) {

                min = i;
            }

        }
        return  arr[min];
    }




    }




