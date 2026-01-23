package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfView$foregroundTint$2 extends FunctionReferenceImpl implements Function2<View, ColorStateList, Unit> {
    public static final DefaultAttributeTransitions$OfView$foregroundTint$2 INSTANCE = new DefaultAttributeTransitions$OfView$foregroundTint$2();

    DefaultAttributeTransitions$OfView$foregroundTint$2() {
        super(2, View.class, "setForegroundTintList", "setForegroundTintList(Landroid/content/res/ColorStateList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(View view, ColorStateList colorStateList) {
        invoke2(view, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setForegroundTintList(colorStateList);
    }
}
