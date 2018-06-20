package cn.abtion.blog.common;

import java.util.UUID;

/**
 * @author abtion
 * @since 2018/6/20 12:44
 * email abtion@outlook.com
 */
public class Utils {
    public static long createTimestamp() {
        return System.currentTimeMillis();
    }

    public static String createUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    // 胡乱写的主随机数生成函数

    public static int getRandom(int daySeed, int indexSeed) {
        int n = daySeed % 11117;
        for (int i = 0; i < 100 + indexSeed; i++) {
            n = n * n;
            n = n % 11117;
        }
        return n;
    }
}
