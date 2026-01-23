package com.robinhood.android.welcome;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WelcomeAnimationViewState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.WelcomeAnimationViewState$ColorInterpolation$interpolateColors$green$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WelcomeAnimationViewState4 extends FunctionReferenceImpl implements Function1<Integer, Integer> {
    public static final WelcomeAnimationViewState4 INSTANCE = new WelcomeAnimationViewState4();

    WelcomeAnimationViewState4() {
        super(1, Color.class, "green", "green(I)I", 0);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(Color.green(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
