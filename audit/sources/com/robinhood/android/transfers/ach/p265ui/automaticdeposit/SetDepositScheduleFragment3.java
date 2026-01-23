package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentSetDepositScheduleBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetDepositScheduleFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SetDepositScheduleFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentSetDepositScheduleBinding> {
    public static final SetDepositScheduleFragment3 INSTANCE = new SetDepositScheduleFragment3();

    SetDepositScheduleFragment3() {
        super(1, FragmentSetDepositScheduleBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentSetDepositScheduleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSetDepositScheduleBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSetDepositScheduleBinding.bind(p0);
    }
}
