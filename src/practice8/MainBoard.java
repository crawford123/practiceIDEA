package practice8;


public class MainBoard  {

     public  void run(){

         System.out.println("主板运行了");
     }
     public void  userPCI(PCI pci){

          if(pci!=null){

               pci.open();
               pci.close();

          }else {

              System.out.println("设备不存在！！！");
          }

     }
}
