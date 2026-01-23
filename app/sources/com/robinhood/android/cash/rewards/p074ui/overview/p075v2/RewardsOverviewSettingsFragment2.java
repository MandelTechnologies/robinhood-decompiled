package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import android.view.View;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsOverviewSettingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOverviewSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RewardsOverviewSettingsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRewardsOverviewSettingsBinding> {
    public static final RewardsOverviewSettingsFragment2 INSTANCE = new RewardsOverviewSettingsFragment2();

    RewardsOverviewSettingsFragment2() {
        super(1, FragmentRewardsOverviewSettingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewSettingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRewardsOverviewSettingsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRewardsOverviewSettingsBinding.bind(p0);
    }
}
