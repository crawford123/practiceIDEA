package test;

import java.io.File;

/**
 * Created by Fengli on 2017/7/28.
 */
public class SuffixFilter  implements  FilenameFilter {

        private  String suffix;
        public  SuffixFilter(String suffix){
             super();
            this.suffix=suffix;
        }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }


}
