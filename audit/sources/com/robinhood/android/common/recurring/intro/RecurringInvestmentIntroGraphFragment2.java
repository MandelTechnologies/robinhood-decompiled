package com.robinhood.android.common.recurring.intro;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringInvestmentIntroGraphBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentIntroGraphFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroGraphFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringInvestmentIntroGraphFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringInvestmentIntroGraphBinding> {
    public static final RecurringInvestmentIntroGraphFragment2 INSTANCE = new RecurringInvestmentIntroGraphFragment2();

    RecurringInvestmentIntroGraphFragment2() {
        super(1, FragmentRecurringInvestmentIntroGraphBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentIntroGraphBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringInvestmentIntroGraphBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringInvestmentIntroGraphBinding.bind(p0);
    }
}
