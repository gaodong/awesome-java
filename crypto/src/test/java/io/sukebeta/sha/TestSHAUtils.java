package io.sukebeta.sha;

import org.junit.Test;

import java.nio.charset.Charset;

/**
 *
 */
public class TestSHAUtils {

    /**
     *
     */
    @Test
    public void testSHA1() {
        String source = "TestString";
        byte[] data = source.getBytes(Charset.forName("utf-8"));
        byte[] ret = SHAUtils.sha1(data);
    }

    /**
     *
     */
    @Test
    public void testSHA256() {
        String source = "TestString";
        byte[] data = source.getBytes(Charset.forName("utf-8"));
        byte[] ret = SHAUtils.sha256(data);
    }

    /**
     *
     */
    @Test
    public void testSHA512() {
        String source = "TestString";
        byte[] data = source.getBytes(Charset.forName("utf-8"));
        byte[] ret = SHAUtils.sha512(data);
    }
}
