package SortingPractice;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/14/2018
 * Time: 10:18 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//选择排序
public class SelectionSort {


    public  static  void  selection_sort(int[] arr){

        int i,j,min,temp,len=arr.length;
        for (i=0;i<len-1;i++){
            min=i;
           for(j=i+1;j<len;j++) {
               if (arr[min]>arr[j]){

                   min=j;
               }
               temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
           }

        }
    }
}
