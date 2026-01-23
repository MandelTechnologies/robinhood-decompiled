package com.robinhood.android.common.recurring.sourceoffunds;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentEquityRecurringSourceOfFundsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderSourceOfFundsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderSourceOfFundsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEquityRecurringSourceOfFundsBinding> {
    public static final RecurringOrderSourceOfFundsFragment2 INSTANCE = new RecurringOrderSourceOfFundsFragment2();

    RecurringOrderSourceOfFundsFragment2() {
        super(1, FragmentEquityRecurringSourceOfFundsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentEquityRecurringSourceOfFundsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEquityRecurringSourceOfFundsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEquityRecurringSourceOfFundsBinding.bind(p0);
    }
}
