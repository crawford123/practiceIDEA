package BinarySearch;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/11/2018
 * Time: 4:06 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */


public class BinarySearch {

    /**
     * 二分查找是对一个有序数组中的元素进行查找，并返回该元素的下标
     *二分查找普通实现(非递归方式)
     * @param srcArray 有序数组
     * @param key 查找元素
     * @return 不存在返回-1
     */
    public static int binSearchNonRecursive(int srcArray[],int key){
        int mid;
        int start=0;
        int end=srcArray.length-1;
        while (start<=end){
            mid=(end-start)/2+start;
            if (key<srcArray[mid]){

                end=mid-1;
            }else if(key>srcArray[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }

      return -1;

    }
    /**
     *二分查找普通实现(递归方式)
     * @param srcArray 有序数组
     * @param start 数组低地址下标
     * @param end 数组高地址下标
     * @return key 查找元素
     * @return  查找元素不存在返回-1
     */
    public static int binSearchRecursive(int srcArray[],int start,int end,int key){
        int mid=(end-start)/2+start;
        if (srcArray[mid]==key){
            return mid;
        }
        if (start>=end){
            return -1;
        }else if(key<srcArray[mid]){
           return binSearchRecursive(srcArray,start,mid-1,key);
        }else if (key>srcArray[mid]){
            return binSearchRecursive(srcArray,mid+1,end,key);
        }

        return -1;
    }



    public  static  void main(String[] args){
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        int i=binSearchNonRecursive(srcArray,30);
        int j=binSearchRecursive(srcArray,0,srcArray.length-1,30);
        System.out.println("在非递归方式中元素23在数组中的下标为"+i);
        System.out.println("在递归方式中元素23在数组中的下标为"+j);

    }




}
