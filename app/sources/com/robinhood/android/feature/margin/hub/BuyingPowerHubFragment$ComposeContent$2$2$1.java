package com.robinhood.android.feature.margin.hub;

import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class BuyingPowerHubFragment$ComposeContent$2$2$1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    BuyingPowerHubFragment$ComposeContent$2$2$1(Object obj) {
        super(1, obj, ActivityErrorHandler.class, "accept", "accept(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) throws Throwable {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ActivityErrorHandler) this.receiver).accept(p0);
    }
}
