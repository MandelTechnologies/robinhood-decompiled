package com.robinhood.android.cash.rhy.tab.p077v2;

import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewFragmentV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class RhyOverviewFragmentV2$ComposeContent$1$1$2$1$3$1 extends FunctionReferenceImpl implements Function1<MAXTransferContext.EntryPoint, Unit> {
    RhyOverviewFragmentV2$ComposeContent$1$1$2$1$3$1(Object obj) {
        super(1, obj, RhyOverviewFragmentV2.class, "showTransferMoney", "showTransferMoney(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MAXTransferContext.EntryPoint entryPoint) {
        invoke2(entryPoint);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MAXTransferContext.EntryPoint p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RhyOverviewFragmentV2) this.receiver).showTransferMoney(p0);
    }
}
