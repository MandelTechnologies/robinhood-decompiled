package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.FuturesIntervalPerformance;
import com.robinhood.android.models.futures.p189db.FuturesIntervalPerformance2;
import com.robinhood.android.models.futures.p189db.FuturesIntervalPerformanceDataPoint2;
import com.robinhood.ceres.p284v1.FuturesIntervalDataPointDto;
import com.robinhood.ceres.p284v1.GetFuturesIntervalPerformanceResponseDto;
import com.robinhood.idl.Response;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesPerformanceStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesPerformanceStore$getFuturesIntervalPerformanceEndpoint$2", m3645f = "FuturesPerformanceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.FuturesPerformanceStore$getFuturesIntervalPerformanceEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesPerformanceStore3 extends ContinuationImpl7 implements Function2<Response<? extends GetFuturesIntervalPerformanceResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesPerformanceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesPerformanceStore3(FuturesPerformanceStore futuresPerformanceStore, Continuation<? super FuturesPerformanceStore3> continuation) {
        super(2, continuation);
        this.this$0 = futuresPerformanceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesPerformanceStore3 futuresPerformanceStore3 = new FuturesPerformanceStore3(this.this$0, continuation);
        futuresPerformanceStore3.L$0 = obj;
        return futuresPerformanceStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Response<GetFuturesIntervalPerformanceResponseDto> response, Continuation<? super Unit> continuation) {
        return ((FuturesPerformanceStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Response<? extends GetFuturesIntervalPerformanceResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Response<GetFuturesIntervalPerformanceResponseDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Response response = (Response) this.L$0;
        FuturesIntervalPerformance dbModel = FuturesIntervalPerformance2.toDbModel((GetFuturesIntervalPerformanceResponseDto) response.getData());
        List<FuturesIntervalDataPointDto> futures_interval_data_points = ((GetFuturesIntervalPerformanceResponseDto) response.getData()).getFutures_interval_data_points();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futures_interval_data_points, 10));
        Iterator<T> it = futures_interval_data_points.iterator();
        while (it.hasNext()) {
            arrayList.add(FuturesIntervalPerformanceDataPoint2.toDbModel((FuturesIntervalDataPointDto) it.next(), dbModel.getId()));
        }
        this.this$0.futuresIntervalPerformanceDao.insertFuturesIntervalPerformance(dbModel, arrayList);
        return Unit.INSTANCE;
    }
}
