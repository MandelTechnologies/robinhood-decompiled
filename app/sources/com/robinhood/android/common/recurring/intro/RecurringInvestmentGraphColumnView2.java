package com.robinhood.android.common.recurring.intro;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.MergeRecurringInvestmentGraphColumnViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentGraphColumnView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.intro.RecurringInvestmentGraphColumnView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringInvestmentGraphColumnView2 extends FunctionReferenceImpl implements Function1<View, MergeRecurringInvestmentGraphColumnViewBinding> {
    public static final RecurringInvestmentGraphColumnView2 INSTANCE = new RecurringInvestmentGraphColumnView2();

    RecurringInvestmentGraphColumnView2() {
        super(1, MergeRecurringInvestmentGraphColumnViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphColumnViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRecurringInvestmentGraphColumnViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRecurringInvestmentGraphColumnViewBinding.bind(p0);
    }
}
