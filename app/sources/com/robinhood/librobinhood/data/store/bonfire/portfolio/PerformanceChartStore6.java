package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PerformanceChartDao;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "chart", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartEndpoint$2", m3645f = "PerformanceChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartStore6 extends ContinuationImpl7 implements Function3<PerformanceChartStore.PerformanceChartRequest, PerformanceChartModel, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PerformanceChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartStore6(PerformanceChartStore performanceChartStore, Continuation<? super PerformanceChartStore6> continuation) {
        super(3, continuation);
        this.this$0 = performanceChartStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PerformanceChartStore.PerformanceChartRequest performanceChartRequest, PerformanceChartModel performanceChartModel, Continuation<? super Unit> continuation) {
        PerformanceChartStore6 performanceChartStore6 = new PerformanceChartStore6(this.this$0, continuation);
        performanceChartStore6.L$0 = performanceChartRequest;
        performanceChartStore6.L$1 = performanceChartModel;
        return performanceChartStore6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PerformanceChartStore.PerformanceChartRequest performanceChartRequest = (PerformanceChartStore.PerformanceChartRequest) this.L$0;
            PerformanceChartModel performanceChartModel = (PerformanceChartModel) this.L$1;
            PerformanceChartDao performanceChartDao = this.this$0.chartDao;
            String displaySpan = performanceChartModel.getDisplaySpan();
            if (displaySpan == null) {
                displaySpan = performanceChartRequest.getDisplaySpanOrDefault();
            }
            performanceChartDao.insert(PerformanceChartModel.copy$default(performanceChartModel, null, null, displaySpan, performanceChartModel.getChartStyle(), null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194291, null));
            if (!Intrinsics.areEqual(performanceChartModel.getRequestDisplaySpanOrDefault(), performanceChartModel.getDisplaySpan()) || !Intrinsics.areEqual(performanceChartModel.getRequestChartStyleOrDefault(), performanceChartModel.getChartStyle())) {
                this.this$0.chartDao.insert(performanceChartModel);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
