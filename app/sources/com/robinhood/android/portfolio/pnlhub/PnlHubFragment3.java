package com.robinhood.android.portfolio.pnlhub;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PnlHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$14$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PnlHubFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    PnlHubFragment3(Object obj) {
        super(0, obj, PnlHubDuxo.class, "onCryptoFilterTooltipAppear", "onCryptoFilterTooltipAppear()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PnlHubDuxo) this.receiver).onCryptoFilterTooltipAppear();
    }
}
