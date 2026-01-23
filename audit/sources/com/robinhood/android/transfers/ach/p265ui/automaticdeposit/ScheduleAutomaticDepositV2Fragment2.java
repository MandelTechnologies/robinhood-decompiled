package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentScheduleAutomaticDepositV2Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ScheduleAutomaticDepositV2Fragment2 extends FunctionReferenceImpl implements Function1<View, FragmentScheduleAutomaticDepositV2Binding> {
    public static final ScheduleAutomaticDepositV2Fragment2 INSTANCE = new ScheduleAutomaticDepositV2Fragment2();

    ScheduleAutomaticDepositV2Fragment2() {
        super(1, FragmentScheduleAutomaticDepositV2Binding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentScheduleAutomaticDepositV2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentScheduleAutomaticDepositV2Binding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentScheduleAutomaticDepositV2Binding.bind(p0);
    }
}
