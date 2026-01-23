package com.robinhood.android.common.recurring.trade;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.MergeRecurringOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$mergeBindings$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderFragment3 extends FunctionReferenceImpl implements Function1<View, MergeRecurringOrderBinding> {
    public static final RecurringOrderFragment3 INSTANCE = new RecurringOrderFragment3();

    RecurringOrderFragment3() {
        super(1, MergeRecurringOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/MergeRecurringOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRecurringOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRecurringOrderBinding.bind(p0);
    }
}
