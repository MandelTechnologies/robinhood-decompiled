package com.robinhood.android.support.call.textanimator.spans;

import kotlin.Metadata;

/* compiled from: SpanUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, m3636d2 = {"calculateGravityOffsetX", "", "gravity", "", "startWidth", "endWidth", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.textanimator.spans.SpanUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SpanUtils2 {
    public static final float calculateGravityOffsetX(int i, int i2, int i3) {
        if ((i & 7) == 1) {
            return (i3 - i2) / 2.0f;
        }
        return 0.0f;
    }
}
