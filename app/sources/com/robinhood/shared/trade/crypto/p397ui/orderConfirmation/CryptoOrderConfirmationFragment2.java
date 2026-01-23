package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderConfirmationFragment2 extends FunctionReferenceImpl implements Function1<CryptoOrderConfirmationRowState.TapAction, Unit> {
    CryptoOrderConfirmationFragment2(Object obj) {
        super(1, obj, CryptoOrderConfirmationDuxo.class, "onOrderConfirmationRowClicked", "onOrderConfirmationRowClicked(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderConfirmationRowState.TapAction tapAction) {
        invoke2(tapAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderConfirmationRowState.TapAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoOrderConfirmationDuxo) this.receiver).onOrderConfirmationRowClicked(p0);
    }
}
