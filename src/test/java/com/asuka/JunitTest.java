package com.asuka;

import org.junit.Assert;
import org.junit.Test;

/**
 * 描述：mvn test测试
 *
 * @author chenpeng
 * @date 2021-04-27 11:05 AM
 */
public class JunitTest {

    @Test
    public void test1() {
        System.out.println("=====test1======");
        NumberExecute ne = new NumberExecute();
        int res = ne.add(10, 20);
        Assert.assertEquals(30, res);
    }

    @Test
    public void test2() {
        System.out.println("=====test2======");
        NumberExecute ne = new NumberExecute();
        int res = ne.add(10, 20);
        Assert.assertEquals(30, res);
    }
}
