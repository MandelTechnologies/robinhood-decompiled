package com.robinhood.android.designsystem.style;

import android.content.res.ColorStateList;
import com.robinhood.android.designsystem.button.RdsButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
/* synthetic */ class Defaults$buttonStrokeColor$2 extends FunctionReferenceImpl implements Function2<RdsButton, ColorStateList, Unit> {
    public static final Defaults$buttonStrokeColor$2 INSTANCE = new Defaults$buttonStrokeColor$2();

    Defaults$buttonStrokeColor$2() {
        super(2, RdsButton.class, "setStrokeColor", "setStrokeColor(Landroid/content/res/ColorStateList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RdsButton rdsButton, ColorStateList colorStateList) {
        invoke2(rdsButton, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RdsButton p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setStrokeColor(colorStateList);
    }
}
