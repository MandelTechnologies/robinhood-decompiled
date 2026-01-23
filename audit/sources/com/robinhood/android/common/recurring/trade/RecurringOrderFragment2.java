package com.robinhood.android.common.recurring.trade;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$fragmentBindings$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringOrderBinding> {
    public static final RecurringOrderFragment2 INSTANCE = new RecurringOrderFragment2();

    RecurringOrderFragment2() {
        super(1, FragmentRecurringOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringOrderBinding.bind(p0);
    }
}
