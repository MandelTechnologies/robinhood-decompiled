package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgradedComposable$1$1$1 */
/* loaded from: classes12.dex */
/* synthetic */ class C40409xeb3f0784 extends FunctionReferenceImpl implements Function0<Unit> {
    C40409xeb3f0784(Object obj) {
        super(0, obj, CryptoFeeTierUpgradedDuxo.class, "onTryAgainClick", "onTryAgainClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoFeeTierUpgradedDuxo) this.receiver).onTryAgainClick();
    }
}
