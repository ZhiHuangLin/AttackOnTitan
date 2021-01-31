package com.zhl.attackontitan;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author lzh
 * @time 2021年1月31日
 */
public class AttackOnTitanApp {

    public static void main(String[] args) throws FileNotFoundException {
        //第一季
        List<String> list1 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/5314-1-", 31);
        GetTheTXT.ToTheTXT(list1,"进击的巨人第一季");
        //第二季
        List<String> list2 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/5134-1-", 12);
        GetTheTXT.ToTheTXT(list2,"进击的巨人第二季");
//        //第三季
//        List<String> list3 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/5449-1-", 22);
//        GetTheTXT.ToTheTXT(list3,"进击的巨人第三季");
//        //第三季Part.2 可以不下 第三季已经全部包含了
//        List<String> list3_1 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/3040-1-", 11);
//        GetTheTXT.ToTheTXT(list3_1,"进击的巨人第三季Part.2");
//        //第四季
//        List<String> list4 = GetTheHref.fromTheURL("http://www.chinakfa.com/vp/10445-1-", 8);
//        GetTheTXT.ToTheTXT(list4,"进击的巨人第四季");
    }
}
