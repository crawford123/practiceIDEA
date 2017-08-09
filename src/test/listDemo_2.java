package test;

import java.io.File;

/**
 * Created by Fengli on 2017/7/28.
 */
public class listDemo_2 {

    public static  void main(String[] args) {
        File dir = new File("c:\\");
        String[] names = dir.list((java.io.FilenameFilter) new SuffixFilter(".txt"));
        for (String name : names) {
            System.out.println(name);

        }
    }

    }