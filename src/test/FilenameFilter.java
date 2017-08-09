package test;

import java.io.File;

/**
 * Created by Fengli on 2017/7/28.
 */
public interface FilenameFilter {

         boolean accept(File dir ,String name);

}
