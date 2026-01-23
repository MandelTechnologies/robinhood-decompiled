package com.robinhood.android.equities.taxlots;

import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectLotsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class SelectLotsComposableKt$SelectLotsComposable$4$1 extends FunctionReferenceImpl implements Function2<SelectionStrategy, BigDecimal, Unit> {
    SelectLotsComposableKt$SelectLotsComposable$4$1(Object obj) {
        super(2, obj, SelectLotsDuxo.class, "setSelectionStrategy", "setSelectionStrategy(Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SelectionStrategy selectionStrategy, BigDecimal bigDecimal) {
        invoke2(selectionStrategy, bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SelectionStrategy p0, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SelectLotsDuxo) this.receiver).setSelectionStrategy(p0, bigDecimal);
    }
}
