package com.robinhood.android.designsystem.style;

import android.content.res.ColorStateList;
import com.robinhood.android.designsystem.card.RdsCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
/* synthetic */ class Defaults$cardBackgroundColor$2 extends FunctionReferenceImpl implements Function2<RdsCardView, ColorStateList, Unit> {
    public static final Defaults$cardBackgroundColor$2 INSTANCE = new Defaults$cardBackgroundColor$2();

    Defaults$cardBackgroundColor$2() {
        super(2, RdsCardView.class, "setCardBackgroundColor", "setCardBackgroundColor(Landroid/content/res/ColorStateList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RdsCardView rdsCardView, ColorStateList colorStateList) {
        invoke2(rdsCardView, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RdsCardView p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setCardBackgroundColor(colorStateList);
    }
}
