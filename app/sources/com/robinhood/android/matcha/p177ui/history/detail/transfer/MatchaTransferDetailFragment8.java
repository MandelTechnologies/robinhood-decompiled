package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.android.social.contracts.CreateReportFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$8, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaTransferDetailFragment8 extends FunctionReferenceImpl implements Function1<CreateReportFragmentKey, Unit> {
    MatchaTransferDetailFragment8(Object obj) {
        super(1, obj, MatchaTransferDetailFragment.class, "launchReporting", "launchReporting(Lcom/robinhood/android/social/contracts/CreateReportFragmentKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CreateReportFragmentKey createReportFragmentKey) {
        invoke2(createReportFragmentKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CreateReportFragmentKey p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MatchaTransferDetailFragment) this.receiver).launchReporting(p0);
    }
}
