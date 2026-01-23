package com.robinhood.analytics.dao;

import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceMetricDao.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/analytics/models/PerformanceMetric;", "", "Lcom/robinhood/analytics/models/PerformanceSpan;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao$queryAll$2$1$1", m3645f = "PerformanceMetricDao.kt", m3646l = {503}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$queryAll$2$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class PerformanceMetricDao3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends PerformanceMetric, ? extends List<? extends PerformanceSpan>>>, Object> {
    final /* synthetic */ PerformanceMetric $metric;
    Object L$0;
    int label;
    final /* synthetic */ PerformanceMetricDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceMetricDao3(PerformanceMetric performanceMetric, PerformanceMetricDao performanceMetricDao, Continuation<? super PerformanceMetricDao3> continuation) {
        super(2, continuation);
        this.$metric = performanceMetric;
        this.this$0 = performanceMetricDao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerformanceMetricDao3(this.$metric, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends PerformanceMetric, ? extends List<? extends PerformanceSpan>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>> continuation) {
        return ((PerformanceMetricDao3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PerformanceMetric performanceMetric;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PerformanceMetric performanceMetric2 = this.$metric;
            PerformanceMetricDao performanceMetricDao = this.this$0;
            UUID id = performanceMetric2.getId();
            this.L$0 = performanceMetric2;
            this.label = 1;
            Object objFindSpans$lib_analytics_externalRelease = performanceMetricDao.findSpans$lib_analytics_externalRelease(id, null, this);
            if (objFindSpans$lib_analytics_externalRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
            performanceMetric = performanceMetric2;
            obj = objFindSpans$lib_analytics_externalRelease;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            performanceMetric = (PerformanceMetric) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Tuples4.m3642to(performanceMetric, obj);
    }
}
