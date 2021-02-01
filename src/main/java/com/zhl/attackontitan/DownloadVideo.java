package com.zhl.attackontitan;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author zhl
 * @create 2021/2/1 9:43
 * @description 下载视频最终方法
 */
public class DownloadVideo {
    /**
     * 下载视频并将视频写入文件
     * @param pre_url URL路径前缀
     * @param number 一季有多少集
     * @param DirName 文件夹名字
     * @param name 每集名字
     * @throws FileNotFoundException
     */
    public static void DownloadAndWrite(String pre_url,int number,String DirName,String name) {
        List<String> list= GetTheHref.fromTheURL(pre_url, number);
        GetTheTXT.ToTheTXT(list,name,DirName);
    }
}
