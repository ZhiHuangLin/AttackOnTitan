package com.zhl.attackontitan;

import java.io.*;
import java.util.List;

/**
 * @author lzh
 * @time 2021��1��31��
 */
public class GetTheTXT {
    /**
     * ��ÿһ����ѯ������·��ָ��һ��Ŀ¼·�����ļ�����
     * @param list ·������
     * @param name �ļ���
     * @param DirName Ŀ¼��
     */
    public static synchronized void ToTheTXT(List<String> list,String name,String DirName) {
        File Dir = new File("D://"+DirName+"//"+name);
        if( ! Dir.exists()) {
            Dir.mkdir();
        }
        for (int i = 0; i < list.size(); i++) {
            File file = new File("D://"+DirName+"//"+name+"//"+name+"��"+( i + 1 )+"��"+".mp4");
            if( ! file.exists()) {
                DownloadUtil.httpDownload(list.get(i),file);
            }else{
                System.out.println("�ļ��Ѿ����ڣ�");
            }
        }
    }

}
