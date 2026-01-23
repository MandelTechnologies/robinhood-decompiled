package com.robinhood.android.welcome;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WelcomeAnimationViewState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.WelcomeAnimationViewState$ColorInterpolation$interpolateColors$alpha$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WelcomeAnimationViewState2 extends FunctionReferenceImpl implements Function1<Integer, Integer> {
    public static final WelcomeAnimationViewState2 INSTANCE = new WelcomeAnimationViewState2();

    WelcomeAnimationViewState2() {
        super(1, Color.class, "alpha", "alpha(I)I", 0);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(Color.alpha(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
