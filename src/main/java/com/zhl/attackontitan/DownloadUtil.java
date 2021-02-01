package com.zhl.attackontitan;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
/**
 * @author lzh
 * @time 2021��1��31��
 */
public class DownloadUtil {
    /**
     * ����·��������Ƶ��д���ļ�
     * @param httpUrl
     * @param file
     * @return
     */
    public static boolean httpDownload(String httpUrl, File file) {
        int byteRead;
        URL url;
        try {
            url = new URL(httpUrl);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            return false;
        }
        try {
            //2.��ȡ����
            URLConnection conn = url.openConnection();
            //3.������
            InputStream inStream = conn.getInputStream();
            //3.д���ļ�
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
}
