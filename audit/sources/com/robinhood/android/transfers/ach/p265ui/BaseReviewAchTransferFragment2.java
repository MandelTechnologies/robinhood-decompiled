package com.robinhood.android.transfers.ach.p265ui;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentReviewAchTransferBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseReviewAchTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.BaseReviewAchTransferFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class BaseReviewAchTransferFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentReviewAchTransferBinding> {
    public static final BaseReviewAchTransferFragment2 INSTANCE = new BaseReviewAchTransferFragment2();

    BaseReviewAchTransferFragment2() {
        super(1, FragmentReviewAchTransferBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentReviewAchTransferBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentReviewAchTransferBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentReviewAchTransferBinding.bind(p0);
    }
}
