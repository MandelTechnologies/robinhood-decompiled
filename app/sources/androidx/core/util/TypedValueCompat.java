package androidx.core.util;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public class TypedValueCompat {
    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i) {
        return i & 15;
    }
}
