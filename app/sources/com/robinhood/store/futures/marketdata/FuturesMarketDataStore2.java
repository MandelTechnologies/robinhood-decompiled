package com.robinhood.store.futures.marketdata;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.api.futures.FuturesMarketdataApi;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesHistorical;
import com.robinhood.android.models.futures.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.models.futures.api.marketdata.MarketdataResponseStatus;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: FuturesMarketDataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesHistorical;", "param", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$HistoricalParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getContractHistorical$1", m3645f = "FuturesMarketDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 70}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getContractHistorical$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesMarketDataStore2 extends ContinuationImpl7 implements Function2<FuturesMarketDataStore.HistoricalParams, Continuation<? super List<? extends ApiFuturesHistorical>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesMarketDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesMarketDataStore2(FuturesMarketDataStore futuresMarketDataStore, Continuation<? super FuturesMarketDataStore2> continuation) {
        super(2, continuation);
        this.this$0 = futuresMarketDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesMarketDataStore2 futuresMarketDataStore2 = new FuturesMarketDataStore2(this.this$0, continuation);
        futuresMarketDataStore2.L$0 = obj;
        return futuresMarketDataStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FuturesMarketDataStore.HistoricalParams historicalParams, Continuation<? super List<ApiFuturesHistorical>> continuation) {
        return ((FuturesMarketDataStore2) create(historicalParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FuturesMarketDataStore.HistoricalParams historicalParams, Continuation<? super List<? extends ApiFuturesHistorical>> continuation) {
        return invoke2(historicalParams, (Continuation<? super List<ApiFuturesHistorical>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r13 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FuturesMarketDataStore2 futuresMarketDataStore2;
        FuturesMarketDataStore.HistoricalParams historicalParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesMarketDataStore.HistoricalParams historicalParams2 = (FuturesMarketDataStore.HistoricalParams) this.L$0;
            FuturesMarketDataStore futuresMarketDataStore = this.this$0;
            this.L$0 = historicalParams2;
            this.label = 1;
            futuresMarketDataStore2 = this;
            if (FuturesMarketDataStore.seedContractHistoricalIfApplicable$default(futuresMarketDataStore, historicalParams2, null, futuresMarketDataStore2, 2, null) != coroutine_suspended) {
                historicalParams = historicalParams2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) ((ApiMarketdataResponse) obj).getData();
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ApiMarketdataResponse) obj2).getStatus() == MarketdataResponseStatus.SUCCESS) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ApiFuturesHistorical apiFuturesHistorical = (ApiFuturesHistorical) ((ApiMarketdataResponse) it.next()).getData();
                if (apiFuturesHistorical != null) {
                    arrayList2.add(apiFuturesHistorical);
                }
            }
            return arrayList2;
        }
        historicalParams = (FuturesMarketDataStore.HistoricalParams) this.L$0;
        ResultKt.throwOnFailure(obj);
        futuresMarketDataStore2 = this;
        FuturesMarketdataApi futuresMarketdataApi = futuresMarketDataStore2.this$0.futuresMarketdataApi;
        String string2 = historicalParams.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Historical.Interval interval = historicalParams.getInterval();
        Instant start = historicalParams.getStart();
        Instant end = historicalParams.getEnd();
        futuresMarketDataStore2.L$0 = null;
        futuresMarketDataStore2.label = 2;
        obj = futuresMarketdataApi.getHistoricals(string2, interval, start, end, futuresMarketDataStore2);
    }
}
