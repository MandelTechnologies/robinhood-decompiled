package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoQuickTradeSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$3$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoQuickTradeSheetComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoQuickTradeSheetComposable5(Object obj) {
        super(0, obj, CryptoQuickTradeSheetDuxo.class, "onCurrencySwitcherClicked", "onCurrencySwitcherClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoQuickTradeSheetDuxo) this.receiver).onCurrencySwitcherClicked();
    }
}
