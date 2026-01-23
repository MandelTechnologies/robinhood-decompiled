package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.runtime.SnapshotState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuantitySelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$2$5$1, reason: use source file name */
/* loaded from: classes10.dex */
final class QuantitySelector7 implements Function0<Unit> {
    final /* synthetic */ Function1<BigDecimal, Unit> $onQuantityUpdated;
    final /* synthetic */ SnapshotState<BigDecimal> $rememberedQuantity$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    QuantitySelector7(Function1<? super BigDecimal, Unit> function1, SnapshotState<BigDecimal> snapshotState) {
        this.$onQuantityUpdated = function1;
        this.$rememberedQuantity$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<BigDecimal, Unit> function1 = this.$onQuantityUpdated;
        BigDecimal bigDecimalQuantitySelector$lambda$1 = QuantitySelector2.QuantitySelector$lambda$1(this.$rememberedQuantity$delegate);
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalAdd = bigDecimalQuantitySelector$lambda$1.add(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        function1.invoke(bigDecimalAdd);
    }
}
