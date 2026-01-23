package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfProgressBar$progressTint$2 extends FunctionReferenceImpl implements Function2<ProgressBar, ColorStateList, Unit> {
    public static final DefaultAttributeTransitions$OfProgressBar$progressTint$2 INSTANCE = new DefaultAttributeTransitions$OfProgressBar$progressTint$2();

    DefaultAttributeTransitions$OfProgressBar$progressTint$2() {
        super(2, ProgressBar.class, "setProgressTintList", "setProgressTintList(Landroid/content/res/ColorStateList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ProgressBar progressBar, ColorStateList colorStateList) {
        invoke2(progressBar, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProgressBar p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setProgressTintList(colorStateList);
    }
}
