package practice17;


/*StringBuffer：线程同步（安全）
        StringBuilder：线程不同步（不安全）*/
public class test {
    /**
     * StringBuffer
     */
    public  static  void show(Object content){

        System.out.println(content);
    }

    public static void main(String[] args) {
        //
        //StringBuffer stringBuffer=new StringBuffer();
        //StringBuffer append=stringBuffer.append(78);
        //show(stringBuffer==append);//true
        //show(stringBuffer.toString());//78
        //show(stringBuffer.toString());//78
        //stringBuffer.append("abc").append(36);
        //show(stringBuffer.toString());
        //stringBuffer.insert(3,"paul");//offset为指定固定的位置插入
        //show(stringBuffer.toString());
        // //删除78
        //stringBuffer.delete(0,2);
        //show(stringBuffer.toString());
        //show(stringBuffer.deleteCharAt(0).toString());//删除固定索引的字符
        //show("清空缓冲区："+stringBuffer.delete(0,stringBuffer.length()));//清空缓冲区
       /* StringBuffer sb=new StringBuffer("abcdefg");
        //替换一部分
        show(sb.replace(1,4,"java"));
        sb.setCharAt(sb.length()-1,'k');//修改固定位置的字符
        show(sb.toString());*/
        /**
         * 将缓存区的数据存储到数组中
         */
        StringBuffer sb = new StringBuffer("abcdefg");
        char[] chs=new char[4];//定义一个数组
        /**
         * 从1开始，4结束，存在chs里，从头1开始存
         */
        sb.getChars(1,4,chs,1);
        for(int i=0;i<chs.length;i++){
            show("chs["+i+"]:"+chs[i]);

        }


    }
}
