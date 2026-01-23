package com.robinhood.android.futures.trade.p147ui.ladder;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Ladder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class LadderKt$LadderUi$4$8$1$1 extends FunctionReferenceImpl implements Function1<BigDecimal, Unit> {
    LadderKt$LadderUi$4$8$1$1(Object obj) {
        super(1, obj, LadderCallbacks.class, "onQuantityUpdated", "onQuantityUpdated(Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BigDecimal bigDecimal) {
        invoke2(bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BigDecimal p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LadderCallbacks) this.receiver).onQuantityUpdated(p0);
    }
}
