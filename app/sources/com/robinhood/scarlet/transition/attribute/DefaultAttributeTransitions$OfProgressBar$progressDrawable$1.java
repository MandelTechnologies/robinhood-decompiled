package com.robinhood.scarlet.transition.attribute;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfProgressBar$progressDrawable$1 extends FunctionReferenceImpl implements Function1<ProgressBar, Drawable> {
    public static final DefaultAttributeTransitions$OfProgressBar$progressDrawable$1 INSTANCE = new DefaultAttributeTransitions$OfProgressBar$progressDrawable$1();

    DefaultAttributeTransitions$OfProgressBar$progressDrawable$1() {
        super(1, ProgressBar.class, "getProgressDrawable", "getProgressDrawable()Landroid/graphics/drawable/Drawable;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Drawable invoke(ProgressBar p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getProgressDrawable();
    }
}
