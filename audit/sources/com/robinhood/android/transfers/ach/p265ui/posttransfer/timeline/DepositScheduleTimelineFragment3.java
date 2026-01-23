package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentDepositScheduleTimelineBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositScheduleTimelineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DepositScheduleTimelineFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentDepositScheduleTimelineBinding> {
    public static final DepositScheduleTimelineFragment3 INSTANCE = new DepositScheduleTimelineFragment3();

    DepositScheduleTimelineFragment3() {
        super(1, FragmentDepositScheduleTimelineBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleTimelineBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDepositScheduleTimelineBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDepositScheduleTimelineBinding.bind(p0);
    }
}
