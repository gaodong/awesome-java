package io.sukebeta.utils;

public class Bytes {

    private byte[] data;

    private Bytes(byte[] data) {
        this.data = data;
    }

    public static Bytes wrap(byte[] data) {
        return new Bytes(data);
    }

    public String toHex() {
        return "";
    }

    public String toBase64() {
        return "";
    }

    public String toString() {
        return "";
    }
}
