package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderPaycheckSourceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderPaycheckSourceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderPaycheckSourceFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringOrderPaycheckSourceBinding> {
    public static final RecurringOrderPaycheckSourceFragment2 INSTANCE = new RecurringOrderPaycheckSourceFragment2();

    RecurringOrderPaycheckSourceFragment2() {
        super(1, FragmentRecurringOrderPaycheckSourceBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderPaycheckSourceBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringOrderPaycheckSourceBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringOrderPaycheckSourceBinding.bind(p0);
    }
}
