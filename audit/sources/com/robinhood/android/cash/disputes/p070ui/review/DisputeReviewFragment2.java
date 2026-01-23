package com.robinhood.android.cash.disputes.p070ui.review;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentDisputeReviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.review.DisputeReviewFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DisputeReviewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDisputeReviewBinding> {
    public static final DisputeReviewFragment2 INSTANCE = new DisputeReviewFragment2();

    DisputeReviewFragment2() {
        super(1, FragmentDisputeReviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentDisputeReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDisputeReviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDisputeReviewBinding.bind(p0);
    }
}
