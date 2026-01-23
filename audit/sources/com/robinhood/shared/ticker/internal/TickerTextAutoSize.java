package com.robinhood.shared.ticker.internal;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: TickerTextAutoSize.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a7\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"AUTO_SIZE_THRESHOLD", "", "calculateAutoSizeScale", "previousWidth", "currentWidth", "progress", "maxWidthPx", "minScaleFactor", "(FFFLjava/lang/Float;F)F", "calculateScaleFactor", "width", "lib-ticker-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.ticker.internal.TickerTextAutoSizeKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TickerTextAutoSize {
    public static final float AUTO_SIZE_THRESHOLD = 0.9f;

    public static final float calculateAutoSizeScale(float f, float f2, float f3, Float f4, float f5) {
        if (f4 == null) {
            return 1.0f;
        }
        float fCalculateScaleFactor = calculateScaleFactor(f4.floatValue(), f, f5);
        return fCalculateScaleFactor + ((calculateScaleFactor(f4.floatValue(), f2, f5) - fCalculateScaleFactor) * f3);
    }

    public static final float calculateScaleFactor(float f, float f2, float f3) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return 1.0f;
        }
        float f4 = f * 0.9f;
        if (f2 <= f4) {
            return 1.0f;
        }
        return RangesKt.coerceIn(f4 / f2, f3, 1.0f);
    }
}
