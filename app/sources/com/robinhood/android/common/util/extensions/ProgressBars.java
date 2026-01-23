package com.robinhood.android.common.util.extensions;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: ProgressBars.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"value", "", "progressFraction", "Landroid/widget/ProgressBar;", "getProgressFraction", "(Landroid/widget/ProgressBar;)F", "setProgressFraction", "(Landroid/widget/ProgressBar;F)V", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.ProgressBarsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ProgressBars {
    public static final float getProgressFraction(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        return progressBar.getProgress() / progressBar.getMax();
    }

    public static final void setProgressFraction(ProgressBar progressBar, float f) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        progressBar.setProgress(MathKt.roundToInt(f * progressBar.getMax()));
    }
}
