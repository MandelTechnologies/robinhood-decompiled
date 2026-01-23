package com.robinhood.analytics.dao;

import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceMetricDao.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u00020\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Lcom/robinhood/analytics/models/PerformanceMetric;", "Lcom/robinhood/analytics/models/PerformanceSpan;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao$queryAll$2", m3645f = "PerformanceMetricDao.kt", m3646l = {500, 506}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$queryAll$2, reason: use source file name */
/* loaded from: classes24.dex */
final class PerformanceMetricDao2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Tuples2<? extends PerformanceMetric, ? extends List<? extends PerformanceSpan>>>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerformanceMetricDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceMetricDao2(PerformanceMetricDao performanceMetricDao, Continuation<? super PerformanceMetricDao2> continuation) {
        super(2, continuation);
        this.this$0 = performanceMetricDao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceMetricDao2 performanceMetricDao2 = new PerformanceMetricDao2(this.this$0, continuation);
        performanceMetricDao2.L$0 = obj;
        return performanceMetricDao2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Tuples2<? extends PerformanceMetric, ? extends List<? extends PerformanceSpan>>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<? extends Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<? extends Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>>> continuation) {
        return ((PerformanceMetricDao2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            PerformanceMetricDao performanceMetricDao = this.this$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = performanceMetricDao.getAllMetrics(this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope2 = coroutineScope;
        Iterable iterable = (Iterable) obj;
        PerformanceMetricDao performanceMetricDao2 = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new PerformanceMetricDao3((PerformanceMetric) it.next(), performanceMetricDao2, null), 3, null));
        }
        this.L$0 = null;
        this.label = 2;
        Object objAwaitAll = Await2.awaitAll(arrayList, this);
        return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
    }
}
