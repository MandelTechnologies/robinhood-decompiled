package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfImageView$tint$1 extends FunctionReferenceImpl implements Function1<ImageView, ColorStateList> {
    public static final DefaultAttributeTransitions$OfImageView$tint$1 INSTANCE = new DefaultAttributeTransitions$OfImageView$tint$1();

    DefaultAttributeTransitions$OfImageView$tint$1() {
        super(1, ImageView.class, "getImageTintList", "getImageTintList()Landroid/content/res/ColorStateList;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ColorStateList invoke(ImageView p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getImageTintList();
    }
}
