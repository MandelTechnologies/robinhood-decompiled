package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2Dao;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: PerformanceChartSettingsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore$SettingsUpdateParams;", "response", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$postSettingsEndpoint$2", m3645f = "PerformanceChartSettingsV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$postSettingsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartSettingsV2Store6 extends ContinuationImpl7 implements Function3<PerformanceChartSettingsV2Store2.SettingsUpdateParams, PerformanceChartSettingsV2, Continuation<? super Unit>, Object> {
    final /* synthetic */ PerformanceChartSettingsV2Dao $chartSettingsDao;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartSettingsV2Store6(PerformanceChartSettingsV2Dao performanceChartSettingsV2Dao, Continuation<? super PerformanceChartSettingsV2Store6> continuation) {
        super(3, continuation);
        this.$chartSettingsDao = performanceChartSettingsV2Dao;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PerformanceChartSettingsV2Store2.SettingsUpdateParams settingsUpdateParams, PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super Unit> continuation) {
        PerformanceChartSettingsV2Store6 performanceChartSettingsV2Store6 = new PerformanceChartSettingsV2Store6(this.$chartSettingsDao, continuation);
        performanceChartSettingsV2Store6.L$0 = performanceChartSettingsV2;
        return performanceChartSettingsV2Store6.invokeSuspend(Unit.INSTANCE);
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
