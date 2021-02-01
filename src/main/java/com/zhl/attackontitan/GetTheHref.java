package com.zhl.attackontitan;

import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lzh
 * @time 2021��1��31��
 */
public class GetTheHref {

    /**
     * ��ȡӣ��������ҳ��Ƶԭ����
     * @param pre_url URL·��ǰ׺
     * @param number ÿһ���ж��ټ�
     * @return ��Ƶ·���ļ���
     */
    public static synchronized List<String> fromTheURL(String pre_url, int number) {
        String sourceURL;
        Document document;
        List<String> urls = new LinkedList<String>();
        try {
            for(int index = 1; index <= number; index ++) {
                String url = pre_url + index + ".html";
                document = Jsoup.connect(url).get();
                String a = document.getElementsByTag("script").get(9).toString();
                sourceURL = (String)JSONObject.parseObject(a.substring(a.indexOf('{'), a.indexOf('}') + 1)).get("url");
                if(sourceURL != null){
                    if(sourceURL.contains("�����ľ���"))
                        continue;
                    urls.add(sourceURL);
                }
            }
            for (String s : urls) {
                System.out.println(s);
            }
            return urls;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls;
    }
}
