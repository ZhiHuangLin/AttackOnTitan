package com.zhl.attackontitan;

import java.io.*;
import java.util.List;

/**
 * @author lzh
 * @time 2021年1月31日
 */
public class GetTheTXT {
    /**
     * 给每一个查询出来的路径指定一个目录路径和文件名字
     * @param list 路径集合
     * @param name 文件名
     * @param DirName 目录名
     */
    public static synchronized void ToTheTXT(List<String> list,String name,String DirName) {
        File Dir = new File("D://"+DirName+"//"+name);
        if( ! Dir.exists()) {
            Dir.mkdir();
        }
        for (int i = 0; i < list.size(); i++) {
            File file = new File("D://"+DirName+"//"+name+"//"+name+"第"+( i + 1 )+"集"+".mp4");
            if( ! file.exists()) {
                DownloadUtil.httpDownload(list.get(i),file);
            }else{
                System.out.println("文件已经存在！");
            }
        }
    }

}
