package com.robinhood.android.crypto.p094ui.historicalchart.compat;

import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHistoricalChartCompatDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$3$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHistoricalChartCompatDuxo2 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState>, Object> {
    final /* synthetic */ UiCryptoHistorical $historical;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHistoricalChartCompatDuxo2(UiCryptoHistorical uiCryptoHistorical, Continuation<? super CryptoHistoricalChartCompatDuxo2> continuation) {
        super(2, continuation);
        this.$historical = uiCryptoHistorical;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHistoricalChartCompatDuxo2 cryptoHistoricalChartCompatDuxo2 = new CryptoHistoricalChartCompatDuxo2(this.$historical, continuation);
        cryptoHistoricalChartCompatDuxo2.L$0 = obj;
        return cryptoHistoricalChartCompatDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHistoricalChartCompatDataState cryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState> continuation) {
        return ((CryptoHistoricalChartCompatDuxo2) create(cryptoHistoricalChartCompatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoHistoricalChartCompatDataState.copy$default((CryptoHistoricalChartCompatDataState) this.L$0, null, null, this.$historical, null, 11, null);
    }
}
