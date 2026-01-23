package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfTextView$textColorHint$2 extends FunctionReferenceImpl implements Function2<TextView, ColorStateList, Unit> {
    public static final DefaultAttributeTransitions$OfTextView$textColorHint$2 INSTANCE = new DefaultAttributeTransitions$OfTextView$textColorHint$2();

    DefaultAttributeTransitions$OfTextView$textColorHint$2() {
        super(2, TextView.class, "setHintTextColor", "setHintTextColor(Landroid/content/res/ColorStateList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(TextView textView, ColorStateList colorStateList) {
        invoke2(textView, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextView p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setHintTextColor(colorStateList);
    }
}
