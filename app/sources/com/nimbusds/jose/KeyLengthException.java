package com.nimbusds.jose;

/* loaded from: classes27.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }

    public KeyLengthException(int i, Algorithm algorithm) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            str = "The expected key length is " + i + " bits";
        } else {
            str = "Unexpected key length";
        }
        sb.append(str);
        if (algorithm != null) {
            str2 = " (for " + algorithm + " algorithm)";
        } else {
            str2 = "";
        }
        sb.append(str2);
        super(sb.toString());
        this.expectedLength = i;
        this.alg = algorithm;
    }
}
