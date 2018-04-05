package io.sukebeta.sha;

/**
 *
 */
public class SHAUtils {

    /**
     *
     * @param data
     * @return
     */
    public static byte[] sha256(byte[] data) {
        return SHA.SHA_256.sha(data);
    }

    /**
     *
     * @param data
     * @return
     */
    public static byte[] sha512(byte[] data) {
        return SHA.SHA_512.sha(data);
    }

    /**
     *
     * @param data
     * @return
     */
    public static byte[] sha1(byte[] data) {
        return SHA.SHA_1.sha(data);
    }

}
