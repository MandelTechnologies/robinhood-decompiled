package com.google.common.primitives;

/* loaded from: classes27.dex */
public final class Booleans {
    public static int compare(boolean a, boolean b) {
        if (a == b) {
            return 0;
        }
        return a ? 1 : -1;
    }

    public static boolean contains(boolean[] array2, boolean target) {
        for (boolean z : array2) {
            if (z == target) {
                return true;
            }
        }
        return false;
    }
}
