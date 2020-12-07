package com.my.crowd.util;

import com.my.crowd.constant.CrowdConstant;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class CrowdUtil {
    /**
     * 对明文字符串进行md5加密
     * @param source 传入的字符串
     * @return 加密结果
     */
    public static String md5(String source){

        // 判断source是否有效
        if (source == null || source.length() == 0){
            // source不合法抛出异常
            throw new RuntimeException(CrowdConstant.MESSAGE_LOGIN_STRING_INVALIDATE);
        }

        try {
            // 获取MessageDigest对象
            String algorithm = "md5";

            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);

            // 获取对应字节数组
            byte[] input = source.getBytes();

            // 加密
            byte[] output = messageDigest.digest(input);

            // 创建BigInteger
            int signum = 1;
            BigInteger bigInteger = new BigInteger(1,output);

            // 按照16进制将BigInteger的值转换为字符串
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();

            return encoded;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 判断请求是否为ajax请求
     * @param request 请求对象
     * @return
     *     true 是ajax请求
     *     false 不是ajax请求
     */
    public static boolean judgeRequestType(HttpServletRequest request){

        // 获取消息头
        String acceptHeader = request.getHeader("Accept");
        String xRequestHeader = request.getHeader("X-Requested-With");

        return ((acceptHeader != null && acceptHeader.contains("application/json"))
                ||
                (xRequestHeader != null && xRequestHeader.equals("XMLHttpRequest")));
    }
}
