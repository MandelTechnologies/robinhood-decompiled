package com.robinhood.android.common.recurring.schedule;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringScheduleBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderScheduleFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderScheduleFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringScheduleBinding> {
    public static final RecurringOrderScheduleFragment2 INSTANCE = new RecurringOrderScheduleFragment2();

    RecurringOrderScheduleFragment2() {
        super(1, FragmentRecurringScheduleBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringScheduleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringScheduleBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringScheduleBinding.bind(p0);
    }
}
