package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentMerchantRewardDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.MerchantRewardDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class MerchantRewardDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMerchantRewardDetailBinding> {
    public static final MerchantRewardDetailFragment2 INSTANCE = new MerchantRewardDetailFragment2();

    MerchantRewardDetailFragment2() {
        super(1, FragmentMerchantRewardDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentMerchantRewardDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMerchantRewardDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMerchantRewardDetailBinding.bind(p0);
    }
}
