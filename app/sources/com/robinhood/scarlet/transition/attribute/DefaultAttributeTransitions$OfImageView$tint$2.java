package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
/* synthetic */ class DefaultAttributeTransitions$OfImageView$tint$2 extends FunctionReferenceImpl implements Function2<ImageView, ColorStateList, Unit> {
    public static final DefaultAttributeTransitions$OfImageView$tint$2 INSTANCE = new DefaultAttributeTransitions$OfImageView$tint$2();

    DefaultAttributeTransitions$OfImageView$tint$2() {
        super(2, ImageView.class, "setImageTintList", "setImageTintList(Landroid/content/res/ColorStateList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView, ColorStateList colorStateList) {
        invoke2(imageView, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ImageView p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setImageTintList(colorStateList);
    }
}
