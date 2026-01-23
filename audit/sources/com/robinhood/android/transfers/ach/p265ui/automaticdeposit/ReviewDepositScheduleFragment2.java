package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentDepositScheduleReviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewDepositScheduleFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ReviewDepositScheduleFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDepositScheduleReviewBinding> {
    public static final ReviewDepositScheduleFragment2 INSTANCE = new ReviewDepositScheduleFragment2();

    ReviewDepositScheduleFragment2() {
        super(1, FragmentDepositScheduleReviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDepositScheduleReviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDepositScheduleReviewBinding.bind(p0);
    }
}
