package com.google.common.primitives;

import com.google.common.base.Preconditions;

/* loaded from: classes27.dex */
public final class Chars {
    public static char fromBytes(byte b1, byte b2) {
        return (char) ((b1 << 8) | (b2 & 255));
    }

    public static char checkedCast(long value) {
        char c = (char) value;
        Preconditions.checkArgument(((long) c) == value, "Out of range: %s", value);
        return c;
    }

    public static boolean contains(char[] array2, char target) {
        for (char c : array2) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
