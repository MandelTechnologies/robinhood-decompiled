package com.robinhood.android.banking.p065ui;

import android.view.View;
import com.robinhood.android.banking.lib.databinding.FragmentScheduleAutomaticDepositBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScheduleAutomaticDepositFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.ui.ScheduleAutomaticDepositFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ScheduleAutomaticDepositFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentScheduleAutomaticDepositBinding> {
    public static final ScheduleAutomaticDepositFragment2 INSTANCE = new ScheduleAutomaticDepositFragment2();

    ScheduleAutomaticDepositFragment2() {
        super(1, FragmentScheduleAutomaticDepositBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/banking/lib/databinding/FragmentScheduleAutomaticDepositBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentScheduleAutomaticDepositBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentScheduleAutomaticDepositBinding.bind(p0);
    }
}
