package com.robinhood.android.designsystem.animation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CircularReveal.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a*\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\n"}, m3636d2 = {"createCircularReveal", "Lcom/robinhood/android/designsystem/animation/CircularRevealBuilder;", "Landroid/view/View;", "centerX", "", "centerY", "startRadius", "", "endRadius", "createCircularHide", "lib-design-system_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes2.dex */
public final class CircularReveal {
    public static final CircularReveal2 createCircularReveal(View view, int i, int i2, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new CircularReveal2(view, true, i, i2, f, f2);
    }

    public static final CircularReveal2 createCircularHide(View view, int i, int i2, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new CircularReveal2(view, false, i, i2, f, f2);
    }
}
