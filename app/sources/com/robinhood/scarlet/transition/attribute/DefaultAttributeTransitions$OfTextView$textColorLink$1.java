package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfTextView$textColorLink$1 extends FunctionReferenceImpl implements Function1<TextView, ColorStateList> {
    public static final DefaultAttributeTransitions$OfTextView$textColorLink$1 INSTANCE = new DefaultAttributeTransitions$OfTextView$textColorLink$1();

    DefaultAttributeTransitions$OfTextView$textColorLink$1() {
        super(1, TextView.class, "getLinkTextColors", "getLinkTextColors()Landroid/content/res/ColorStateList;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ColorStateList invoke(TextView p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getLinkTextColors();
    }
}
