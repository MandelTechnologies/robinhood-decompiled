package com.robinhood.store.futures;

import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetFuturesIntervalPerformanceRequestDto;
import com.robinhood.ceres.p284v1.GetFuturesIntervalPerformanceResponseDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.store.futures.FuturesPerformanceStore;
import com.robinhood.utils.extensions.Uuids;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesPerformanceStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "params", "Lcom/robinhood/store/futures/FuturesPerformanceStore$FuturesIntervalPerformanceParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesPerformanceStore$getFuturesIntervalPerformanceEndpoint$1", m3645f = "FuturesPerformanceStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.FuturesPerformanceStore$getFuturesIntervalPerformanceEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesPerformanceStore2 extends ContinuationImpl7 implements Function2<FuturesPerformanceStore.FuturesIntervalPerformanceParams, Continuation<? super Response<? extends GetFuturesIntervalPerformanceResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesPerformanceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesPerformanceStore2(FuturesPerformanceStore futuresPerformanceStore, Continuation<? super FuturesPerformanceStore2> continuation) {
        super(2, continuation);
        this.this$0 = futuresPerformanceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesPerformanceStore2 futuresPerformanceStore2 = new FuturesPerformanceStore2(this.this$0, continuation);
        futuresPerformanceStore2.L$0 = obj;
        return futuresPerformanceStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FuturesPerformanceStore.FuturesIntervalPerformanceParams futuresIntervalPerformanceParams, Continuation<? super Response<GetFuturesIntervalPerformanceResponseDto>> continuation) {
        return ((FuturesPerformanceStore2) create(futuresIntervalPerformanceParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FuturesPerformanceStore.FuturesIntervalPerformanceParams futuresIntervalPerformanceParams, Continuation<? super Response<? extends GetFuturesIntervalPerformanceResponseDto>> continuation) {
        return invoke2(futuresIntervalPerformanceParams, (Continuation<? super Response<GetFuturesIntervalPerformanceResponseDto>>) continuation);
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
        FuturesPerformanceStore.FuturesIntervalPerformanceParams futuresIntervalPerformanceParams = (FuturesPerformanceStore.FuturesIntervalPerformanceParams) this.L$0;
        Ceres ceres = this.this$0.ceres;
        Request<GetFuturesIntervalPerformanceRequestDto> request = new Request<>(new GetFuturesIntervalPerformanceRequestDto(Uuids.safeToString(futuresIntervalPerformanceParams.getAccountId()), futuresIntervalPerformanceParams.getSpan()), null, 2, null);
        this.label = 1;
        Object objGetFuturesIntervalPerformance = ceres.GetFuturesIntervalPerformance(request, this);
        return objGetFuturesIntervalPerformance == coroutine_suspended ? coroutine_suspended : objGetFuturesIntervalPerformance;
    }
}
