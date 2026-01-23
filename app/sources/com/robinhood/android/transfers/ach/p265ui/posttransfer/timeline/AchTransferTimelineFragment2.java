package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentAchTransferTimelineBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferTimelineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AchTransferTimelineFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAchTransferTimelineBinding> {
    public static final AchTransferTimelineFragment2 INSTANCE = new AchTransferTimelineFragment2();

    AchTransferTimelineFragment2() {
        super(1, FragmentAchTransferTimelineBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferTimelineBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAchTransferTimelineBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAchTransferTimelineBinding.bind(p0);
    }
}
