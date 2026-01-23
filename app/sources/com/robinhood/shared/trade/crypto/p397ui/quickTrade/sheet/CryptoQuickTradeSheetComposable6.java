package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$4$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoQuickTradeSheetComposable6 extends FunctionReferenceImpl implements Function1<CryptoOrderIntentKey.OrderType, Unit> {
    CryptoQuickTradeSheetComposable6(Object obj) {
        super(1, obj, CryptoQuickTradeSheetDuxo.class, "onOrderTypeSelected", "onOrderTypeSelected(Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderIntentKey.OrderType orderType) {
        invoke2(orderType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderIntentKey.OrderType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoQuickTradeSheetDuxo) this.receiver).onOrderTypeSelected(p0);
    }
}
