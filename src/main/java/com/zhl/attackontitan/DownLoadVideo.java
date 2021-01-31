package com.zhl.attackontitan;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownLoadVideo {

    public static boolean httpDownload(String httpUrl,  File file) {
        int byteRead;
        URL url;
        try {
            url = new URL(httpUrl);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            return false;
        }
        try {
            //2.获取链接
            URLConnection conn = url.openConnection();
            //3.输入流
            InputStream inStream = conn.getInputStream();
            //3.写入文件
            FileOutputStream fs = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            while ((byteRead = inStream.read(buffer)) != -1) {
                fs.write(buffer, 0, byteRead);
            }
            inStream.close();
            fs.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Test
    public void httpDownload() {
        httpDownload("http://1251316161.vod2.myqcloud.com/29fe1275vodbj1251316161/ad937ce75285890810614542059/GizjauzZbrUA.mp4",new File("D:22.mp4"));
    }
}
