package com.robinhood.android.rewards.p240ui;

import android.view.View;
import com.robinhood.android.rewards.databinding.FragmentRewardDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rewards.ui.RewardDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RewardDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRewardDetailBinding> {
    public static final RewardDetailFragment2 INSTANCE = new RewardDetailFragment2();

    RewardDetailFragment2() {
        super(1, FragmentRewardDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rewards/databinding/FragmentRewardDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRewardDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRewardDetailBinding.bind(p0);
    }
}
