package top.redautu.utils;

import java.lang.annotation.Target;
import java.util.UUID;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class IdUtils {

    public static String getUid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
