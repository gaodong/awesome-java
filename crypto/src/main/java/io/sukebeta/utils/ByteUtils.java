package io.sukebeta.utils;

import org.springframework.util.Assert;

import java.nio.charset.Charset;

/**
 *
 */
public class ByteUtils {

    /**
     * 字符串转byte数组
     *
     * @param val
     * @param charset
     * @return
     */
    public static byte[] str2bytes(String val, Charset charset) {
        Assert.hasText(val, "val is null");
        byte[] bytes = val.getBytes(charset);
        return bytes;
    }

    /**
     * 字符串转byte数组
     *
     * @param string
     * @return
     */
    public static byte[] str2bytes(String string) {
        return str2bytes(string, Charset.forName("utf-8"));
    }



    /**
     * 字符串转byte数组
     *
     * @param data
     * @param charset
     * @return
     */
    public static String byte2str(byte[] data, Charset charset) {
        Assert.notNull(data, "data is null");
        String ret = new String(data, charset);
        return ret;
    }
    /**
     * 字符串转byte数组
     *
     * @param data
     * @return
     */
    public static String byte2str(byte[] data) {
        return byte2str(data, Charset.forName("utf-8"));
    }



}
