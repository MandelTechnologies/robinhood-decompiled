package com.robinhood.scarlet.transition.attribute;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfImageView$src$1 extends FunctionReferenceImpl implements Function1<ImageView, Drawable> {
    public static final DefaultAttributeTransitions$OfImageView$src$1 INSTANCE = new DefaultAttributeTransitions$OfImageView$src$1();

    DefaultAttributeTransitions$OfImageView$src$1() {
        super(1, ImageView.class, "getDrawable", "getDrawable()Landroid/graphics/drawable/Drawable;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Drawable invoke(ImageView p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getDrawable();
    }
}
