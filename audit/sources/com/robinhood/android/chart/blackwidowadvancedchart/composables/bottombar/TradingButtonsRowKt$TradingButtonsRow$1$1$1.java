package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingButtonsRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$TradingButtonsRow$1$1$1", m3645f = "TradingButtonsRow.kt", m3646l = {82, 84}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TradingButtonsRowKt$TradingButtonsRow$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $animateBuyButton$delegate;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function2<BwTradeSide, Continuation<? super Unit>, Object> $onConfirmed;
    final /* synthetic */ Function2<BwTradeSide, Continuation<? super Unit>, Object> $onTrade;
    final /* synthetic */ TradeRowState $tradeRowState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TradingButtonsRowKt$TradingButtonsRow$1$1$1(HapticFeedback hapticFeedback, TradeRowState tradeRowState, Function2<? super BwTradeSide, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super BwTradeSide, ? super Continuation<? super Unit>, ? extends Object> function22, SnapshotState<Boolean> snapshotState, Continuation<? super TradingButtonsRowKt$TradingButtonsRow$1$1$1> continuation) {
        super(2, continuation);
        this.$hapticFeedback = hapticFeedback;
        this.$tradeRowState = tradeRowState;
        this.$onConfirmed = function2;
        this.$onTrade = function22;
        this.$animateBuyButton$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingButtonsRowKt$TradingButtonsRow$1$1$1(this.$hapticFeedback, this.$tradeRowState, this.$onConfirmed, this.$onTrade, this.$animateBuyButton$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradingButtonsRowKt$TradingButtonsRow$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            TradingButtonsRowKt.TradingButtonsRow$lambda$2(this.$animateBuyButton$delegate, this.$tradeRowState.getBuyEnabled());
            if (this.$tradeRowState.getConfirmBuy()) {
                Function2<BwTradeSide, Continuation<? super Unit>, Object> function2 = this.$onConfirmed;
                BwTradeSide bwTradeSide = BwTradeSide.BUY;
                this.label = 1;
            } else {
                Function2<BwTradeSide, Continuation<? super Unit>, Object> function22 = this.$onTrade;
                BwTradeSide bwTradeSide2 = BwTradeSide.BUY;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TradingButtonsRowKt.TradingButtonsRow$lambda$2(this.$animateBuyButton$delegate, false);
        return Unit.INSTANCE;
    }
}
