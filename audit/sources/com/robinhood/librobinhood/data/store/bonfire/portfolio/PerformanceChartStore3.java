package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.AccountMarketValuesLive2;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValuesLive;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/portfolio/api/ApiAccountMarketValuesLive;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$accountMarketValuesLiveEndpoint$2", m3645f = "PerformanceChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$accountMarketValuesLiveEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartStore3 extends ContinuationImpl7 implements Function2<ApiAccountMarketValuesLive, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerformanceChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartStore3(PerformanceChartStore performanceChartStore, Continuation<? super PerformanceChartStore3> continuation) {
        super(2, continuation);
        this.this$0 = performanceChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartStore3 performanceChartStore3 = new PerformanceChartStore3(this.this$0, continuation);
        performanceChartStore3.L$0 = obj;
        return performanceChartStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAccountMarketValuesLive apiAccountMarketValuesLive, Continuation<? super Unit> continuation) {
        return ((PerformanceChartStore3) create(apiAccountMarketValuesLive, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.accountMarketValuesLiveDao.insert(AccountMarketValuesLive2.toDbModel((ApiAccountMarketValuesLive) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
