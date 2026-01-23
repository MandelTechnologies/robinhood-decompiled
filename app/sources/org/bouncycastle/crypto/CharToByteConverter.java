package org.bouncycastle.crypto;

/* loaded from: classes25.dex */
public interface CharToByteConverter {
    byte[] convert(char[] cArr);

    String getType();
}
