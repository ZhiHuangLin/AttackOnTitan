package com.zhl.attackontitan;

import java.io.*;
import java.util.List;

/**
 * @author lzh
 * @time 2021��1��31��
 */
public class GetTheTXT {

    public static synchronized void ToTheTXT(List<String> list,String name) throws FileNotFoundException {
        File file = new File("D://�����ľ���//"+name);
        file.mkdir();
        for (int i = 0; i < list.size(); i++) {
            File fileName = new File("D://�����ľ���//"+name+"//"+name+"��"+( i + 1 )+"��"+".mp4");
            DownLoadVideo.httpDownload(list.get(i),fileName);
         /*   FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            // ����FileOutputStream��Ӧ��PrintStream�����������PrintStream��д��ӿڸ�����
            PrintStream printStream = new PrintStream(fileOutputStream);
            String str = list.get(i);
            printStream.println(str);
            printStream.close();*/
        }
    }

}
