package com.zhl.attackontitan;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author lzh
 * @time 2021��1��31��
 */
public class AttackOnTitanApp {

    public static void main(String[] args) throws FileNotFoundException {
        //��һ��
        List<String> list1 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/5314-1-", 31);
        GetTheTXT.ToTheTXT(list1,"�����ľ��˵�һ��");
        //�ڶ���
        List<String> list2 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/5134-1-", 12);
        GetTheTXT.ToTheTXT(list2,"�����ľ��˵ڶ���");
//        //������
//        List<String> list3 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/5449-1-", 22);
//        GetTheTXT.ToTheTXT(list3,"�����ľ��˵�����");
//        //������Part.2 ���Բ��� �������Ѿ�ȫ��������
//        List<String> list3_1 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/3040-1-", 11);
//        GetTheTXT.ToTheTXT(list3_1,"�����ľ��˵�����Part.2");
//        //���ļ�
//        List<String> list4 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/10445-1-", 8);
//        GetTheTXT.ToTheTXT(list4,"�����ľ��˵��ļ�");
    }
}
