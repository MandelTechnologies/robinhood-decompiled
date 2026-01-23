package com.robinhood.android.common.recurring.intro;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringInvestmentBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.intro.RecurringInvestmentBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringInvestmentBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringInvestmentBottomSheetBinding> {
    public static final RecurringInvestmentBottomSheetFragment2 INSTANCE = new RecurringInvestmentBottomSheetFragment2();

    RecurringInvestmentBottomSheetFragment2() {
        super(1, FragmentRecurringInvestmentBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringInvestmentBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringInvestmentBottomSheetBinding.bind(p0);
    }
}
