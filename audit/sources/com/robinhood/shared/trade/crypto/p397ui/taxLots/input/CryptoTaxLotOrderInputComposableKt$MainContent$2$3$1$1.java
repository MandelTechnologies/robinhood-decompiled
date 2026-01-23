package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotOrderInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CryptoTaxLotOrderInputComposableKt$MainContent$2$3$1$1 extends FunctionReferenceImpl implements Function1<TaxLotStrategyTypeDto, Unit> {
    CryptoTaxLotOrderInputComposableKt$MainContent$2$3$1$1(Object obj) {
        super(1, obj, CryptoTaxLotOrderInputDuxo.class, "onStrategyTypeTapped", "onStrategyTypeTapped(Lnummus/v1/TaxLotStrategyTypeDto;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TaxLotStrategyTypeDto taxLotStrategyTypeDto) {
        invoke2(taxLotStrategyTypeDto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TaxLotStrategyTypeDto p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTaxLotOrderInputDuxo) this.receiver).onStrategyTypeTapped(p0);
    }
}
