package java;

import com.zhl.attackontitan.DownloadUtil;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author zhl
 * @create 2021/2/1 10:11
 * @description
 */
public class testDownload {
    /**
     * 测试视频下载/单个视频下载器
     */
    @Test
    public void httpDownload() {
        DownloadUtil.httpDownload("http://1251316161.vod2.myqcloud.com/29fe1275vodbj1251316161/ad937ce75285890810614542059/GizjauzZbrUA.mp4",new File("D:22.mp4"));
    }
}
