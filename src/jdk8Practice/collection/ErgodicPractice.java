package jdk8Practice.collection;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 01/07/2019
 * Time: 23:59
 * Email:2045532295@qq.com
 * Addres:GZ
 * Description:
 */
public class ErgodicPractice {


    public static void main(String[] args) {
        //Collection类型集合
        //JAVA7中有3种遍历方式
        List<String>  stringList = Arrays.asList("aaa","bbb");
        //第一种：for循环
       /* for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }*/
        //第二种：增强for循环
      /*  for (String str:stringList){
            System.out.println(str);
        }*/
        //第三种 迭代器
       /* Iterator<String> stringIterable = stringList.iterator();
        while (stringIterable.hasNext()){
            System.out.println(stringIterable.next());
        }*/
        //在JAVA8中还可以使用forEach来遍历
        stringList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //使用Collections.sort方法进行排序
       /* Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) ;
            }
        });*/
       //加上Lambda表达式
       stringList.forEach(str -> System.out.println(str));
       //sort排序也使用Lambda表达式
      /*  Collections.sort(stringList,(o1,o2)->{
            return  o1.compareTo(o2);
        });*/

        //Map类型集合
        // 在JAVA7中遍历有下面几种方式：
        Map<String,String> map = new HashMap<>();
        map.put("id","11");
        map.put("name","11");
        map.put("age","30");
       /* for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("k="+ entry.getKey()+",v="+entry.getValue());
        }
        for(String key:map.keySet()){
            System.out.println("k="+key+",v="+map.get(key));
        }
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("k=" + entry.getKey() + ",v=" + entry.getValue());
        }
        for (String v:map.values()){
            System.out.println("v="+v);
        }*/
      //使用JAVA8的forEach遍历，如下
      map.forEach(new BiConsumer<String, String>() {
          @Override
          public void accept(String s1, String s2) {
              System.out.println("k=" + s1 + ",v=" + s2);
          }
      });
      //也可以使用Lambda表达式
       map.forEach((k,v)-> System.out.println("v="+v+",v="+v));
    }
}
