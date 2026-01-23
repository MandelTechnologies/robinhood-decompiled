package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: OrderFormRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class OrderFormRowsKt$PriceRow$1$9$1$1 implements Function0<Unit> {
    final /* synthetic */ Function1<FuturesOrderFormDataState.DisabledClickSource, Unit> $onDisabledClicked;

    /* JADX WARN: Multi-variable type inference failed */
    OrderFormRowsKt$PriceRow$1$9$1$1(Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> function1) {
        this.$onDisabledClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDisabledClicked.invoke(FuturesOrderFormDataState.DisabledClickSource.PRICE);
    }
}
