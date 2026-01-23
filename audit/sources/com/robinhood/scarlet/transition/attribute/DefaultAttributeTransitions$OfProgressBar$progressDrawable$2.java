package com.robinhood.scarlet.transition.attribute;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfProgressBar$progressDrawable$2 extends FunctionReferenceImpl implements Function2<ProgressBar, Drawable, Unit> {
    public static final DefaultAttributeTransitions$OfProgressBar$progressDrawable$2 INSTANCE = new DefaultAttributeTransitions$OfProgressBar$progressDrawable$2();

    DefaultAttributeTransitions$OfProgressBar$progressDrawable$2() {
        super(2, ProgressBar.class, "setProgressDrawable", "setProgressDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ProgressBar progressBar, Drawable drawable) {
        invoke2(progressBar, drawable);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProgressBar p0, Drawable drawable) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setProgressDrawable(drawable);
    }
}
