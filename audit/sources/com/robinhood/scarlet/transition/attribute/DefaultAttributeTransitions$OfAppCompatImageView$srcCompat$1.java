package com.robinhood.scarlet.transition.attribute;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$1 extends FunctionReferenceImpl implements Function1<AppCompatImageView, Drawable> {
    public static final DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$1 INSTANCE = new DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$1();

    DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$1() {
        super(1, AppCompatImageView.class, "getDrawable", "getDrawable()Landroid/graphics/drawable/Drawable;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Drawable invoke(AppCompatImageView p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getDrawable();
    }
}
