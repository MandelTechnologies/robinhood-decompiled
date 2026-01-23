package com.robinhood.android.common.recurring.trade;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderExplanationBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderExplanationBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderExplanationBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderExplanationBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringOrderExplanationBottomSheetBinding> {
    public static final RecurringOrderExplanationBottomSheetFragment2 INSTANCE = new RecurringOrderExplanationBottomSheetFragment2();

    RecurringOrderExplanationBottomSheetFragment2() {
        super(1, FragmentRecurringOrderExplanationBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderExplanationBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringOrderExplanationBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringOrderExplanationBottomSheetBinding.bind(p0);
    }
}
