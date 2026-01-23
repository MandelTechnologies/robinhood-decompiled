package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.p011ui.focus.FocusState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderFormRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class OrderFormRowsKt$PriceRow$1$7$1$1 implements Function1<FocusState, Unit> {
    final /* synthetic */ FuturesOrderFormDataState.FocusedText $focusedText;
    final /* synthetic */ Function1<FuturesOrderFormDataState.FocusedText, Unit> $onFocusChanged;

    /* JADX WARN: Multi-variable type inference failed */
    OrderFormRowsKt$PriceRow$1$7$1$1(FuturesOrderFormDataState.FocusedText focusedText, Function1<? super FuturesOrderFormDataState.FocusedText, Unit> function1) {
        this.$focusedText = focusedText;
        this.$onFocusChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState focus) {
        Intrinsics.checkNotNullParameter(focus, "focus");
        if (this.$focusedText == null || !focus.getHasFocus()) {
            return;
        }
        this.$onFocusChanged.invoke(this.$focusedText);
    }
}
