package com.zhl.attackontitan;

import java.io.*;
import java.util.List;

/**
 * @author lzh
 * @time 2021年1月31日
 */
public class GetTheTXT {

    public static synchronized void ToTheTXT(List<String> list,String name) throws FileNotFoundException {
        File file = new File("D://进击的巨人//"+name);
        file.mkdir();
        for (int i = 0; i < list.size(); i++) {
            File fileName = new File("D://进击的巨人//"+name+"//"+name+"第"+( i + 1 )+"集"+".mp4");
            DownLoadVideo.httpDownload(list.get(i),fileName);
         /*   FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            // 创建FileOutputStream对应的PrintStream，方便操作。PrintStream的写入接口更便利
            PrintStream printStream = new PrintStream(fileOutputStream);
            String str = list.get(i);
            printStream.println(str);
            printStream.close();*/
        }
    }

}
