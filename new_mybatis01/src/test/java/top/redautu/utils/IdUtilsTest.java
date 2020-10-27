package top.redautu.utils;

import org.junit.Test;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class IdUtilsTest {
    @Test
    public void getUidTest(){
        String uid = IdUtils.getUid();
        System.out.println(uid);
    }
}
