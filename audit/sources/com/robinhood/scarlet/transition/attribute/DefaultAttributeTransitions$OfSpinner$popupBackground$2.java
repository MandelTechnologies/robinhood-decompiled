package com.robinhood.scarlet.transition.attribute;

import android.graphics.drawable.Drawable;
import android.widget.Spinner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfSpinner$popupBackground$2 extends FunctionReferenceImpl implements Function2<Spinner, Drawable, Unit> {
    public static final DefaultAttributeTransitions$OfSpinner$popupBackground$2 INSTANCE = new DefaultAttributeTransitions$OfSpinner$popupBackground$2();

    DefaultAttributeTransitions$OfSpinner$popupBackground$2() {
        super(2, Spinner.class, "setPopupBackgroundDrawable", "setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Spinner spinner, Drawable drawable) {
        invoke2(spinner, drawable);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Spinner p0, Drawable drawable) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setPopupBackgroundDrawable(drawable);
    }
}
