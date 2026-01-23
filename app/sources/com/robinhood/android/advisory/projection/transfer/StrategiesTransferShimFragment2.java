package com.robinhood.android.advisory.projection.transfer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategiesTransferShimFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class StrategiesTransferShimFragment2 extends FunctionReferenceImpl implements Function1<StrategiesTransferShimEvent, Unit> {
    StrategiesTransferShimFragment2(Object obj) {
        super(1, obj, StrategiesTransferShimFragment.class, "handleShimEvent", "handleShimEvent(Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StrategiesTransferShimEvent strategiesTransferShimEvent) {
        invoke2(strategiesTransferShimEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StrategiesTransferShimEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((StrategiesTransferShimFragment) this.receiver).handleShimEvent(p0);
    }
}
