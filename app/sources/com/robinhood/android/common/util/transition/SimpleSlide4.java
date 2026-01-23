package com.robinhood.android.common.util.transition;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.util.transition.SimpleSlide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleSlide.kt */
@Metadata(m3635d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"com/robinhood/android/common/util/transition/SimpleSlide$Companion$calculateLeft$1", "Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlideHorizontal;", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.transition.SimpleSlide$Companion$calculateLeft$1, reason: use source file name */
/* loaded from: classes2.dex */
public final class SimpleSlide4 extends SimpleSlide.CalculateSlideHorizontal {
    SimpleSlide4() {
    }

    @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
    public float getGoneX(ViewGroup sceneRoot, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (-view.getTranslationX()) - view.getRight();
    }
}
