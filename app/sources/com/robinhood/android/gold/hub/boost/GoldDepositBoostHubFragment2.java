package com.robinhood.android.gold.hub.boost;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldDepositBoostHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldDepositBoostHubFragment2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    GoldDepositBoostHubFragment2(Object obj) {
        super(1, obj, GoldDepositBoostHubDuxo.class, "switchTab", "switchTab(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((GoldDepositBoostHubDuxo) this.receiver).switchTab(i);
    }
}
