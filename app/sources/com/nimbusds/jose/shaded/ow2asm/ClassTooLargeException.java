package com.nimbusds.jose.shaded.ow2asm;

/* loaded from: classes27.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i) {
        super("Class too large: " + str);
        this.className = str;
        this.constantPoolCount = i;
    }
}
