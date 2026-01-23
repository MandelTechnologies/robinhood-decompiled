package com.robinhood.android.cash.rewards.p074ui.notification;

import android.view.View;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsNotificationDetailsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsNotificationDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RewardsNotificationDetailsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRewardsNotificationDetailsBinding> {
    public static final RewardsNotificationDetailsFragment2 INSTANCE = new RewardsNotificationDetailsFragment2();

    RewardsNotificationDetailsFragment2() {
        super(1, FragmentRewardsNotificationDetailsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRewardsNotificationDetailsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRewardsNotificationDetailsBinding.bind(p0);
    }
}
