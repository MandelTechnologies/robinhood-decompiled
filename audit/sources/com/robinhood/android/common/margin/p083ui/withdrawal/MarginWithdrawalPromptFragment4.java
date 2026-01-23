package com.robinhood.android.common.margin.p083ui.withdrawal;

import android.view.View;
import com.robinhood.android.common.margin.databinding.FragmentMarginWithdrawalPromptBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginWithdrawalPromptFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class MarginWithdrawalPromptFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentMarginWithdrawalPromptBinding> {
    public static final MarginWithdrawalPromptFragment4 INSTANCE = new MarginWithdrawalPromptFragment4();

    MarginWithdrawalPromptFragment4() {
        super(1, FragmentMarginWithdrawalPromptBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/margin/databinding/FragmentMarginWithdrawalPromptBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMarginWithdrawalPromptBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMarginWithdrawalPromptBinding.bind(p0);
    }
}
