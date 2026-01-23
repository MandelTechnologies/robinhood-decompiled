package com.robinhood.android.equitytradeladder;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$17$1 extends FunctionReferenceImpl implements Function1<BigDecimal, Unit> {
    EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$17$1(Object obj) {
        super(1, obj, EquityTradeLadderDuxo.class, "onQuantityUpdated", "onQuantityUpdated(Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BigDecimal bigDecimal) {
        invoke2(bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BigDecimal p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EquityTradeLadderDuxo) this.receiver).onQuantityUpdated(p0);
    }
}
