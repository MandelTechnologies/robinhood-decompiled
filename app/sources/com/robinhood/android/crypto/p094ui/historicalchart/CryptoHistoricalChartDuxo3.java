package com.robinhood.android.crypto.p094ui.historicalchart;

import com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartComposable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHistoricalChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2$2$1$2$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2$2$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHistoricalChartDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HistoricalChartComposable $chartMode;
    final /* synthetic */ UUID $currencyPairId;
    final /* synthetic */ DisplaySpan $displaySpan;
    int label;
    final /* synthetic */ CryptoHistoricalChartDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHistoricalChartDuxo3(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, UUID uuid, DisplaySpan displaySpan, HistoricalChartComposable historicalChartComposable, Continuation<? super CryptoHistoricalChartDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHistoricalChartDuxo;
        this.$currencyPairId = uuid;
        this.$displaySpan = displaySpan;
        this.$chartMode = historicalChartComposable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHistoricalChartDuxo3(this.this$0, this.$currencyPairId, this.$displaySpan, this.$chartMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoHistoricalChartDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoHistoricalChartStore.refresh$default(this.this$0.cryptoHistoricalChartStore, this.$currencyPairId, this.$displaySpan, false, null, this.this$0.getShowCandleSticks(this.$chartMode), 4, null);
        return Unit.INSTANCE;
    }
}
