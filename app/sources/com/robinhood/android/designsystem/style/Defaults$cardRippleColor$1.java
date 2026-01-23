package com.robinhood.android.designsystem.style;

import android.content.res.ColorStateList;
import com.robinhood.android.designsystem.card.RdsCardView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
/* synthetic */ class Defaults$cardRippleColor$1 extends FunctionReferenceImpl implements Function1<RdsCardView, ColorStateList> {
    public static final Defaults$cardRippleColor$1 INSTANCE = new Defaults$cardRippleColor$1();

    Defaults$cardRippleColor$1() {
        super(1, RdsCardView.class, "getRippleColor", "getRippleColor()Landroid/content/res/ColorStateList;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ColorStateList invoke(RdsCardView p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getRippleColor();
    }
}
