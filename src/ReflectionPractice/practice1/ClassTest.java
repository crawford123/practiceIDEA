package ReflectionPractice.practice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 2/1/2018
 * Time: 5:16 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class ClassTest {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("file.txt"))));
        Class className = Class.forName(br.readLine());

        //使用了animal类
        eatable ea=(eatable)className.newInstance();
        ea.eat();

    }

}
