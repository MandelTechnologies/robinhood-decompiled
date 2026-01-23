package com.robinhood.scarlet.transition.attribute;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$2 extends FunctionReferenceImpl implements Function2<AppCompatImageView, Drawable, Unit> {
    public static final DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$2 INSTANCE = new DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$2();

    DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$2() {
        super(2, AppCompatImageView.class, "setImageDrawable", "setImageDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AppCompatImageView appCompatImageView, Drawable drawable) {
        invoke2(appCompatImageView, drawable);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AppCompatImageView p0, Drawable drawable) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setImageDrawable(drawable);
    }
}
