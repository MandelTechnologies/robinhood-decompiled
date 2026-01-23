package com.robinhood.android.crypto.p094ui.historicalchart;

import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHistoricalChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onScrub$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onScrub$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHistoricalChartDuxo4 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
    final /* synthetic */ Point $scrubPoint;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHistoricalChartDuxo4(Point point, Continuation<? super CryptoHistoricalChartDuxo4> continuation) {
        super(2, continuation);
        this.$scrubPoint = point;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHistoricalChartDuxo4 cryptoHistoricalChartDuxo4 = new CryptoHistoricalChartDuxo4(this.$scrubPoint, continuation);
        cryptoHistoricalChartDuxo4.L$0 = obj;
        return cryptoHistoricalChartDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
        return ((CryptoHistoricalChartDuxo4) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, null, null, this.$scrubPoint, null, null, null, false, 123, null);
    }
}
