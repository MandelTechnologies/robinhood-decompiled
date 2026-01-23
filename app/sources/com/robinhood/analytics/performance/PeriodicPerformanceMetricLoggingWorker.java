package com.robinhood.analytics.performance;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.dao.PerformanceMetricDao;
import com.robinhood.analytics.dao.PerformanceMetricDatabase;
import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import com.robinhood.work.PeriodicWorker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: PeriodicPerformanceMetricLoggingWorker.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/analytics/performance/PeriodicPerformanceMetricLoggingWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "database", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "getDatabase", "()Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "setDatabase", "(Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "dao", "Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "getDao", "()Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PeriodicPerformanceMetricLoggingWorker extends Hammer_PeriodicPerformanceMetricLoggingWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public PerformanceMetricDatabase database;
    public EventLogger eventLogger;

    /* compiled from: PeriodicPerformanceMetricLoggingWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.PeriodicPerformanceMetricLoggingWorker", m3645f = "PeriodicPerformanceMetricLoggingWorker.kt", m3646l = {31}, m3647m = "doWork")
    /* renamed from: com.robinhood.analytics.performance.PeriodicPerformanceMetricLoggingWorker$doWork$1 */
    static final class C73461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C73461(Continuation<? super C73461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicPerformanceMetricLoggingWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicPerformanceMetricLoggingWorker(Context context, WorkerParameters parameters) {
        super(context, parameters, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public final PerformanceMetricDatabase getDatabase() {
        PerformanceMetricDatabase performanceMetricDatabase = this.database;
        if (performanceMetricDatabase != null) {
            return performanceMetricDatabase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("database");
        return null;
    }

    public final void setDatabase(PerformanceMetricDatabase performanceMetricDatabase) {
        Intrinsics.checkNotNullParameter(performanceMetricDatabase, "<set-?>");
        this.database = performanceMetricDatabase;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PerformanceMetricDao getDao() {
        return getDatabase().performanceMetricDao();
    }

    /* compiled from: PeriodicPerformanceMetricLoggingWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.PeriodicPerformanceMetricLoggingWorker$doWork$2", m3645f = "PeriodicPerformanceMetricLoggingWorker.kt", m3646l = {32, 37, 43, 43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.PeriodicPerformanceMetricLoggingWorker$doWork$2 */
    static final class C73472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C73472(Continuation<? super C73472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PeriodicPerformanceMetricLoggingWorker.this.new C73472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((C73472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            if (r12 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
        
            if (r12.deleteMetrics$lib_analytics_externalRelease(r7, r11) == r0) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0037, B:28:0x0094, B:29:0x009a, B:31:0x00a0, B:32:0x00b8, B:23:0x0065, B:25:0x006b, B:22:0x0060), top: B:44:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: all -> 0x003b, LOOP:0: B:29:0x009a->B:31:0x00a0, LOOP_END, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0037, B:28:0x0094, B:29:0x009a, B:31:0x00a0, B:32:0x00b8, B:23:0x0065, B:25:0x006b, B:22:0x0060), top: B:44:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0091 -> B:28:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            LinkedHashSet linkedHashSet;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                PerformanceMetricDao dao = PeriodicPerformanceMetricLoggingWorker.this.getDao();
                this.L$0 = th;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (dao.deleteMetrics$lib_analytics_externalRelease(linkedHashSet, this) != coroutine_suspended) {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao dao2 = PeriodicPerformanceMetricLoggingWorker.this.getDao();
                this.label = 1;
                obj = dao2.findTerminatedMetrics$lib_analytics_externalRelease(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return ListenableWorker.Result.success();
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th2;
                    }
                    PerformanceMetric performanceMetric = (PerformanceMetric) this.L$2;
                    it = (Iterator) this.L$1;
                    linkedHashSet = (LinkedHashSet) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Iterator it2 = ((List) obj).iterator();
                    while (it2.hasNext()) {
                        PeriodicPerformanceMetricLoggingWorker.this.getEventLogger().logPerformanceSpan(performanceMetric.getKey().getSessionId(), (PerformanceSpan) it2.next());
                    }
                    linkedHashSet.add(performanceMetric.getId());
                    if (it.hasNext()) {
                        performanceMetric = (PerformanceMetric) it.next();
                        PeriodicPerformanceMetricLoggingWorker.this.getEventLogger().logPerformanceMetric(performanceMetric);
                        PerformanceMetricDao dao3 = PeriodicPerformanceMetricLoggingWorker.this.getDao();
                        UUID id = performanceMetric.getId();
                        this.L$0 = linkedHashSet;
                        this.L$1 = it;
                        this.L$2 = performanceMetric;
                        this.label = 2;
                        obj = dao3.findSpans$lib_analytics_externalRelease(id, null, this);
                        if (obj == coroutine_suspended) {
                        }
                        Iterator it22 = ((List) obj).iterator();
                        while (it22.hasNext()) {
                        }
                        linkedHashSet.add(performanceMetric.getId());
                        if (it.hasNext()) {
                            PerformanceMetricDao dao4 = PeriodicPerformanceMetricLoggingWorker.this.getDao();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                        }
                    }
                    return coroutine_suspended;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            linkedHashSet = new LinkedHashSet(list.size());
            it = list.iterator();
            if (it.hasNext()) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C73461 c73461;
        if (continuation instanceof C73461) {
            c73461 = (C73461) continuation;
            int i = c73461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73461.label = i - Integer.MIN_VALUE;
            } else {
                c73461 = new C73461(continuation);
            }
        }
        Object objCoroutineScope = c73461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            C73472 c73472 = new C73472(null);
            c73461.label = 1;
            objCoroutineScope = CoroutineScope2.coroutineScope(c73472, c73461);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoroutineScope);
        }
        Intrinsics.checkNotNullExpressionValue(objCoroutineScope, "coroutineScope(...)");
        return objCoroutineScope;
    }

    /* compiled from: PeriodicPerformanceMetricLoggingWorker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/analytics/performance/PeriodicPerformanceMetricLoggingWorker$Companion;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends PeriodicWorker {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super("rh_periodic_performance_metric_logger", PeriodicPerformanceMetricLoggingWorker.class, 12L, TimeUnit.HOURS, null, null, null, 112, null);
        }
    }
}
