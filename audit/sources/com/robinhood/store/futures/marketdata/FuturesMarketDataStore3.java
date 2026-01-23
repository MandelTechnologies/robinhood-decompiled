package com.robinhood.store.futures.marketdata;

import com.robinhood.android.models.futures.api.marketdata.ApiFuturesHistorical;
import com.robinhood.android.models.futures.marketdata.dao.FuturesHistoricalDao;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesHistorical;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesHistorical2;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesHistoricalDataPoint3;
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
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import p479j$.time.Instant;

/* compiled from: FuturesMarketDataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "historicals", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesHistorical;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getContractHistorical$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getContractHistorical$2, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesMarketDataStore3 extends ContinuationImpl7 implements Function2<List<? extends ApiFuturesHistorical>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesMarketDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesMarketDataStore3(FuturesMarketDataStore futuresMarketDataStore, Continuation<? super FuturesMarketDataStore3> continuation) {
        super(2, continuation);
        this.this$0 = futuresMarketDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesMarketDataStore3 futuresMarketDataStore3 = new FuturesMarketDataStore3(this.this$0, continuation);
        futuresMarketDataStore3.L$0 = obj;
        return futuresMarketDataStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiFuturesHistorical> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ApiFuturesHistorical>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ApiFuturesHistorical> list, Continuation<? super Unit> continuation) {
        return ((FuturesMarketDataStore3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<ApiFuturesHistorical> list = (List) this.L$0;
        FuturesMarketDataStore futuresMarketDataStore = this.this$0;
        for (ApiFuturesHistorical apiFuturesHistorical : list) {
            if (!futuresMarketDataStore.cleanedOldHistoricals) {
                FuturesHistoricalDao futuresHistoricalDao = futuresMarketDataStore.historicalDao;
                Instant instantNow = Instant.now();
                Duration.Companion companion = Duration.INSTANCE;
                Instant instantMinusMillis = instantNow.minusMillis(Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(7, DurationUnitJvm.DAYS)));
                Intrinsics.checkNotNullExpressionValue(instantMinusMillis, "minusMillis(...)");
                futuresHistoricalDao.deleteOldHistorical(instantMinusMillis);
                futuresMarketDataStore.cleanedOldHistoricals = true;
            }
            FuturesHistorical dbModel = FuturesHistorical2.toDbModel(apiFuturesHistorical);
            FuturesHistoricalDao futuresHistoricalDao2 = futuresMarketDataStore.historicalDao;
            List<ApiFuturesHistorical.ApiFuturesHistoricalDataPoint> data_points = apiFuturesHistorical.getData_points();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data_points, 10));
            Iterator<T> it = data_points.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesHistoricalDataPoint3.toDbModel((ApiFuturesHistorical.ApiFuturesHistoricalDataPoint) it.next(), dbModel.getId()));
            }
            futuresHistoricalDao2.insertHistorical(dbModel, arrayList);
        }
        return Unit.INSTANCE;
    }
}
