package com.robinhood.analytics.dao;

import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope2;
import p479j$.time.Instant;

/* compiled from: PerformanceMetricDao.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\bH\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\bH\u0097@¢\u0006\u0004\b!\u0010\"J2\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\bH\u0097@¢\u0006\u0004\b'\u0010(J0\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\bH\u0097@¢\u0006\u0004\b*\u0010(J2\u0010'\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020)H\u0095@¢\u0006\u0004\b'\u0010-J\u0018\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000fH§@¢\u0006\u0004\b/\u00100J\u0018\u0010/\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0012H§@¢\u0006\u0004\b/\u00102J \u00103\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\bH\u0097@¢\u0006\u0004\b3\u00104J \u00105\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\bH\u0097@¢\u0006\u0004\b5\u00104J&\u0010:\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00152\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H¥@¢\u0006\u0004\b:\u0010;J(\u0010<\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0097@¢\u0006\u0004\b<\u0010=J2\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0095@¢\u0006\u0004\b?\u0010@J0\u0010A\u001a\u00020)2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\bA\u0010BJ0\u0010E\u001a\u00020)2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0097@¢\u0006\u0004\bE\u0010FJ(\u0010G\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH¥@¢\u0006\u0004\bG\u0010HJ@\u0010K\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00062\u0006\u0010J\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH¥@¢\u0006\u0004\bK\u0010LJ \u0010N\u001a\b\u0012\u0004\u0012\u00020\u0015072\b\u0010M\u001a\u0004\u0018\u00010\u0015H¥@¢\u0006\u0004\bN\u0010OJ\"\u0010P\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\bH¥@¢\u0006\u0004\bP\u0010\u001aJ$\u0010S\u001a\b\u0012\u0004\u0012\u00020\u0004072\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150QH¥@¢\u0006\u0004\bS\u0010TJ&\u0010U\u001a\u00020\n2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150Q2\u0006\u0010\u0017\u001a\u00020\bH¥@¢\u0006\u0004\bU\u0010VJ\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000f07H¡@¢\u0006\u0004\bW\u0010XJ6\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010[\u001a\u00020Z2\b\u0010\\\u001a\u0004\u0018\u00010\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0010\u0010]J,\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010>\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¥@¢\u0006\u0004\b\u0013\u0010^J(\u0010a\u001a\b\u0012\u0004\u0012\u00020\u0012072\u0006\u0010>\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¡@¢\u0006\u0004\b_\u0010`J0\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000f072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010[\u001a\u00020Z2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH¥@¢\u0006\u0004\bb\u0010cJ\u001e\u0010f\u001a\u00020\n2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00150QH¡@¢\u0006\u0004\be\u0010TJ\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000f07H¥@¢\u0006\u0004\bg\u0010XJ(\u0010j\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0012070h07H\u0091@¢\u0006\u0004\bi\u0010X¨\u0006k"}, m3636d2 = {"Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "", "<init>", "()V", "Lcom/robinhood/analytics/models/PerformanceSpan$Key;", "key", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "status", "j$/time/Instant", "endTimestamp", "", "updateSpan", "(Lcom/robinhood/analytics/models/PerformanceSpan$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/analytics/models/PerformanceMetric$Key;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "Lcom/robinhood/analytics/models/PerformanceMetric;", "findMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/analytics/models/PerformanceSpan;", "findSpan", "(Lcom/robinhood/analytics/models/PerformanceSpan$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "sessionId", "timestamp", "", "onSessionUpdate", "(Ljava/util/UUID;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "context", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "networkConnection", "beginMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metricKey", "", "spanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "beginSpan", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "skipSpan", "spanKey", "suppressWarnings", "(Lcom/robinhood/analytics/models/PerformanceSpan$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;Lj$/time/Instant;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metric", "insert", "(Lcom/robinhood/analytics/models/PerformanceMetric;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "span", "(Lcom/robinhood/analytics/models/PerformanceSpan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pauseMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeMetric", "id", "", "Lcom/robinhood/analytics/models/PerformanceMetric$Pause;", "pauses", "updateMetricPause", "(Ljava/util/UUID;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminateMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metricId", "terminateSpans", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminateSpan", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "event", "terminateMetricByEvent", "(Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;Ljava/util/UUID;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMetric", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentStatus", "newStatus", "updateSpans", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentSessionId", "findIncompleteMetricIds", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "abortIncompleteMetrics", "", "metricIds", "findIncompleteSpanKeys", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "abortIncompleteSpans", "(Ljava/util/Set;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findTerminatedMetrics$lib_analytics_externalRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findTerminatedMetrics", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "metricName", "contextualId", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSpans$lib_analytics_externalRelease", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSpans", "findMetrics", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "deleteMetrics$lib_analytics_externalRelease", "deleteMetrics", "getAllMetrics", "Lkotlin/Pair;", "queryAll$lib_analytics_externalRelease", "queryAll", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public abstract class PerformanceMetricDao {

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {57, 76}, m3647m = "beginMetric$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$beginMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C73201(Continuation<? super C73201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.beginMetric$suspendImpl(PerformanceMetricDao.this, null, null, null, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {94, 96}, m3647m = "beginSpan$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$beginSpan$1 */
    /* loaded from: classes24.dex */
    static final class C73211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C73211(Continuation<? super C73211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.beginSpan$suspendImpl(PerformanceMetricDao.this, (PerformanceMetric.Key) null, (String) null, (PerformanceMetricSpanEventData.Context) null, (Instant) null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 150, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "beginSpan$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$beginSpan$2 */
    /* loaded from: classes24.dex */
    static final class C73222 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C73222(Continuation<? super C73222> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.beginSpan$suspendImpl(PerformanceMetricDao.this, (PerformanceSpan.Key) null, (PerformanceMetricSpanEventData.Context) null, (Instant) null, false, (Continuation<? super PerformanceSpan>) this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {28, 29, 35, 36}, m3647m = "onSessionUpdate$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$onSessionUpdate$1 */
    static final class C73231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C73231(Continuation<? super C73231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.onSessionUpdate$suspendImpl(PerformanceMetricDao.this, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "pauseMetric$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$pauseMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73241 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C73241(Continuation<? super C73241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.pauseMetric$suspendImpl(PerformanceMetricDao.this, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "resumeMetric$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$resumeMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C73251(Continuation<? super C73251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.resumeMetric$suspendImpl(PerformanceMetricDao.this, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {113, 119, 125}, m3647m = "skipSpan$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$skipSpan$1 */
    /* loaded from: classes24.dex */
    static final class C73261 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C73261(Continuation<? super C73261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.skipSpan$suspendImpl(PerformanceMetricDao.this, null, null, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 239}, m3647m = "terminateMetric$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$terminateMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C73271(Continuation<? super C73271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.terminateMetric$suspendImpl(PerformanceMetricDao.this, null, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {EnumC7081g.f2777x89a9e432, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "terminateMetricByEvent$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$terminateMetricByEvent$1 */
    /* loaded from: classes24.dex */
    static final class C73281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C73281(Continuation<? super C73281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.terminateMetricByEvent$suspendImpl(PerformanceMetricDao.this, null, null, null, null, this);
        }
    }

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao", m3645f = "PerformanceMetricDao.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 271}, m3647m = "terminateSpan$suspendImpl")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao$terminateSpan$1 */
    /* loaded from: classes24.dex */
    static final class C73291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C73291(Continuation<? super C73291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceMetricDao.terminateSpan$suspendImpl(PerformanceMetricDao.this, null, null, null, null, this);
        }
    }

    protected abstract Object abortIncompleteMetrics(UUID uuid, Instant instant, Continuation<? super Integer> continuation);

    protected abstract Object abortIncompleteSpans(Set<UUID> set, Instant instant, Continuation<? super Integer> continuation);

    public Object beginMetric(PerformanceMetric.Key key, PerformanceMetricEventData.Source source, PerformanceMetricEventData.Context context, NetworkConnection networkConnection, Instant instant, Continuation<? super PerformanceMetric> continuation) {
        return beginMetric$suspendImpl(this, key, source, context, networkConnection, instant, continuation);
    }

    public Object beginSpan(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super PerformanceSpan> continuation) {
        return beginSpan$suspendImpl(this, key, str, context, instant, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object beginSpan(PerformanceSpan.Key key, PerformanceMetricSpanEventData.Context context, Instant instant, boolean z, Continuation<? super PerformanceSpan> continuation) {
        return beginSpan$suspendImpl(this, key, context, instant, z, continuation);
    }

    public abstract Object deleteMetrics$lib_analytics_externalRelease(Set<UUID> set, Continuation<? super Integer> continuation);

    protected abstract Object findIncompleteMetricIds(UUID uuid, Continuation<? super List<UUID>> continuation);

    protected abstract Object findIncompleteSpanKeys(Set<UUID> set, Continuation<? super List<PerformanceSpan.Key>> continuation);

    public abstract Object findMetric(UUID uuid, PerformanceMetricEventData.Name name, UUID uuid2, PerformanceMetricEventData.Status status, Continuation<? super PerformanceMetric> continuation);

    protected abstract Object findMetrics(UUID uuid, PerformanceMetricEventData.Name name, PerformanceMetricEventData.Status status, Continuation<? super List<PerformanceMetric>> continuation);

    protected abstract Object findSpan(UUID uuid, String str, PerformanceMetricSpanEventData.Status status, Continuation<? super PerformanceSpan> continuation);

    public abstract Object findSpans$lib_analytics_externalRelease(UUID uuid, PerformanceMetricSpanEventData.Status status, Continuation<? super List<PerformanceSpan>> continuation);

    public abstract Object findTerminatedMetrics$lib_analytics_externalRelease(Continuation<? super List<PerformanceMetric>> continuation);

    protected abstract Object getAllMetrics(Continuation<? super List<PerformanceMetric>> continuation);

    public abstract Object insert(PerformanceMetric performanceMetric, Continuation<? super Unit> continuation);

    public abstract Object insert(PerformanceSpan performanceSpan, Continuation<? super Unit> continuation);

    public Object onSessionUpdate(UUID uuid, Instant instant, Continuation<? super Unit> continuation) {
        return onSessionUpdate$suspendImpl(this, uuid, instant, continuation);
    }

    public Object pauseMetric(PerformanceMetric.Key key, Instant instant, Continuation<? super Boolean> continuation) {
        return pauseMetric$suspendImpl(this, key, instant, continuation);
    }

    public Object queryAll$lib_analytics_externalRelease(Continuation<? super List<? extends Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>>> continuation) {
        return queryAll$suspendImpl(this, continuation);
    }

    public Object resumeMetric(PerformanceMetric.Key key, Instant instant, Continuation<? super Boolean> continuation) {
        return resumeMetric$suspendImpl(this, key, instant, continuation);
    }

    public Object skipSpan(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super Boolean> continuation) {
        return skipSpan$suspendImpl(this, key, str, context, instant, continuation);
    }

    public Object terminateMetric(PerformanceMetric.Key key, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super Boolean> continuation) {
        return terminateMetric$suspendImpl(this, key, instant, status, continuation);
    }

    public Object terminateMetricByEvent(ContextActionEvent contextActionEvent, UUID uuid, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super Boolean> continuation) {
        return terminateMetricByEvent$suspendImpl(this, contextActionEvent, uuid, instant, status, continuation);
    }

    public Object terminateSpan(PerformanceMetric.Key key, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super Boolean> continuation) {
        return terminateSpan$suspendImpl(this, key, str, instant, status, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object terminateSpans(UUID uuid, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super Integer> continuation) {
        return terminateSpans$suspendImpl(this, uuid, str, instant, status, continuation);
    }

    protected abstract Object updateMetric(UUID uuid, PerformanceMetricEventData.Status status, Instant instant, Continuation<? super Integer> continuation);

    protected abstract Object updateMetricPause(UUID uuid, List<PerformanceMetric.Pause> list, Continuation<? super Integer> continuation);

    protected abstract Object updateSpans(UUID uuid, String str, PerformanceMetricSpanEventData.Status status, PerformanceMetricSpanEventData.Status status2, Instant instant, Continuation<? super Integer> continuation);

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onSessionUpdate$suspendImpl(PerformanceMetricDao performanceMetricDao, UUID uuid, Instant instant, Continuation<? super Unit> continuation) {
        C73231 c73231;
        PerformanceMetricDao performanceMetricDao2;
        Set<UUID> set;
        Instant instant2;
        int iIntValue;
        Object objAbortIncompleteSpans;
        List list;
        int iIntValue2;
        if (continuation instanceof C73231) {
            c73231 = (C73231) continuation;
            int i = c73231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73231.label = i - Integer.MIN_VALUE;
            } else {
                c73231 = performanceMetricDao.new C73231(continuation);
            }
        }
        Object objFindIncompleteMetricIds = c73231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindIncompleteMetricIds);
            c73231.L$0 = performanceMetricDao;
            c73231.L$1 = uuid;
            c73231.L$2 = instant;
            c73231.label = 1;
            objFindIncompleteMetricIds = performanceMetricDao.findIncompleteMetricIds(uuid, c73231);
            if (objFindIncompleteMetricIds != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                set = (Set) c73231.L$2;
                instant2 = (Instant) c73231.L$1;
                performanceMetricDao2 = (PerformanceMetricDao) c73231.L$0;
                ResultKt.throwOnFailure(objFindIncompleteMetricIds);
                iIntValue = ((Number) objFindIncompleteMetricIds).intValue();
                if (set.size() == iIntValue) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iIntValue > 0) {
                    Logger.INSTANCE.mo1683i(iIntValue + " metrics were aborted due to new or terminated session", new Object[0]);
                }
                c73231.L$0 = performanceMetricDao2;
                c73231.L$1 = instant2;
                c73231.L$2 = set;
                c73231.label = 3;
                objFindIncompleteMetricIds = performanceMetricDao2.findIncompleteSpanKeys(set, c73231);
                if (objFindIncompleteMetricIds != coroutine_suspended) {
                    List list2 = (List) objFindIncompleteMetricIds;
                    c73231.L$0 = list2;
                    c73231.L$1 = null;
                    c73231.L$2 = null;
                    c73231.label = 4;
                    objAbortIncompleteSpans = performanceMetricDao2.abortIncompleteSpans(set, instant2, c73231);
                    if (objAbortIncompleteSpans != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c73231.L$0;
                ResultKt.throwOnFailure(objFindIncompleteMetricIds);
                iIntValue2 = ((Number) objFindIncompleteMetricIds).intValue();
                if (list.size() == iIntValue2) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iIntValue2 > 0) {
                    Logger.INSTANCE.mo1683i(iIntValue2 + " spans were aborted due to new or terminated session", new Object[0]);
                }
                return Unit.INSTANCE;
            }
            set = (Set) c73231.L$2;
            instant2 = (Instant) c73231.L$1;
            performanceMetricDao2 = (PerformanceMetricDao) c73231.L$0;
            ResultKt.throwOnFailure(objFindIncompleteMetricIds);
            List list22 = (List) objFindIncompleteMetricIds;
            c73231.L$0 = list22;
            c73231.L$1 = null;
            c73231.L$2 = null;
            c73231.label = 4;
            objAbortIncompleteSpans = performanceMetricDao2.abortIncompleteSpans(set, instant2, c73231);
            if (objAbortIncompleteSpans != coroutine_suspended) {
                objFindIncompleteMetricIds = objAbortIncompleteSpans;
                list = list22;
                iIntValue2 = ((Number) objFindIncompleteMetricIds).intValue();
                if (list.size() == iIntValue2) {
                }
            }
            return coroutine_suspended;
        }
        instant = (Instant) c73231.L$2;
        uuid = (UUID) c73231.L$1;
        performanceMetricDao = (PerformanceMetricDao) c73231.L$0;
        ResultKt.throwOnFailure(objFindIncompleteMetricIds);
        Set<UUID> set2 = CollectionsKt.toSet((Iterable) objFindIncompleteMetricIds);
        c73231.L$0 = performanceMetricDao;
        c73231.L$1 = instant;
        c73231.L$2 = set2;
        c73231.label = 2;
        Object objAbortIncompleteMetrics = performanceMetricDao.abortIncompleteMetrics(uuid, instant, c73231);
        if (objAbortIncompleteMetrics != coroutine_suspended) {
            Instant instant3 = instant;
            performanceMetricDao2 = performanceMetricDao;
            set = set2;
            objFindIncompleteMetricIds = objAbortIncompleteMetrics;
            instant2 = instant3;
            iIntValue = ((Number) objFindIncompleteMetricIds).intValue();
            if (set.size() == iIntValue) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object beginMetric$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, PerformanceMetricEventData.Source source, PerformanceMetricEventData.Context context, NetworkConnection networkConnection, Instant instant, Continuation<? super PerformanceMetric> continuation) {
        C73201 c73201;
        PerformanceMetricEventData.Source source2;
        PerformanceMetric.Key key2;
        Instant instant2;
        PerformanceMetricEventData.Context context2;
        NetworkConnection networkConnection2;
        PerformanceMetricDao performanceMetricDao2;
        if (continuation instanceof C73201) {
            c73201 = (C73201) continuation;
            int i = c73201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73201.label = i - Integer.MIN_VALUE;
            } else {
                c73201 = performanceMetricDao.new C73201(continuation);
            }
        }
        Object objTerminateMetric = c73201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTerminateMetric);
            PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.ABORTED;
            c73201.L$0 = performanceMetricDao;
            c73201.L$1 = key;
            source2 = source;
            c73201.L$2 = source2;
            c73201.L$3 = context;
            c73201.L$4 = networkConnection;
            c73201.L$5 = instant;
            c73201.label = 1;
            objTerminateMetric = performanceMetricDao.terminateMetric(key, instant, status, c73201);
            if (objTerminateMetric != coroutine_suspended) {
                key2 = key;
                instant2 = instant;
                context2 = context;
                networkConnection2 = networkConnection;
                performanceMetricDao2 = performanceMetricDao;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PerformanceMetric performanceMetric = (PerformanceMetric) c73201.L$0;
            ResultKt.throwOnFailure(objTerminateMetric);
            return performanceMetric;
        }
        Instant instant3 = (Instant) c73201.L$5;
        NetworkConnection networkConnection3 = (NetworkConnection) c73201.L$4;
        PerformanceMetricEventData.Context context3 = (PerformanceMetricEventData.Context) c73201.L$3;
        source2 = (PerformanceMetricEventData.Source) c73201.L$2;
        PerformanceMetric.Key key3 = (PerformanceMetric.Key) c73201.L$1;
        performanceMetricDao2 = (PerformanceMetricDao) c73201.L$0;
        ResultKt.throwOnFailure(objTerminateMetric);
        instant2 = instant3;
        networkConnection2 = networkConnection3;
        context2 = context3;
        key2 = key3;
        PerformanceMetricEventData.Source source3 = source2;
        if (((Boolean) objTerminateMetric).booleanValue()) {
            Logger.INSTANCE.mo1681e("Metric was terminated from starting a new metric: %s", key2);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        PerformanceMetric performanceMetric2 = new PerformanceMetric(uuidRandomUUID, key2, source3, context2, networkConnection2, PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED, instant2, null, CollectionsKt.emptyList());
        c73201.L$0 = performanceMetric2;
        c73201.L$1 = null;
        c73201.L$2 = null;
        c73201.L$3 = null;
        c73201.L$4 = null;
        c73201.L$5 = null;
        c73201.label = 2;
        return performanceMetricDao2.insert(performanceMetric2, c73201) == coroutine_suspended ? coroutine_suspended : performanceMetric2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object beginSpan$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super PerformanceSpan> continuation) {
        C73211 c73211;
        if (continuation instanceof C73211) {
            c73211 = (C73211) continuation;
            int i = c73211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73211.label = i - Integer.MIN_VALUE;
            } else {
                c73211 = performanceMetricDao.new C73211(continuation);
            }
        }
        C73211 c732112 = c73211;
        Object objFindMetric = c732112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c732112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetric);
            PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c732112.L$0 = performanceMetricDao;
            c732112.L$1 = str;
            c732112.L$2 = context;
            c732112.L$3 = instant;
            c732112.label = 1;
            objFindMetric = performanceMetricDao.findMetric(key, status, c732112);
            if (objFindMetric != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFindMetric);
            return objFindMetric;
        }
        instant = (Instant) c732112.L$3;
        context = (PerformanceMetricSpanEventData.Context) c732112.L$2;
        str = (String) c732112.L$1;
        performanceMetricDao = (PerformanceMetricDao) c732112.L$0;
        ResultKt.throwOnFailure(objFindMetric);
        PerformanceMetricDao performanceMetricDao2 = performanceMetricDao;
        PerformanceMetricSpanEventData.Context context2 = context;
        Instant instant2 = instant;
        PerformanceMetric performanceMetric = (PerformanceMetric) objFindMetric;
        if (performanceMetric == null) {
            return null;
        }
        PerformanceSpan.Key key2 = new PerformanceSpan.Key(performanceMetric.getId(), str);
        c732112.L$0 = null;
        c732112.L$1 = null;
        c732112.L$2 = null;
        c732112.L$3 = null;
        c732112.label = 2;
        Object objBeginSpan$default = beginSpan$default(performanceMetricDao2, key2, context2, instant2, false, c732112, 8, null);
        return objBeginSpan$default == coroutine_suspended ? coroutine_suspended : objBeginSpan$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r0 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object skipSpan$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super Boolean> continuation) {
        C73261 c73261;
        Instant instant2;
        PerformanceMetricDao performanceMetricDao2;
        String str2;
        PerformanceMetric performanceMetric;
        if (continuation instanceof C73261) {
            c73261 = (C73261) continuation;
            int i = c73261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73261.label = i - Integer.MIN_VALUE;
            } else {
                c73261 = performanceMetricDao.new C73261(continuation);
            }
        }
        C73261 c732612 = c73261;
        Object objFindMetric = c732612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c732612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetric);
            PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c732612.L$0 = performanceMetricDao;
            c732612.L$1 = str;
            c732612.L$2 = context;
            c732612.L$3 = instant;
            c732612.label = 1;
            objFindMetric = performanceMetricDao.findMetric(key, status, c732612);
            if (objFindMetric != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            instant = (Instant) c732612.L$3;
            context = (PerformanceMetricSpanEventData.Context) c732612.L$2;
            str = (String) c732612.L$1;
            performanceMetricDao = (PerformanceMetricDao) c732612.L$0;
            ResultKt.throwOnFailure(objFindMetric);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFindMetric);
                return boxing.boxBoolean(((Number) objFindMetric).intValue() > 0);
            }
            performanceMetric = (PerformanceMetric) c732612.L$3;
            Instant instant3 = (Instant) c732612.L$2;
            str2 = (String) c732612.L$1;
            PerformanceMetricDao performanceMetricDao3 = (PerformanceMetricDao) c732612.L$0;
            ResultKt.throwOnFailure(objFindMetric);
            instant2 = instant3;
            performanceMetricDao2 = performanceMetricDao3;
            UUID id = performanceMetric.getId();
            PerformanceMetricSpanEventData.Status status2 = PerformanceMetricSpanEventData.Status.SKIPPED;
            c732612.L$0 = null;
            c732612.L$1 = null;
            c732612.L$2 = null;
            c732612.L$3 = null;
            c732612.label = 3;
            objFindMetric = performanceMetricDao2.terminateSpans(id, str2, instant2, status2, c732612);
        }
        Object obj = objFindMetric;
        String str3 = str;
        PerformanceMetricSpanEventData.Context context2 = context;
        instant2 = instant;
        PerformanceMetric performanceMetric2 = (PerformanceMetric) obj;
        if (performanceMetric2 == null) {
            return boxing.boxBoolean(false);
        }
        PerformanceSpan.Key key2 = new PerformanceSpan.Key(performanceMetric2.getId(), str3);
        c732612.L$0 = performanceMetricDao;
        c732612.L$1 = str3;
        c732612.L$2 = instant2;
        c732612.L$3 = performanceMetric2;
        c732612.label = 2;
        if (performanceMetricDao.beginSpan(key2, context2, instant2, true, (Continuation<? super PerformanceSpan>) c732612) != coroutine_suspended) {
            performanceMetricDao2 = performanceMetricDao;
            str2 = str3;
            performanceMetric = performanceMetric2;
            UUID id2 = performanceMetric.getId();
            PerformanceMetricSpanEventData.Status status22 = PerformanceMetricSpanEventData.Status.SKIPPED;
            c732612.L$0 = null;
            c732612.L$1 = null;
            c732612.L$2 = null;
            c732612.L$3 = null;
            c732612.label = 3;
            objFindMetric = performanceMetricDao2.terminateSpans(id2, str2, instant2, status22, c732612);
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object beginSpan$default(PerformanceMetricDao performanceMetricDao, PerformanceSpan.Key key, PerformanceMetricSpanEventData.Context context, Instant instant, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginSpan");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return performanceMetricDao.beginSpan(key, context, instant, z, (Continuation<? super PerformanceSpan>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r2 == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object beginSpan$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceSpan.Key key, PerformanceMetricSpanEventData.Context context, Instant instant, boolean z, Continuation<? super PerformanceSpan> continuation) {
        C73222 c73222;
        boolean z2;
        PerformanceSpan.Key key2;
        PerformanceMetricSpanEventData.Context context2;
        Instant instant2;
        PerformanceMetricDao performanceMetricDao2;
        if (continuation instanceof C73222) {
            c73222 = (C73222) continuation;
            int i = c73222.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73222.label = i - Integer.MIN_VALUE;
            } else {
                c73222 = performanceMetricDao.new C73222(continuation);
            }
        }
        Object objUpdateSpan = c73222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateSpan);
            PerformanceMetricSpanEventData.Status status = PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
            c73222.L$0 = performanceMetricDao;
            c73222.L$1 = key;
            c73222.L$2 = context;
            c73222.L$3 = instant;
            z2 = z;
            c73222.Z$0 = z2;
            c73222.label = 1;
            objUpdateSpan = performanceMetricDao.updateSpan(key, status, null, c73222);
            if (objUpdateSpan != coroutine_suspended) {
                key2 = key;
                context2 = context;
                instant2 = instant;
                performanceMetricDao2 = performanceMetricDao;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objUpdateSpan);
                if (objUpdateSpan != null) {
                    return objUpdateSpan;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PerformanceSpan performanceSpan = (PerformanceSpan) c73222.L$0;
            ResultKt.throwOnFailure(objUpdateSpan);
            return performanceSpan;
        }
        boolean z3 = c73222.Z$0;
        Instant instant3 = (Instant) c73222.L$3;
        context2 = (PerformanceMetricSpanEventData.Context) c73222.L$2;
        PerformanceSpan.Key key3 = (PerformanceSpan.Key) c73222.L$1;
        performanceMetricDao2 = (PerformanceMetricDao) c73222.L$0;
        ResultKt.throwOnFailure(objUpdateSpan);
        z2 = z3;
        instant2 = instant3;
        key2 = key3;
        if (((Number) objUpdateSpan).intValue() > 0) {
            if (!z2) {
                Logger.INSTANCE.mo1681e("Span already exists: %s", key2);
            }
            c73222.L$0 = null;
            c73222.L$1 = null;
            c73222.L$2 = null;
            c73222.L$3 = null;
            c73222.label = 2;
            objUpdateSpan = findSpan$default(performanceMetricDao2, key2, null, c73222, 2, null);
        } else {
            PerformanceSpan performanceSpan2 = new PerformanceSpan(key2, PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED, context2, instant2, null);
            c73222.L$0 = performanceSpan2;
            c73222.L$1 = null;
            c73222.L$2 = null;
            c73222.L$3 = null;
            c73222.label = 3;
            if (performanceMetricDao2.insert(performanceSpan2, c73222) != coroutine_suspended) {
                return performanceSpan2;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object pauseMetric$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, Instant instant, Continuation<? super Boolean> continuation) {
        C73241 c73241;
        if (continuation instanceof C73241) {
            c73241 = (C73241) continuation;
            int i = c73241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73241.label = i - Integer.MIN_VALUE;
            } else {
                c73241 = performanceMetricDao.new C73241(continuation);
            }
        }
        Object objFindMetric = c73241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetric);
            PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c73241.L$0 = performanceMetricDao;
            c73241.L$1 = instant;
            c73241.label = 1;
            objFindMetric = performanceMetricDao.findMetric(key, status, c73241);
            if (objFindMetric != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFindMetric);
            if (((Number) objFindMetric).intValue() != 1) {
                throw new IllegalStateException("Check failed.");
            }
            return boxing.boxBoolean(true);
        }
        instant = (Instant) c73241.L$1;
        performanceMetricDao = (PerformanceMetricDao) c73241.L$0;
        ResultKt.throwOnFailure(objFindMetric);
        PerformanceMetric performanceMetric = (PerformanceMetric) objFindMetric;
        if (performanceMetric == null) {
            return boxing.boxBoolean(false);
        }
        if (!performanceMetric.getPauses().isEmpty() && ((PerformanceMetric.Pause) CollectionsKt.last((List) performanceMetric.getPauses())).getEndTimestamp() == null) {
            return boxing.boxBoolean(false);
        }
        List<PerformanceMetric.Pause> listPlus = CollectionsKt.plus((Collection<? extends PerformanceMetric.Pause>) performanceMetric.getPauses(), new PerformanceMetric.Pause(instant, null));
        UUID id = performanceMetric.getId();
        c73241.L$0 = null;
        c73241.L$1 = null;
        c73241.label = 2;
        objFindMetric = performanceMetricDao.updateMetricPause(id, listPlus, c73241);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object resumeMetric$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, Instant instant, Continuation<? super Boolean> continuation) {
        C73251 c73251;
        if (continuation instanceof C73251) {
            c73251 = (C73251) continuation;
            int i = c73251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73251.label = i - Integer.MIN_VALUE;
            } else {
                c73251 = performanceMetricDao.new C73251(continuation);
            }
        }
        Object objFindMetric = c73251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetric);
            PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c73251.L$0 = performanceMetricDao;
            c73251.L$1 = instant;
            c73251.label = 1;
            objFindMetric = performanceMetricDao.findMetric(key, status, c73251);
            if (objFindMetric != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFindMetric);
            if (((Number) objFindMetric).intValue() != 1) {
                throw new IllegalStateException("Check failed.");
            }
            return boxing.boxBoolean(true);
        }
        instant = (Instant) c73251.L$1;
        performanceMetricDao = (PerformanceMetricDao) c73251.L$0;
        ResultKt.throwOnFailure(objFindMetric);
        PerformanceMetric performanceMetric = (PerformanceMetric) objFindMetric;
        if (performanceMetric == null) {
            return boxing.boxBoolean(false);
        }
        PerformanceMetric.Pause pause = (PerformanceMetric.Pause) CollectionsKt.lastOrNull((List) performanceMetric.getPauses());
        if (pause == null || pause.getEndTimestamp() != null) {
            return boxing.boxBoolean(false);
        }
        List mutableList = CollectionsKt.toMutableList((Collection) performanceMetric.getPauses());
        mutableList.remove(CollectionsKt.getLastIndex(mutableList));
        mutableList.add(PerformanceMetric.Pause.copy$default(pause, null, instant, 1, null));
        List<PerformanceMetric.Pause> list = CollectionsKt.toList(mutableList);
        UUID id = performanceMetric.getId();
        c73251.L$0 = null;
        c73251.L$1 = null;
        c73251.label = 2;
        objFindMetric = performanceMetricDao.updateMetricPause(id, list, c73251);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r1.terminateSpans(r8, null, r4, r5, r6) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object terminateMetric$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super Boolean> continuation) {
        C73271 c73271;
        PerformanceMetricDao performanceMetricDao2;
        PerformanceMetric performanceMetric;
        PerformanceMetricEventData.Status status2;
        if (continuation instanceof C73271) {
            c73271 = (C73271) continuation;
            int i = c73271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73271.label = i - Integer.MIN_VALUE;
            } else {
                c73271 = performanceMetricDao.new C73271(continuation);
            }
        }
        C73271 c732712 = c73271;
        Object objFindMetric = c732712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c732712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetric);
            PerformanceMetricEventData.Status status3 = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c732712.L$0 = performanceMetricDao;
            c732712.L$1 = instant;
            c732712.L$2 = status;
            c732712.label = 1;
            objFindMetric = performanceMetricDao.findMetric(key, status3, c732712);
            if (objFindMetric != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            status = (PerformanceMetricEventData.Status) c732712.L$2;
            instant = (Instant) c732712.L$1;
            performanceMetricDao = (PerformanceMetricDao) c732712.L$0;
            ResultKt.throwOnFailure(objFindMetric);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFindMetric);
                return boxing.boxBoolean(true);
            }
            performanceMetric = (PerformanceMetric) c732712.L$3;
            status2 = (PerformanceMetricEventData.Status) c732712.L$2;
            instant = (Instant) c732712.L$1;
            PerformanceMetricDao performanceMetricDao3 = (PerformanceMetricDao) c732712.L$0;
            ResultKt.throwOnFailure(objFindMetric);
            performanceMetricDao2 = performanceMetricDao3;
            Instant instant2 = instant;
            if (((Number) objFindMetric).intValue() == 1) {
                throw new IllegalStateException("Check failed.");
            }
            UUID id = performanceMetric.getId();
            PerformanceMetricSpanEventData.Status spanStatus = PerformanceMetricDao4.getSpanStatus(status2);
            c732712.L$0 = null;
            c732712.L$1 = null;
            c732712.L$2 = null;
            c732712.L$3 = null;
            c732712.label = 3;
        }
        PerformanceMetric performanceMetric2 = (PerformanceMetric) objFindMetric;
        if (performanceMetric2 == null) {
            return boxing.boxBoolean(false);
        }
        UUID id2 = performanceMetric2.getId();
        c732712.L$0 = performanceMetricDao;
        c732712.L$1 = instant;
        c732712.L$2 = status;
        c732712.L$3 = performanceMetric2;
        c732712.label = 2;
        objFindMetric = performanceMetricDao.updateMetric(id2, status, instant, c732712);
        if (objFindMetric != coroutine_suspended) {
            performanceMetricDao2 = performanceMetricDao;
            performanceMetric = performanceMetric2;
            status2 = status;
            Instant instant22 = instant;
            if (((Number) objFindMetric).intValue() == 1) {
            }
        }
        return coroutine_suspended;
    }

    static /* synthetic */ Object terminateSpans$suspendImpl(PerformanceMetricDao performanceMetricDao, UUID uuid, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super Integer> continuation) {
        return performanceMetricDao.updateSpans(uuid, str, PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED, status, instant, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object terminateSpan$suspendImpl(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super Boolean> continuation) {
        C73291 c73291;
        if (continuation instanceof C73291) {
            c73291 = (C73291) continuation;
            int i = c73291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73291.label = i - Integer.MIN_VALUE;
            } else {
                c73291 = performanceMetricDao.new C73291(continuation);
            }
        }
        C73291 c732912 = c73291;
        Object objFindMetric = c732912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c732912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetric);
            PerformanceMetricEventData.Status status2 = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c732912.L$0 = performanceMetricDao;
            c732912.L$1 = str;
            c732912.L$2 = instant;
            c732912.L$3 = status;
            c732912.label = 1;
            objFindMetric = performanceMetricDao.findMetric(key, status2, c732912);
            if (objFindMetric != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFindMetric);
            return boxing.boxBoolean(((Number) objFindMetric).intValue() > 0);
        }
        status = (PerformanceMetricSpanEventData.Status) c732912.L$3;
        instant = (Instant) c732912.L$2;
        str = (String) c732912.L$1;
        performanceMetricDao = (PerformanceMetricDao) c732912.L$0;
        ResultKt.throwOnFailure(objFindMetric);
        PerformanceMetric performanceMetric = (PerformanceMetric) objFindMetric;
        if (performanceMetric == null) {
            return boxing.boxBoolean(false);
        }
        UUID id = performanceMetric.getId();
        c732912.L$0 = null;
        c732912.L$1 = null;
        c732912.L$2 = null;
        c732912.L$3 = null;
        c732912.label = 2;
        objFindMetric = performanceMetricDao.terminateSpans(id, str, instant, status, c732912);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r10.terminateSpans(r8, null, r11, r12, r13) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object terminateMetricByEvent$suspendImpl(PerformanceMetricDao performanceMetricDao, ContextActionEvent contextActionEvent, UUID uuid, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super Boolean> continuation) {
        C73281 c73281;
        Object next;
        PerformanceMetricDao performanceMetricDao2;
        PerformanceMetric performanceMetric;
        PerformanceMetricEventData.Status status2;
        if (continuation instanceof C73281) {
            c73281 = (C73281) continuation;
            int i = c73281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73281.label = i - Integer.MIN_VALUE;
            } else {
                c73281 = performanceMetricDao.new C73281(continuation);
            }
        }
        C73281 c732812 = c73281;
        Object objFindMetrics = c732812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c732812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindMetrics);
            PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.ACTION_COMPLETION;
            PerformanceMetricEventData.Status status3 = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            c732812.L$0 = performanceMetricDao;
            c732812.L$1 = contextActionEvent;
            c732812.L$2 = instant;
            c732812.L$3 = status;
            c732812.label = 1;
            objFindMetrics = performanceMetricDao.findMetrics(uuid, name, status3, c732812);
            if (objFindMetrics != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            status = (PerformanceMetricEventData.Status) c732812.L$3;
            instant = (Instant) c732812.L$2;
            contextActionEvent = (ContextActionEvent) c732812.L$1;
            performanceMetricDao = (PerformanceMetricDao) c732812.L$0;
            ResultKt.throwOnFailure(objFindMetrics);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFindMetrics);
                return boxing.boxBoolean(true);
            }
            performanceMetric = (PerformanceMetric) c732812.L$3;
            status2 = (PerformanceMetricEventData.Status) c732812.L$2;
            Instant instant2 = (Instant) c732812.L$1;
            PerformanceMetricDao performanceMetricDao3 = (PerformanceMetricDao) c732812.L$0;
            ResultKt.throwOnFailure(objFindMetrics);
            instant = instant2;
            performanceMetricDao2 = performanceMetricDao3;
            if (((Number) objFindMetrics).intValue() == 1) {
                throw new IllegalStateException("Check failed.");
            }
            UUID id = performanceMetric.getId();
            PerformanceMetricSpanEventData.Status spanStatus = PerformanceMetricDao4.getSpanStatus(status2);
            c732812.L$0 = null;
            c732812.L$1 = null;
            c732812.L$2 = null;
            c732812.L$3 = null;
            c732812.label = 3;
        }
        Iterator it = ((Iterable) objFindMetrics).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PerformanceMetric) next).getEvent(), contextActionEvent)) {
                break;
            }
        }
        PerformanceMetric performanceMetric2 = (PerformanceMetric) next;
        if (performanceMetric2 == null) {
            return boxing.boxBoolean(false);
        }
        UUID id2 = performanceMetric2.getId();
        c732812.L$0 = performanceMetricDao;
        c732812.L$1 = instant;
        c732812.L$2 = status;
        c732812.L$3 = performanceMetric2;
        c732812.label = 2;
        objFindMetrics = performanceMetricDao.updateMetric(id2, status, instant, c732812);
        if (objFindMetrics != coroutine_suspended) {
            performanceMetricDao2 = performanceMetricDao;
            performanceMetric = performanceMetric2;
            status2 = status;
            if (((Number) objFindMetrics).intValue() == 1) {
            }
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object updateSpans$default(PerformanceMetricDao performanceMetricDao, UUID uuid, String str, PerformanceMetricSpanEventData.Status status, PerformanceMetricSpanEventData.Status status2, Instant instant, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSpans");
        }
        if ((i & 4) != 0) {
            status = null;
        }
        return performanceMetricDao.updateSpans(uuid, str, status, status2, instant, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSpan(PerformanceSpan.Key key, PerformanceMetricSpanEventData.Status status, Instant instant, Continuation<? super Integer> continuation) {
        return updateSpans$default(this, key.getMetricId(), key.getSpanName(), null, status, instant, continuation, 4, null);
    }

    static /* synthetic */ Object findMetric$default(PerformanceMetricDao performanceMetricDao, PerformanceMetric.Key key, PerformanceMetricEventData.Status status, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findMetric");
        }
        if ((i & 2) != 0) {
            status = null;
        }
        return performanceMetricDao.findMetric(key, status, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object findMetric(PerformanceMetric.Key key, PerformanceMetricEventData.Status status, Continuation<? super PerformanceMetric> continuation) {
        return findMetric(key.getSessionId(), key.getMetricName(), key.getContextualId(), status, continuation);
    }

    static /* synthetic */ Object findSpan$default(PerformanceMetricDao performanceMetricDao, PerformanceSpan.Key key, PerformanceMetricSpanEventData.Status status, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findSpan");
        }
        if ((i & 2) != 0) {
            status = null;
        }
        return performanceMetricDao.findSpan(key, status, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object findSpan(PerformanceSpan.Key key, PerformanceMetricSpanEventData.Status status, Continuation<? super PerformanceSpan> continuation) {
        return findSpan(key.getMetricId(), key.getSpanName(), status, continuation);
    }

    static /* synthetic */ Object queryAll$suspendImpl(PerformanceMetricDao performanceMetricDao, Continuation<? super List<? extends Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>>> continuation) {
        return CoroutineScope2.coroutineScope(new PerformanceMetricDao2(performanceMetricDao, null), continuation);
    }
}
