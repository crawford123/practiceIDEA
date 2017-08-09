package practice8;

/**
 *
 *
 * 定义一个网卡类
 */
public class NetCard implements  PCI{
    @Override
    public void open() {
        System.out.println("打开网络");

    }

    @Override
    public void close() {
        System.out.println("关闭网络");
    }
}
