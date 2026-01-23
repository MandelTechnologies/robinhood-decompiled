package com.robinhood.android.cash.merchantrewards.p073ui;

import android.view.View;
import com.robinhood.android.cash.merchantrewards.databinding.FragmentMerchantrewardsWelcomeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsWelcomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MerchantRewardsWelcomeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMerchantrewardsWelcomeBinding> {
    public static final MerchantRewardsWelcomeFragment2 INSTANCE = new MerchantRewardsWelcomeFragment2();

    MerchantRewardsWelcomeFragment2() {
        super(1, FragmentMerchantrewardsWelcomeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsWelcomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMerchantrewardsWelcomeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMerchantrewardsWelcomeBinding.bind(p0);
    }
}
