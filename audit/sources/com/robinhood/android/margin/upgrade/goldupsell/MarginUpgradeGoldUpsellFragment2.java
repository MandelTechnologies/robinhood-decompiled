package com.robinhood.android.margin.upgrade.goldupsell;

import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeGoldUpsellFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginUpgradeGoldUpsellFragment2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    MarginUpgradeGoldUpsellFragment2(Object obj) {
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
