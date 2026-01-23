package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorViewState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderTypeSelectorFragment3 extends FunctionReferenceImpl implements Function1<CryptoOrderTypeSelectorViewState2.TapAction, Unit> {
    CryptoOrderTypeSelectorFragment3(Object obj) {
        super(1, obj, CryptoOrderTypeSelectorDuxo.class, "onRowTapped", "onRowTapped(Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderTypeSelectorViewState2.TapAction tapAction) {
        invoke2(tapAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderTypeSelectorViewState2.TapAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoOrderTypeSelectorDuxo) this.receiver).onRowTapped(p0);
    }
}
