package com.robinhood.librobinhood.data.store;

import com.robinhood.g11n.iso.RegionCode;
import com.robinhood.models.api.ApiCryptoHistoricalChart;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHistoricalChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoHistoricalChart;", "it", "Lcom/robinhood/librobinhood/data/store/CryptoSduiChartParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore$endpoint$1", m3645f = "CryptoHistoricalChartStore.kt", m3646l = {38, 45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoHistoricalChartStore2 extends ContinuationImpl7 implements Function2<CryptoSduiChartParams, Continuation<? super ApiCryptoHistoricalChart>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHistoricalChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHistoricalChartStore2(CryptoHistoricalChartStore cryptoHistoricalChartStore, Continuation<? super CryptoHistoricalChartStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHistoricalChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHistoricalChartStore2 cryptoHistoricalChartStore2 = new CryptoHistoricalChartStore2(this.this$0, continuation);
        cryptoHistoricalChartStore2.L$0 = obj;
        return cryptoHistoricalChartStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoSduiChartParams cryptoSduiChartParams, Continuation<? super ApiCryptoHistoricalChart> continuation) {
        return ((CryptoHistoricalChartStore2) create(cryptoSduiChartParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (ApiCryptoHistoricalChart) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (ApiCryptoHistoricalChart) obj;
        }
        ResultKt.throwOnFailure(obj);
        CryptoSduiChartParams cryptoSduiChartParams = (CryptoSduiChartParams) this.L$0;
        if (this.this$0.authManager.isLoggedIn()) {
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            UUID currencyPairId = cryptoSduiChartParams.getCurrencyPairId();
            DisplaySpan displaySpan = cryptoSduiChartParams.getDisplaySpan();
            Color sparklineColor = cryptoSduiChartParams.getSparklineColor();
            boolean showCandlesticks = cryptoSduiChartParams.getShowCandlesticks();
            this.label = 1;
            obj = cryptoBonfireApi.getCryptoSduiChart(currencyPairId, displaySpan, sparklineColor, showCandlesticks, this);
        } else {
            CryptoBonfireApi cryptoBonfireApi2 = this.this$0.cryptoBonfireApi;
            RegionCode regionCode = this.this$0.appType.toRegionCode();
            UUID currencyPairId2 = cryptoSduiChartParams.getCurrencyPairId();
            DisplaySpan displaySpan2 = cryptoSduiChartParams.getDisplaySpan();
            Color sparklineColor2 = cryptoSduiChartParams.getSparklineColor();
            this.label = 2;
            obj = cryptoBonfireApi2.getCryptoSduiChartAnonymous(regionCode, currencyPairId2, displaySpan2, sparklineColor2, this);
        }
        return coroutine_suspended;
    }
}
