package practice5and6;

/**
 * Created by Fengli on 2017/8/4.
 */
public class ArrayToolsDemo {
        public  static  void main(String[] str) {
            int[] arr = {0, 9, 1, 6, 2, 8};
            int max = ArrayTools.getMax(arr);
            int min = ArrayTools.getMin(arr);
            System.out.println("最大值"+max);
            System.out.println("最小值"+min);
        }
}
