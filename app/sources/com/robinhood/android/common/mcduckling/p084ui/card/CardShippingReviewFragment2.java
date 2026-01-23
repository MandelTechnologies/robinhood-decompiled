package com.robinhood.android.common.mcduckling.p084ui.card;

import android.view.View;
import com.robinhood.android.common.mcduckling.databinding.FragmentCardShippingReviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardShippingReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.mcduckling.ui.card.CardShippingReviewFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CardShippingReviewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardShippingReviewBinding> {
    public static final CardShippingReviewFragment2 INSTANCE = new CardShippingReviewFragment2();

    CardShippingReviewFragment2() {
        super(1, FragmentCardShippingReviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/mcduckling/databinding/FragmentCardShippingReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardShippingReviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardShippingReviewBinding.bind(p0);
    }
}
