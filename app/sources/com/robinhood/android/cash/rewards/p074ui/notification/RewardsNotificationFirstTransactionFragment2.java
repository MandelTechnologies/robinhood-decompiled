package com.robinhood.android.cash.rewards.p074ui.notification;

import android.view.View;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsNotificationFirstTransactionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsNotificationFirstTransactionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RewardsNotificationFirstTransactionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRewardsNotificationFirstTransactionBinding> {
    public static final RewardsNotificationFirstTransactionFragment2 INSTANCE = new RewardsNotificationFirstTransactionFragment2();

    RewardsNotificationFirstTransactionFragment2() {
        super(1, FragmentRewardsNotificationFirstTransactionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationFirstTransactionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRewardsNotificationFirstTransactionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRewardsNotificationFirstTransactionBinding.bind(p0);
    }
}
