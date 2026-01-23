package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$6$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoQuickTradeSheetComposable8 extends FunctionReferenceImpl implements Function2<ActionViewState, Integer, Unit> {
    CryptoQuickTradeSheetComposable8(Object obj) {
        super(2, obj, CryptoQuickTradeSheetDuxo.class, "onActionButtonPressed", "onActionButtonPressed(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ActionViewState actionViewState, Integer num) {
        invoke(actionViewState, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ActionViewState p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoQuickTradeSheetDuxo) this.receiver).onActionButtonPressed(p0, i);
    }
}
