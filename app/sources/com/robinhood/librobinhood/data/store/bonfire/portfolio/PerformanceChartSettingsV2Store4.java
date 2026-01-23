package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2Dao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartSettingsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$chartSettingsEndpoint$2", m3645f = "PerformanceChartSettingsV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$chartSettingsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartSettingsV2Store4 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsV2, Continuation<? super Unit>, Object> {
    final /* synthetic */ PerformanceChartSettingsV2Dao $chartSettingsDao;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartSettingsV2Store4(PerformanceChartSettingsV2Dao performanceChartSettingsV2Dao, Continuation<? super PerformanceChartSettingsV2Store4> continuation) {
        super(2, continuation);
        this.$chartSettingsDao = performanceChartSettingsV2Dao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartSettingsV2Store4 performanceChartSettingsV2Store4 = new PerformanceChartSettingsV2Store4(this.$chartSettingsDao, continuation);
        performanceChartSettingsV2Store4.L$0 = obj;
        return performanceChartSettingsV2Store4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super Unit> continuation) {
        return ((PerformanceChartSettingsV2Store4) create(performanceChartSettingsV2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$chartSettingsDao.insert((PerformanceChartSettingsV2) this.L$0);
        return Unit.INSTANCE;
    }
}
