package com.robinhood.android.common.recurring.amount;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringAmountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderAmountFragment6 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringAmountBinding> {
    public static final RecurringOrderAmountFragment6 INSTANCE = new RecurringOrderAmountFragment6();

    RecurringOrderAmountFragment6() {
        super(1, FragmentRecurringAmountBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringAmountBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringAmountBinding.bind(p0);
    }
}
