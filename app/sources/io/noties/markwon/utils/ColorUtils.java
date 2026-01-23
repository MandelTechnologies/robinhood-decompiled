package io.noties.markwon.utils;

/* loaded from: classes14.dex */
public abstract class ColorUtils {
    public static int applyAlpha(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
