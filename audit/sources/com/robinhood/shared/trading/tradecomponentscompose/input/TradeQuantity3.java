package com.robinhood.shared.trading.tradecomponentscompose.input;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradeQuantity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$5$1", m3645f = "TradeQuantity.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$5$1, reason: use source file name */
/* loaded from: classes12.dex */
final class TradeQuantity3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeQuantity $inputMode;
    final /* synthetic */ TradeQuantityTextFormatter $numberDisplayFormatter;
    final /* synthetic */ BigDecimal $quantity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TradeQuantity3(TradeQuantityTextFormatter tradeQuantityTextFormatter, BigDecimal bigDecimal, TradeQuantity tradeQuantity, Continuation<? super TradeQuantity3> continuation) {
        super(2, continuation);
        this.$numberDisplayFormatter = tradeQuantityTextFormatter;
        this.$quantity = bigDecimal;
        this.$inputMode = tradeQuantity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeQuantity3(this.$numberDisplayFormatter, this.$quantity, this.$inputMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeQuantity3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TradeQuantityTextFormatter tradeQuantityTextFormatter = this.$numberDisplayFormatter;
        String plainString = this.$quantity.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        tradeQuantityTextFormatter.setCurrentValue(plainString);
        this.$numberDisplayFormatter.setHasUserEditedValue(this.$inputMode == TradeQuantity.APPEND);
        return Unit.INSTANCE;
    }
}
