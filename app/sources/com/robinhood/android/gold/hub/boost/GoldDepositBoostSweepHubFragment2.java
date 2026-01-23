package com.robinhood.android.gold.hub.boost;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldDepositBoostSweepHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldDepositBoostSweepHubFragment2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    GoldDepositBoostSweepHubFragment2(Object obj) {
        super(1, obj, GoldDepositBoostSweepHubDuxo.class, "switchTab", "switchTab(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((GoldDepositBoostSweepHubDuxo) this.receiver).switchTab(i);
    }
}
