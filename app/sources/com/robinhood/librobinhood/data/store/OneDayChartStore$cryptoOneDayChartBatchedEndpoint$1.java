package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.OneDayChartStore;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.onedaycharts.api.ApiInstrumentOneDayChart;
import com.robinhood.models.onedaycharts.api.InstrumentApi;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OneDayChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/onedaycharts/api/ApiInstrumentOneDayChart;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore$InstrumentOneDayChartRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1", m3645f = "OneDayChartStore.kt", m3646l = {83}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends OneDayChartStore.InstrumentOneDayChartRequest>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiInstrumentOneDayChart>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OneDayChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1(OneDayChartStore oneDayChartStore, Continuation<? super OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = oneDayChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1 oneDayChartStore$cryptoOneDayChartBatchedEndpoint$1 = new OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1(this.this$0, continuation);
        oneDayChartStore$cryptoOneDayChartBatchedEndpoint$1.L$0 = obj;
        return oneDayChartStore$cryptoOneDayChartBatchedEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends OneDayChartStore.InstrumentOneDayChartRequest>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiInstrumentOneDayChart>> continuation) {
        return invoke2((Tuples2<? extends Iterable<OneDayChartStore.InstrumentOneDayChartRequest>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiInstrumentOneDayChart>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<OneDayChartStore.InstrumentOneDayChartRequest>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiInstrumentOneDayChart>> continuation) {
        return ((OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Iterable iterable = (Iterable) ((Tuples2) this.L$0).component1();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((OneDayChartStore.InstrumentOneDayChartRequest) it.next()).getInstrumentId());
        }
        InstrumentApi instrumentApi = this.this$0.instrumentApi;
        InstrumentType instrumentType = InstrumentType.CRYPTO;
        CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(arrayList);
        this.label = 1;
        Object instrumentOneDayCharts = instrumentApi.getInstrumentOneDayCharts(instrumentType, commaSeparatedList, false, this);
        return instrumentOneDayCharts == coroutine_suspended ? coroutine_suspended : instrumentOneDayCharts;
    }
}
