package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\n\u001a\u0017\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0002*\u00020\u0001H\u0087\b\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m3636d2 = {"alphaFraction", "", "", "getAlphaFraction", "(I)F", "withAlpha", "value", "withAlphaFraction", "deriveColor", "alphaMultiplier", "alphaToFraction", "fractionToAlpha", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ColorsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Colors7 {
    public static final float alphaToFraction(int i) {
        return i / 255.0f;
    }

    public static final float getAlphaFraction(int i) {
        return ((i >> 24) & 255) / 255.0f;
    }

    public static final int withAlpha(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static final int deriveColor(int i, float f) {
        return (i & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(((((i >> 24) & 255) / 255.0f) * f) * 255), 0, 255) << 24);
    }

    public static final int fractionToAlpha(float f) {
        return RangesKt.coerceIn(MathKt.roundToInt(f * 255), 0, 255);
    }

    public static final int withAlphaFraction(int i, float f) {
        return (i & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(f * 255), 0, 255) << 24);
    }
}
