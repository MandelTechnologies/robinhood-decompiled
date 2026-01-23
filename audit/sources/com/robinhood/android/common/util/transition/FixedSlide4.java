package com.robinhood.android.common.util.transition;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.util.transition.FixedSlide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FixedSlide.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"com/robinhood/android/common/util/transition/FixedSlide$Companion$calculateLeft$1", "Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlideHorizontal;", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "amount", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.transition.FixedSlide$Companion$calculateLeft$1, reason: use source file name */
/* loaded from: classes2.dex */
public final class FixedSlide4 extends FixedSlide.CalculateSlideHorizontal {
    FixedSlide4() {
    }

    @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
    public float getGoneX(ViewGroup sceneRoot, View view, float amount) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (-view.getTranslationX()) - amount;
    }
}
