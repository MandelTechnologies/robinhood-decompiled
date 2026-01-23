package com.robinhood.android.common.recurring.amount.type;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderAmountTypeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountTypeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderAmountTypeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringOrderAmountTypeBinding> {
    public static final RecurringOrderAmountTypeFragment2 INSTANCE = new RecurringOrderAmountTypeFragment2();

    RecurringOrderAmountTypeFragment2() {
        super(1, FragmentRecurringOrderAmountTypeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderAmountTypeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringOrderAmountTypeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringOrderAmountTypeBinding.bind(p0);
    }
}
