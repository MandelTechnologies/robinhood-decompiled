package com.robinhood.android.common.recurring.intro;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.MergeRecurringInvestmentGraphLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentGraphLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.intro.RecurringInvestmentGraphLayout$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringInvestmentGraphLayout2 extends FunctionReferenceImpl implements Function1<View, MergeRecurringInvestmentGraphLayoutBinding> {
    public static final RecurringInvestmentGraphLayout2 INSTANCE = new RecurringInvestmentGraphLayout2();

    RecurringInvestmentGraphLayout2() {
        super(1, MergeRecurringInvestmentGraphLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphLayoutBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRecurringInvestmentGraphLayoutBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRecurringInvestmentGraphLayoutBinding.bind(p0);
    }
}
