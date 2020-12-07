package com.my.crowd.test;

import com.my.crowd.util.CrowdUtil;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/15
 */
public class StringTest {

    private Logger logger = LoggerFactory.getLogger(StringTest.class);

    @Test
    public void testMd5() {
        String source = "userAcct2";
        String encode = CrowdUtil.md5(source);

        logger.info(encode);

    }

    @Test
    public void testLocalDateTime() {
        LocalDateTime rightNow = LocalDateTime.now();

        String result1 = rightNow.format(DateTimeFormatter.BASIC_ISO_DATE);
        String result2 = rightNow.format(DateTimeFormatter.ISO_DATE);

        String result3 = rightNow.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.println(rightNow);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
