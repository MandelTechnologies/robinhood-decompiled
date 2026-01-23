package com.robinhood.shared.crypto.staking.staking.history;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingHistoryDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailFragment$ComposeContent$1$1$2$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class CryptoStakingHistoryDetailFragment2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    CryptoStakingHistoryDetailFragment2(Object obj) {
        super(1, obj, CryptoStakingHistoryDetailFragment.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) throws Throwable {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoStakingHistoryDetailFragment) this.receiver).handleError(p0);
    }
}
