package io.jsonwebtoken;

/* loaded from: classes14.dex */
public interface CompressionCodec {
    byte[] compress(byte[] bArr) throws CompressionException;

    byte[] decompress(byte[] bArr) throws CompressionException;

    String getAlgorithmName();
}
