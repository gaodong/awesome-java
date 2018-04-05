package io.sukebeta.sha;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 */
public enum SHA {

    SHA_1("SHA1"), SHA_256("sha-256"), SHA_512("sha-512");

    private MessageDigest messageDigest;

    /**
     *
     * @param shaType
     */
    SHA(String shaType) {
        try {
            this.messageDigest = MessageDigest.getInstance(shaType);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(String.format("Not exist %s algorithm", shaType));
        }
    }

    /**
     *
     * @param data
     * @return
     */
    public byte[] sha(byte[] data) {
        messageDigest.update(data);
        byte buffer[] = messageDigest.digest();
        return buffer;
    }
}
