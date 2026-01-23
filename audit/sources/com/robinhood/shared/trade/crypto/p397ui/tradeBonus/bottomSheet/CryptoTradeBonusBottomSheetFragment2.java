package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.bottomSheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTradeBonusBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.bottomSheet.CryptoTradeBonusBottomSheetFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoTradeBonusBottomSheetFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoTradeBonusBottomSheetFragment2(Object obj) {
        super(0, obj, CryptoTradeBonusBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoTradeBonusBottomSheetFragment) this.receiver).dismiss();
    }
}
