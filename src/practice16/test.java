package practice16;

public class test {

           public  static  void show(String content){

        System.out.println(content);
    }

         public static void main(String[] args){
             // 字符数组
             char[] arr={ 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
             String str = "abcdef";
             String str1="abc";
             String str2="agc";
             char[] chars=str1.toCharArray();//将字符串转换成字符数组
             String st = "    Hello Java And Android   ";
             //String str2=new String("abc");
             //String str3="abc";
             //String str4="ab";
             //int length=str1.length();//获取字符串的长度
             //char ch=str1.charAt(0);//根据位置获取位置上的某个字符
             //int index2=str1.indexOf(2);//输出-1
             //int position=str1.indexOf("b");//返回的是字符在字符串中第一次出现的位置
             //int index=str1.indexOf(0,0);//输出-1
             //int index1=str1.indexOf("c",0);
             /*str1="kk";
             System.out.println(str1);//kk*/
             //System.out.println(str1==str2);//比较地址，false
             //System.out.println(str1.equals(str2));//比较值,true
             //System.out.println(str1==str3);//true 内存中存在了对象就不会再创建了
             //System.out.println(str1==str4);//false,值不同
             //System.out.println(length);
             //System.out.println(ch);
             //System.out.println(position);
             //System.out.println(index);
             //System.out.println(index1);
             //System.out.println(index2);
             //System.out.println(str1.contains("a"));//判断字符串是否存在.true
             //System.out.println(str1.indexOf("f"));//-1表示不存在，否则存在
             //System.out.println(str1.isEmpty());//判断字符串长度是否为0
             //System.out.println(str1.startsWith("a"));//字符串是否是以指定的内容开头,true
             //System.out.println(str1.endsWith("c"));//字符串是否是以指定的内容结尾 true

             //System.out.println(st.toUpperCase());//转换大写
             //System.out.println(st.toLowerCase());//转换小写
             //System.out.println(st.trim());//去掉前后空格
             //System.out.println(str1.compareTo(str2));//对两个字符串进行自然顺序的比较
             //show(String.valueOf(str.length()));//6
             //show(String.valueOf(str.charAt(3)));//d
             //show(String.valueOf(str.indexOf('d')));//3
             //show(String.valueOf(str.lastIndexOf('d')));//3
             // 转换成字符串
             /*String test=new String(arr);
             show(test);
             //截取
             String sting1=new String(arr,1,3);
             show(sting1);
             String string2="ddvdvdv";
             char[] arr3=string2.toCharArray();//转化为字符数组
             for(int i=0;i<arr3.length;i++){

                 show("arr3= ："+arr3[i]);

             }
             String s = "Hello JAVA";
             //替换
             String s1=s.replace("J","A");
             show(s1);
             String s2=s.replace("J","happy");
             show(s2);
             String string ="zhangsan,lisi,wangwu";
              //切割
             String[] stringarray=string.split(",");
             for(int i=0;i<stringarray.length;i++){

                  show("stringarray= :"+stringarray[i]);


             }

              //子串
             String ss="ferfefqwdqXXFV";
             show(ss.substring(2));
             show(ss.substring(2,5));*/

         }


}


