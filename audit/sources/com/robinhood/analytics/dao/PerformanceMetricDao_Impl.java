package com.robinhood.analytics.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.ConnectionUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceMetric2;
import com.robinhood.analytics.models.PerformanceSpan;
import com.robinhood.analytics.models.PerformanceSpan2;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import com.robinhood.utils.room.CommonRoomConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p479j$.time.Instant;

/* compiled from: PerformanceMetricDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 y2\u00020\u0001:\u0001yB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0012\u0010\u0016J\"\u0010\u001b\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010%\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b%\u0010&J2\u0010+\u001a\u0004\u0018\u00010\u00142\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b+\u0010,J0\u0010+\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0094@¢\u0006\u0004\b+\u00101J0\u00102\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b2\u0010,J \u00103\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b3\u00104J \u00105\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b5\u00104J(\u00108\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00107\u001a\u000206H\u0096@¢\u0006\u0004\b8\u00109J2\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00107\u001a\u00020;H\u0094@¢\u0006\u0004\b=\u0010>J0\u0010?\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00107\u001a\u00020;H\u0096@¢\u0006\u0004\b?\u0010@J0\u0010C\u001a\u00020/2\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00107\u001a\u000206H\u0096@¢\u0006\u0004\bC\u0010DJ(\u0010I\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140E0F0EH\u0090@¢\u0006\u0004\bG\u0010HJ \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00170E2\b\u0010J\u001a\u0004\u0018\u00010\u0017H\u0094@¢\u0006\u0004\bK\u0010LJ$\u0010O\u001a\b\u0012\u0004\u0012\u00020-0E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170MH\u0094@¢\u0006\u0004\bO\u0010PJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000f0EH\u0090@¢\u0006\u0004\bQ\u0010HJ6\u0010V\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\b\u0010U\u001a\u0004\u0018\u00010\u00172\b\u00107\u001a\u0004\u0018\u000106H\u0096@¢\u0006\u0004\bV\u0010WJ,\u0010X\u001a\u0004\u0018\u00010\u00142\u0006\u0010:\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010;H\u0094@¢\u0006\u0004\bX\u0010YJ(\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00140E2\u0006\u0010:\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u00010;H\u0090@¢\u0006\u0004\bZ\u0010[J0\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000f0E2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\b\u00107\u001a\u0004\u0018\u000106H\u0094@¢\u0006\u0004\b]\u0010^J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000f0EH\u0094@¢\u0006\u0004\b_\u0010HJ&\u0010c\u001a\u00020<2\u0006\u0010`\u001a\u00020\u00172\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0EH\u0094@¢\u0006\u0004\bc\u0010dJ(\u0010f\u001a\u00020<2\u0006\u0010`\u001a\u00020\u00172\u0006\u00107\u001a\u0002062\u0006\u0010e\u001a\u00020\u0019H\u0094@¢\u0006\u0004\bf\u0010gJ>\u0010j\u001a\u00020<2\u0006\u0010:\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010h\u001a\u0004\u0018\u00010;2\u0006\u0010i\u001a\u00020;2\b\u0010e\u001a\u0004\u0018\u00010\u0019H\u0094@¢\u0006\u0004\bj\u0010kJ\"\u0010l\u001a\u00020<2\b\u0010J\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0094@¢\u0006\u0004\bl\u0010\u001cJ&\u0010m\u001a\u00020<2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010\u001a\u001a\u00020\u0019H\u0094@¢\u0006\u0004\bm\u0010nJ\u001e\u0010q\u001a\u00020<2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00170MH\u0090@¢\u0006\u0004\bp\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010rR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u000f0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010wR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010wR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00140s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010uR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010w¨\u0006z"}, m3636d2 = {"Lcom/robinhood/analytics/dao/PerformanceMetricDao_Impl;", "Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/robinhood/utils/room/CommonRoomConverters;", "__commonRoomConverters", "()Lcom/robinhood/utils/room/CommonRoomConverters;", "Lcom/robinhood/analytics/models/PerformanceMetricConverters;", "__performanceMetricConverters", "()Lcom/robinhood/analytics/models/PerformanceMetricConverters;", "Lcom/robinhood/analytics/models/PerformanceSpanConverters;", "__performanceSpanConverters", "()Lcom/robinhood/analytics/models/PerformanceSpanConverters;", "Lcom/robinhood/analytics/models/PerformanceMetric;", "metric", "", "insert", "(Lcom/robinhood/analytics/models/PerformanceMetric;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/analytics/models/PerformanceSpan;", "span", "(Lcom/robinhood/analytics/models/PerformanceSpan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "sessionId", "j$/time/Instant", "timestamp", "onSessionUpdate", "(Ljava/util/UUID;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/analytics/models/PerformanceMetric$Key;", "key", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "context", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "networkConnection", "beginMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metricKey", "", "spanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "beginSpan", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/analytics/models/PerformanceSpan$Key;", "spanKey", "", "suppressWarnings", "(Lcom/robinhood/analytics/models/PerformanceSpan$Key;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;Lj$/time/Instant;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipSpan", "pauseMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeMetric", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "status", "terminateMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metricId", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "", "terminateSpans", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminateSpan", "(Lcom/robinhood/analytics/models/PerformanceMetric$Key;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "event", "terminateMetricByEvent", "(Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;Ljava/util/UUID;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "queryAll$lib_analytics_externalRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAll", "currentSessionId", "findIncompleteMetricIds", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "metricIds", "findIncompleteSpanKeys", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findTerminatedMetrics$lib_analytics_externalRelease", "findTerminatedMetrics", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "metricName", "contextualId", "findMetric", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSpan", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSpans$lib_analytics_externalRelease", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSpans", "findMetrics", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMetrics", "id", "Lcom/robinhood/analytics/models/PerformanceMetric$Pause;", "pauses", "updateMetricPause", "(Ljava/util/UUID;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endTimestamp", "updateMetric", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentStatus", "newStatus", "updateSpans", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "abortIncompleteMetrics", "abortIncompleteSpans", "(Ljava/util/Set;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "deleteMetrics$lib_analytics_externalRelease", "deleteMetrics", "Landroidx/room/RoomDatabase;", "Landroidx/room/EntityInsertAdapter;", "__insertAdapterOfPerformanceMetric", "Landroidx/room/EntityInsertAdapter;", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "__insertAdapterOfPerformanceSpan", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PerformanceMetricDao_Impl extends PerformanceMetricDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<PerformanceMetric> __insertAdapterOfPerformanceMetric;
    private final EntityInsertAdapter<PerformanceSpan> __insertAdapterOfPerformanceSpan;
    private final Lazy<PerformanceMetric2> __performanceMetricConverters;
    private final Lazy<PerformanceSpan2> __performanceSpanConverters;

    public PerformanceMetricDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceMetricDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__performanceMetricConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceMetricDao_Impl.__performanceMetricConverters$lambda$1(__db);
            }
        });
        this.__performanceSpanConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceMetricDao_Impl.__performanceSpanConverters$lambda$2(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfPerformanceMetric = new EntityInsertAdapter<PerformanceMetric>() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `PerformanceMetric` (`id`,`source`,`context`,`networkConnection`,`status`,`startTimestamp`,`endTimestamp`,`pauses`,`key_sessionId`,`key_metricName`,`key_contextualId`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, PerformanceMetric entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = PerformanceMetricDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                if (PerformanceMetricDao_Impl.this.__performanceMetricConverters().metricSourceToValue(entity.getSource()) == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindLong(2, r0.intValue());
                }
                byte[] bArrMetricContextToBlob = PerformanceMetricDao_Impl.this.__performanceMetricConverters().metricContextToBlob(entity.getContext());
                if (bArrMetricContextToBlob == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindBlob(3, bArrMetricContextToBlob);
                }
                statement.bindBlob(4, PerformanceMetricDao_Impl.this.__performanceMetricConverters().networkConnectionToBytes(entity.getNetworkConnection()));
                if (PerformanceMetricDao_Impl.this.__performanceMetricConverters().metricStatusToValue(entity.getStatus()) == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindLong(5, r0.intValue());
                }
                String strInstantToString = PerformanceMetricDao_Impl.this.__commonRoomConverters().instantToString(entity.getStartTimestamp());
                if (strInstantToString == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strInstantToString);
                }
                String strInstantToString2 = PerformanceMetricDao_Impl.this.__commonRoomConverters().instantToString(entity.getEndTimestamp());
                if (strInstantToString2 == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, strInstantToString2);
                }
                String strPauseListToString = PerformanceMetricDao_Impl.this.__performanceMetricConverters().pauseListToString(entity.getPauses());
                if (strPauseListToString == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindText(8, strPauseListToString);
                }
                PerformanceMetric.Key key = entity.getKey();
                String strUuidToString2 = PerformanceMetricDao_Impl.this.__commonRoomConverters().uuidToString(key.getSessionId());
                if (strUuidToString2 == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindText(9, strUuidToString2);
                }
                if (PerformanceMetricDao_Impl.this.__performanceMetricConverters().metricNameToValue(key.getMetricName()) == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindLong(10, r0.intValue());
                }
                String strUuidToString3 = PerformanceMetricDao_Impl.this.__commonRoomConverters().uuidToString(key.getContextualId());
                if (strUuidToString3 == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindText(11, strUuidToString3);
                }
            }
        };
        this.__insertAdapterOfPerformanceSpan = new EntityInsertAdapter<PerformanceSpan>() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl.2
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `PerformanceSpan` (`status`,`context`,`startTimestamp`,`endTimestamp`,`key_metricId`,`key_spanName`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, PerformanceSpan entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                if (PerformanceMetricDao_Impl.this.__performanceSpanConverters().statusToValue(entity.getStatus()) == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindLong(1, r0.intValue());
                }
                byte[] bArrContextToBlob = PerformanceMetricDao_Impl.this.__performanceSpanConverters().contextToBlob(entity.getContext());
                if (bArrContextToBlob == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindBlob(2, bArrContextToBlob);
                }
                String strInstantToString = PerformanceMetricDao_Impl.this.__commonRoomConverters().instantToString(entity.getStartTimestamp());
                if (strInstantToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strInstantToString);
                }
                String strInstantToString2 = PerformanceMetricDao_Impl.this.__commonRoomConverters().instantToString(entity.getEndTimestamp());
                if (strInstantToString2 == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strInstantToString2);
                }
                PerformanceSpan.Key key = entity.getKey();
                String strUuidToString = PerformanceMetricDao_Impl.this.__commonRoomConverters().uuidToString(key.getMetricId());
                if (strUuidToString == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strUuidToString);
                }
                statement.bindText(6, key.getSpanName());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonRoomConverters __commonRoomConverters$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(CommonRoomConverters.class));
        if (typeConverter != null) {
            return (CommonRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceMetric2 __performanceMetricConverters$lambda$1(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(PerformanceMetric2.class));
        if (typeConverter != null) {
            return (PerformanceMetric2) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceSpan2 __performanceSpanConverters$lambda$2(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(PerformanceSpan2.class));
        if (typeConverter != null) {
            return (PerformanceSpan2) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object insert(final PerformanceMetric performanceMetric, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.insert$lambda$3(this.f$0, performanceMetric, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$3(PerformanceMetricDao_Impl performanceMetricDao_Impl, PerformanceMetric performanceMetric, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        performanceMetricDao_Impl.__insertAdapterOfPerformanceMetric.insert(_connection, (SQLiteConnection) performanceMetric);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object insert(final PerformanceSpan performanceSpan, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.insert$lambda$4(this.f$0, performanceSpan, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$4(PerformanceMetricDao_Impl performanceMetricDao_Impl, PerformanceSpan performanceSpan, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        performanceMetricDao_Impl.__insertAdapterOfPerformanceSpan.insert(_connection, (SQLiteConnection) performanceSpan);
        return Unit.INSTANCE;
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$onSessionUpdate$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$onSessionUpdate$2 */
    /* loaded from: classes24.dex */
    static final class C73352 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $sessionId;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73352(UUID uuid, Instant instant, Continuation<? super C73352> continuation) {
            super(1, continuation);
            this.$sessionId = uuid;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73352(this.$sessionId, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73352) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
                UUID uuid = this.$sessionId;
                Instant instant = this.$timestamp;
                this.label = 1;
                if (PerformanceMetricDao_Impl.super.onSessionUpdate(uuid, instant, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object onSessionUpdate(UUID uuid, Instant instant, Continuation<? super Unit> continuation) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new C73352(uuid, instant, null), continuation);
        return objPerformInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformInTransactionSuspending : Unit.INSTANCE;
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/analytics/models/PerformanceMetric;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$beginMetric$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$beginMetric$2 */
    /* loaded from: classes24.dex */
    static final class C73322 extends ContinuationImpl7 implements Function1<Continuation<? super PerformanceMetric>, Object> {
        final /* synthetic */ PerformanceMetricEventData.Context $context;
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ NetworkConnection $networkConnection;
        final /* synthetic */ PerformanceMetricEventData.Source $source;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73322(PerformanceMetric.Key key, PerformanceMetricEventData.Source source, PerformanceMetricEventData.Context context, NetworkConnection networkConnection, Instant instant, Continuation<? super C73322> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$source = source;
            this.$context = context;
            this.$networkConnection = networkConnection;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73322(this.$key, this.$source, this.$context, this.$networkConnection, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PerformanceMetric> continuation) {
            return ((C73322) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$key;
            PerformanceMetricEventData.Source source = this.$source;
            PerformanceMetricEventData.Context context = this.$context;
            NetworkConnection networkConnection = this.$networkConnection;
            Instant instant = this.$timestamp;
            this.label = 1;
            Object objBeginMetric = PerformanceMetricDao_Impl.super.beginMetric(key, source, context, networkConnection, instant, this);
            return objBeginMetric == coroutine_suspended ? coroutine_suspended : objBeginMetric;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object beginMetric(PerformanceMetric.Key key, PerformanceMetricEventData.Source source, PerformanceMetricEventData.Context context, NetworkConnection networkConnection, Instant instant, Continuation<? super PerformanceMetric> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73322(key, source, context, networkConnection, instant, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/analytics/models/PerformanceSpan;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$beginSpan$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {202}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$beginSpan$2 */
    /* loaded from: classes24.dex */
    static final class C73332 extends ContinuationImpl7 implements Function1<Continuation<? super PerformanceSpan>, Object> {
        final /* synthetic */ PerformanceMetricSpanEventData.Context $context;
        final /* synthetic */ PerformanceMetric.Key $metricKey;
        final /* synthetic */ String $spanName;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73332(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super C73332> continuation) {
            super(1, continuation);
            this.$metricKey = key;
            this.$spanName = str;
            this.$context = context;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73332(this.$metricKey, this.$spanName, this.$context, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PerformanceSpan> continuation) {
            return ((C73332) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$metricKey;
            String str = this.$spanName;
            PerformanceMetricSpanEventData.Context context = this.$context;
            Instant instant = this.$timestamp;
            this.label = 1;
            Object objBeginSpan = PerformanceMetricDao_Impl.super.beginSpan(key, str, context, instant, this);
            return objBeginSpan == coroutine_suspended ? coroutine_suspended : objBeginSpan;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object beginSpan(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super PerformanceSpan> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73332(key, str, context, instant, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/analytics/models/PerformanceSpan;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$beginSpan$4", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$beginSpan$4 */
    /* loaded from: classes24.dex */
    static final class C73344 extends ContinuationImpl7 implements Function1<Continuation<? super PerformanceSpan>, Object> {
        final /* synthetic */ PerformanceMetricSpanEventData.Context $context;
        final /* synthetic */ PerformanceSpan.Key $spanKey;
        final /* synthetic */ boolean $suppressWarnings;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73344(PerformanceSpan.Key key, PerformanceMetricSpanEventData.Context context, Instant instant, boolean z, Continuation<? super C73344> continuation) {
            super(1, continuation);
            this.$spanKey = key;
            this.$context = context;
            this.$timestamp = instant;
            this.$suppressWarnings = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73344(this.$spanKey, this.$context, this.$timestamp, this.$suppressWarnings, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PerformanceSpan> continuation) {
            return ((C73344) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceSpan.Key key = this.$spanKey;
            PerformanceMetricSpanEventData.Context context = this.$context;
            Instant instant = this.$timestamp;
            boolean z = this.$suppressWarnings;
            this.label = 1;
            Object objBeginSpan = PerformanceMetricDao_Impl.super.beginSpan(key, context, instant, z, this);
            return objBeginSpan == coroutine_suspended ? coroutine_suspended : objBeginSpan;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object beginSpan(PerformanceSpan.Key key, PerformanceMetricSpanEventData.Context context, Instant instant, boolean z, Continuation<? super PerformanceSpan> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73344(key, context, instant, z, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$skipSpan$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$skipSpan$2 */
    /* loaded from: classes24.dex */
    static final class C73382 extends ContinuationImpl7 implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ PerformanceMetricSpanEventData.Context $context;
        final /* synthetic */ PerformanceMetric.Key $metricKey;
        final /* synthetic */ String $spanName;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73382(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super C73382> continuation) {
            super(1, continuation);
            this.$metricKey = key;
            this.$spanName = str;
            this.$context = context;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73382(this.$metricKey, this.$spanName, this.$context, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C73382) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$metricKey;
            String str = this.$spanName;
            PerformanceMetricSpanEventData.Context context = this.$context;
            Instant instant = this.$timestamp;
            this.label = 1;
            Object objSkipSpan = PerformanceMetricDao_Impl.super.skipSpan(key, str, context, instant, this);
            return objSkipSpan == coroutine_suspended ? coroutine_suspended : objSkipSpan;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object skipSpan(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73382(key, str, context, instant, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$pauseMetric$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$pauseMetric$2 */
    /* loaded from: classes24.dex */
    static final class C73362 extends ContinuationImpl7 implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73362(PerformanceMetric.Key key, Instant instant, Continuation<? super C73362> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73362(this.$key, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C73362) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$key;
            Instant instant = this.$timestamp;
            this.label = 1;
            Object objPauseMetric = PerformanceMetricDao_Impl.super.pauseMetric(key, instant, this);
            return objPauseMetric == coroutine_suspended ? coroutine_suspended : objPauseMetric;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object pauseMetric(PerformanceMetric.Key key, Instant instant, Continuation<? super Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73362(key, instant, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$resumeMetric$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$resumeMetric$2 */
    /* loaded from: classes24.dex */
    static final class C73372 extends ContinuationImpl7 implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73372(PerformanceMetric.Key key, Instant instant, Continuation<? super C73372> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73372(this.$key, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C73372) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$key;
            Instant instant = this.$timestamp;
            this.label = 1;
            Object objResumeMetric = PerformanceMetricDao_Impl.super.resumeMetric(key, instant, this);
            return objResumeMetric == coroutine_suspended ? coroutine_suspended : objResumeMetric;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object resumeMetric(PerformanceMetric.Key key, Instant instant, Continuation<? super Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73372(key, instant, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateMetric$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateMetric$2 */
    /* loaded from: classes24.dex */
    static final class C73392 extends ContinuationImpl7 implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ PerformanceMetricEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73392(PerformanceMetric.Key key, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super C73392> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$timestamp = instant;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73392(this.$key, this.$timestamp, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C73392) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$key;
            Instant instant = this.$timestamp;
            PerformanceMetricEventData.Status status = this.$status;
            this.label = 1;
            Object objTerminateMetric = PerformanceMetricDao_Impl.super.terminateMetric(key, instant, status, this);
            return objTerminateMetric == coroutine_suspended ? coroutine_suspended : objTerminateMetric;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object terminateMetric(PerformanceMetric.Key key, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73392(key, instant, status, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateSpans$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateSpans$2 */
    /* loaded from: classes24.dex */
    static final class C73422 extends ContinuationImpl7 implements Function1<Continuation<? super Integer>, Object> {
        final /* synthetic */ UUID $metricId;
        final /* synthetic */ String $spanName;
        final /* synthetic */ PerformanceMetricSpanEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73422(UUID uuid, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super C73422> continuation) {
            super(1, continuation);
            this.$metricId = uuid;
            this.$spanName = str;
            this.$timestamp = instant;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73422(this.$metricId, this.$spanName, this.$timestamp, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Integer> continuation) {
            return ((C73422) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            UUID uuid = this.$metricId;
            String str = this.$spanName;
            Instant instant = this.$timestamp;
            PerformanceMetricSpanEventData.Status status = this.$status;
            this.label = 1;
            Object objTerminateSpans = PerformanceMetricDao_Impl.super.terminateSpans(uuid, str, instant, status, this);
            return objTerminateSpans == coroutine_suspended ? coroutine_suspended : objTerminateSpans;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object terminateSpans(UUID uuid, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super Integer> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73422(uuid, str, instant, status, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateSpan$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateSpan$2 */
    /* loaded from: classes24.dex */
    static final class C73412 extends ContinuationImpl7 implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ PerformanceMetric.Key $metricKey;
        final /* synthetic */ String $spanName;
        final /* synthetic */ PerformanceMetricSpanEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73412(PerformanceMetric.Key key, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super C73412> continuation) {
            super(1, continuation);
            this.$metricKey = key;
            this.$spanName = str;
            this.$timestamp = instant;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73412(this.$metricKey, this.$spanName, this.$timestamp, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C73412) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            PerformanceMetric.Key key = this.$metricKey;
            String str = this.$spanName;
            Instant instant = this.$timestamp;
            PerformanceMetricSpanEventData.Status status = this.$status;
            this.label = 1;
            Object objTerminateSpan = PerformanceMetricDao_Impl.super.terminateSpan(key, str, instant, status, this);
            return objTerminateSpan == coroutine_suspended ? coroutine_suspended : objTerminateSpan;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object terminateSpan(PerformanceMetric.Key key, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73412(key, str, instant, status, null), continuation);
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateMetricByEvent$2", m3645f = "PerformanceMetricDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$terminateMetricByEvent$2 */
    /* loaded from: classes24.dex */
    static final class C73402 extends ContinuationImpl7 implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ ContextActionEvent $event;
        final /* synthetic */ UUID $sessionId;
        final /* synthetic */ PerformanceMetricEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73402(ContextActionEvent contextActionEvent, UUID uuid, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super C73402> continuation) {
            super(1, continuation);
            this.$event = contextActionEvent;
            this.$sessionId = uuid;
            this.$timestamp = instant;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PerformanceMetricDao_Impl.this.new C73402(this.$event, this.$sessionId, this.$timestamp, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C73402) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            PerformanceMetricDao_Impl performanceMetricDao_Impl = PerformanceMetricDao_Impl.this;
            ContextActionEvent contextActionEvent = this.$event;
            UUID uuid = this.$sessionId;
            Instant instant = this.$timestamp;
            PerformanceMetricEventData.Status status = this.$status;
            this.label = 1;
            Object objTerminateMetricByEvent = PerformanceMetricDao_Impl.super.terminateMetricByEvent(contextActionEvent, uuid, instant, status, this);
            return objTerminateMetricByEvent == coroutine_suspended ? coroutine_suspended : objTerminateMetricByEvent;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object terminateMetricByEvent(ContextActionEvent contextActionEvent, UUID uuid, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new C73402(contextActionEvent, uuid, instant, status, null), continuation);
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object queryAll$lib_analytics_externalRelease(Continuation<? super List<? extends Tuples2<PerformanceMetric, ? extends List<PerformanceSpan>>>> continuation) {
        return DBUtil.performInTransactionSuspending(this.__db, new PerformanceMetricDao_Impl2(this, null), continuation);
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object findIncompleteMetricIds(final UUID uuid, Continuation<? super List<UUID>> continuation) {
        final String str = "\n        SELECT id\n        FROM PerformanceMetric\n        WHERE (? IS NULL OR key_sessionId != ?)\n        AND status = 0\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findIncompleteMetricIds$lambda$5(str, this, uuid, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List findIncompleteMetricIds$lambda$5(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, UUID uuid, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            String strUuidToString2 = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strUuidToString2);
            }
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                arrayList.add(uuidStringToUuid);
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object findIncompleteSpanKeys(final Set<UUID> set, Continuation<? super List<PerformanceSpan.Key>> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT key_metricId AS metricId, key_spanName AS spanName");
        sb.append("\n");
        sb.append("        FROM PerformanceSpan");
        sb.append("\n");
        sb.append("        WHERE (key_metricId IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append("))");
        sb.append("\n");
        sb.append("        AND status = 0");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findIncompleteSpanKeys$lambda$6(string2, set, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List findIncompleteSpanKeys$lambda$6(String str, Set set, PerformanceMetricDao_Impl performanceMetricDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i = 1;
            while (it.hasNext()) {
                String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
                if (strUuidToString == null) {
                    sQLiteStatementPrepare.bindNull(i);
                } else {
                    sQLiteStatementPrepare.bindText(i, strUuidToString);
                }
                i++;
            }
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                arrayList.add(new PerformanceSpan.Key(uuidStringToUuid, sQLiteStatementPrepare.getText(1)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object findTerminatedMetrics$lib_analytics_externalRelease(Continuation<? super List<PerformanceMetric>> continuation) {
        final String str = " \n        SELECT * FROM PerformanceMetric\n        WHERE status > 0\n        ORDER BY startTimestamp ASC, endTimestamp ASC\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findTerminatedMetrics$lambda$7(str, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List findTerminatedMetrics$lambda$7(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, SQLiteConnection _connection) {
        int i;
        int i2;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "context");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "networkConnection");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTimestamp");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTimestamp");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pauses");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_sessionId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_metricName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_contextualId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                PerformanceMetricEventData.Source sourceValueToMetricSource = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricSource(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                if (sourceValueToMetricSource == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Source', but it was NULL.");
                }
                PerformanceMetricEventData.Context contextBlobToMetricContext = performanceMetricDao_Impl.__performanceMetricConverters().blobToMetricContext(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow3));
                if (contextBlobToMetricContext == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Context', but it was NULL.");
                }
                NetworkConnection networkConnectionBytesToNetworkConnection = performanceMetricDao_Impl.__performanceMetricConverters().bytesToNetworkConnection(sQLiteStatementPrepare.getBlob(columnIndexOrThrow4));
                PerformanceMetricEventData.Status statusValueToMetricStatus = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                if (statusValueToMetricStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Status', but it was NULL.");
                }
                Instant instantStringToInstant = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                Instant instantStringToInstant2 = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                List<PerformanceMetric.Pause> listStringToPauseList = performanceMetricDao_Impl.__performanceMetricConverters().stringToPauseList(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (listStringToPauseList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.analytics.models.PerformanceMetric.Pause>', but it was NULL.");
                }
                UUID uuidStringToUuid2 = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                }
                PerformanceMetricEventData.Name nameValueToMetricName = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricName(numValueOf);
                if (nameValueToMetricName == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Name', but it was NULL.");
                }
                arrayList.add(new PerformanceMetric(uuidStringToUuid, new PerformanceMetric.Key(uuidStringToUuid2, nameValueToMetricName, performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11))), sourceValueToMetricSource, contextBlobToMetricContext, networkConnectionBytesToNetworkConnection, statusValueToMetricStatus, instantStringToInstant, instantStringToInstant2, listStringToPauseList));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object findMetric(final UUID uuid, final PerformanceMetricEventData.Name name, final UUID uuid2, final PerformanceMetricEventData.Status status, Continuation<? super PerformanceMetric> continuation) {
        final String str = " \n        SELECT * FROM PerformanceMetric\n        WHERE key_sessionId IS ?\n        AND key_metricName IS ?\n        AND key_contextualId IS ?\n        AND (? IS NULL OR status = ?)\n        ORDER BY startTimestamp DESC\n        LIMIT 1\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findMetric$lambda$8(str, this, uuid, name, uuid2, status, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceMetric findMetric$lambda$8(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, UUID uuid, PerformanceMetricEventData.Name name, UUID uuid2, PerformanceMetricEventData.Status status, SQLiteConnection _connection) {
        PerformanceMetric performanceMetric;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricNameToValue(name) == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindLong(2, r2.intValue());
            }
            String strUuidToString2 = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid2);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, strUuidToString2);
            }
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricStatusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(4);
            } else {
                sQLiteStatementPrepare.bindLong(4, r2.intValue());
            }
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricStatusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(5);
            } else {
                sQLiteStatementPrepare.bindLong(5, r0.intValue());
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "context");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "networkConnection");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTimestamp");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTimestamp");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pauses");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_sessionId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_metricName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_contextualId");
            if (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                PerformanceMetricEventData.Source sourceValueToMetricSource = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricSource(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                if (sourceValueToMetricSource == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Source', but it was NULL.");
                }
                PerformanceMetricEventData.Context contextBlobToMetricContext = performanceMetricDao_Impl.__performanceMetricConverters().blobToMetricContext(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow3));
                if (contextBlobToMetricContext == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Context', but it was NULL.");
                }
                NetworkConnection networkConnectionBytesToNetworkConnection = performanceMetricDao_Impl.__performanceMetricConverters().bytesToNetworkConnection(sQLiteStatementPrepare.getBlob(columnIndexOrThrow4));
                PerformanceMetricEventData.Status statusValueToMetricStatus = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                if (statusValueToMetricStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Status', but it was NULL.");
                }
                Instant instantStringToInstant = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                Instant instantStringToInstant2 = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                List<PerformanceMetric.Pause> listStringToPauseList = performanceMetricDao_Impl.__performanceMetricConverters().stringToPauseList(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (listStringToPauseList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.analytics.models.PerformanceMetric.Pause>', but it was NULL.");
                }
                UUID uuidStringToUuid2 = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                PerformanceMetricEventData.Name nameValueToMetricName = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricName(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)));
                if (nameValueToMetricName == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Name', but it was NULL.");
                }
                performanceMetric = new PerformanceMetric(uuidStringToUuid, new PerformanceMetric.Key(uuidStringToUuid2, nameValueToMetricName, performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11))), sourceValueToMetricSource, contextBlobToMetricContext, networkConnectionBytesToNetworkConnection, statusValueToMetricStatus, instantStringToInstant, instantStringToInstant2, listStringToPauseList);
            } else {
                performanceMetric = null;
            }
            sQLiteStatementPrepare.close();
            return performanceMetric;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object findSpan(final UUID uuid, final String str, final PerformanceMetricSpanEventData.Status status, Continuation<? super PerformanceSpan> continuation) {
        final String str2 = " \n        SELECT * FROM PerformanceSpan\n        WHERE key_metricId IS ?\n        AND key_spanName IS ?\n        AND (? IS NULL OR status = ?)\n        ORDER BY startTimestamp DESC\n        LIMIT 1\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findSpan$lambda$9(str2, this, uuid, str, status, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceSpan findSpan$lambda$9(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, UUID uuid, String str2, PerformanceMetricSpanEventData.Status status, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            sQLiteStatementPrepare.bindText(2, str2);
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindLong(3, r12.intValue());
            }
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(4);
            } else {
                sQLiteStatementPrepare.bindLong(4, r12.intValue());
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "context");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTimestamp");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTimestamp");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_metricId");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_spanName");
            PerformanceSpan performanceSpan = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                PerformanceMetricSpanEventData.Status statusValueToStatus = performanceMetricDao_Impl.__performanceSpanConverters().valueToStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow)));
                if (statusValueToStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData.Status', but it was NULL.");
                }
                PerformanceMetricSpanEventData.Context contextBlobToContext = performanceMetricDao_Impl.__performanceSpanConverters().blobToContext(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                if (contextBlobToContext == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData.Context', but it was NULL.");
                }
                Instant instantStringToInstant = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                Instant instantStringToInstant2 = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(text);
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                performanceSpan = new PerformanceSpan(new PerformanceSpan.Key(uuidStringToUuid, sQLiteStatementPrepare.getText(columnIndexOrThrow6)), statusValueToStatus, contextBlobToContext, instantStringToInstant, instantStringToInstant2);
            }
            sQLiteStatementPrepare.close();
            return performanceSpan;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object findSpans$lib_analytics_externalRelease(final UUID uuid, final PerformanceMetricSpanEventData.Status status, Continuation<? super List<PerformanceSpan>> continuation) {
        final String str = " \n        SELECT * FROM PerformanceSpan\n        WHERE key_metricId IS ?\n        AND (? IS NULL OR status = ?)\n        ORDER BY startTimestamp ASC, endTimestamp ASC\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findSpans$lambda$10(str, this, uuid, status, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List findSpans$lambda$10(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, UUID uuid, PerformanceMetricSpanEventData.Status status, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindLong(2, r2.intValue());
            }
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindLong(3, r0.intValue());
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "context");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTimestamp");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTimestamp");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_metricId");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_spanName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                PerformanceMetricSpanEventData.Status statusValueToStatus = performanceMetricDao_Impl.__performanceSpanConverters().valueToStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow)));
                if (statusValueToStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData.Status', but it was NULL.");
                }
                PerformanceMetricSpanEventData.Context contextBlobToContext = performanceMetricDao_Impl.__performanceSpanConverters().blobToContext(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                if (contextBlobToContext == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData.Context', but it was NULL.");
                }
                Instant instantStringToInstant = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                Instant instantStringToInstant2 = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(text);
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                arrayList.add(new PerformanceSpan(new PerformanceSpan.Key(uuidStringToUuid, sQLiteStatementPrepare.getText(columnIndexOrThrow6)), statusValueToStatus, contextBlobToContext, instantStringToInstant, instantStringToInstant2));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object findMetrics(final UUID uuid, final PerformanceMetricEventData.Name name, final PerformanceMetricEventData.Status status, Continuation<? super List<PerformanceMetric>> continuation) {
        final String str = "\n        SELECT * FROM PerformanceMetric\n        WHERE key_sessionId IS ?\n        AND key_metricName IS ?\n        AND (? IS NULL OR status = ?)\n        ORDER BY startTimestamp DESC\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.findMetrics$lambda$11(str, this, uuid, name, status, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List findMetrics$lambda$11(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, UUID uuid, PerformanceMetricEventData.Name name, PerformanceMetricEventData.Status status, SQLiteConnection _connection) {
        int i;
        int i2;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricNameToValue(name) == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindLong(2, r2.intValue());
            }
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricStatusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindLong(3, r2.intValue());
            }
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricStatusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(4);
            } else {
                sQLiteStatementPrepare.bindLong(4, r0.intValue());
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "context");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "networkConnection");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTimestamp");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTimestamp");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pauses");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_sessionId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_metricName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_contextualId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                PerformanceMetricEventData.Source sourceValueToMetricSource = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricSource(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                if (sourceValueToMetricSource == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Source', but it was NULL.");
                }
                PerformanceMetricEventData.Context contextBlobToMetricContext = performanceMetricDao_Impl.__performanceMetricConverters().blobToMetricContext(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow3));
                if (contextBlobToMetricContext == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Context', but it was NULL.");
                }
                NetworkConnection networkConnectionBytesToNetworkConnection = performanceMetricDao_Impl.__performanceMetricConverters().bytesToNetworkConnection(sQLiteStatementPrepare.getBlob(columnIndexOrThrow4));
                PerformanceMetricEventData.Status statusValueToMetricStatus = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                if (statusValueToMetricStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Status', but it was NULL.");
                }
                Instant instantStringToInstant = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                Instant instantStringToInstant2 = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                List<PerformanceMetric.Pause> listStringToPauseList = performanceMetricDao_Impl.__performanceMetricConverters().stringToPauseList(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (listStringToPauseList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.analytics.models.PerformanceMetric.Pause>', but it was NULL.");
                }
                UUID uuidStringToUuid2 = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                }
                PerformanceMetricEventData.Name nameValueToMetricName = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricName(numValueOf);
                if (nameValueToMetricName == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Name', but it was NULL.");
                }
                arrayList.add(new PerformanceMetric(uuidStringToUuid, new PerformanceMetric.Key(uuidStringToUuid2, nameValueToMetricName, performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11))), sourceValueToMetricSource, contextBlobToMetricContext, networkConnectionBytesToNetworkConnection, statusValueToMetricStatus, instantStringToInstant, instantStringToInstant2, listStringToPauseList));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object getAllMetrics(Continuation<? super List<PerformanceMetric>> continuation) {
        final String str = "SELECT * FROM PerformanceMetric ORDER BY startTimestamp ASC, endTimestamp ASC";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceMetricDao_Impl.getAllMetrics$lambda$12(str, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllMetrics$lambda$12(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, SQLiteConnection _connection) {
        int i;
        int i2;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "context");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "networkConnection");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTimestamp");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTimestamp");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pauses");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_sessionId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_metricName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_contextualId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                PerformanceMetricEventData.Source sourceValueToMetricSource = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricSource(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                if (sourceValueToMetricSource == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Source', but it was NULL.");
                }
                PerformanceMetricEventData.Context contextBlobToMetricContext = performanceMetricDao_Impl.__performanceMetricConverters().blobToMetricContext(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow3));
                if (contextBlobToMetricContext == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Context', but it was NULL.");
                }
                NetworkConnection networkConnectionBytesToNetworkConnection = performanceMetricDao_Impl.__performanceMetricConverters().bytesToNetworkConnection(sQLiteStatementPrepare.getBlob(columnIndexOrThrow4));
                PerformanceMetricEventData.Status statusValueToMetricStatus = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                if (statusValueToMetricStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Status', but it was NULL.");
                }
                Instant instantStringToInstant = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                Instant instantStringToInstant2 = performanceMetricDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                List<PerformanceMetric.Pause> listStringToPauseList = performanceMetricDao_Impl.__performanceMetricConverters().stringToPauseList(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (listStringToPauseList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.analytics.models.PerformanceMetric.Pause>', but it was NULL.");
                }
                UUID uuidStringToUuid2 = performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                }
                PerformanceMetricEventData.Name nameValueToMetricName = performanceMetricDao_Impl.__performanceMetricConverters().valueToMetricName(numValueOf);
                if (nameValueToMetricName == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.PerformanceMetricEventData.Name', but it was NULL.");
                }
                arrayList.add(new PerformanceMetric(uuidStringToUuid, new PerformanceMetric.Key(uuidStringToUuid2, nameValueToMetricName, performanceMetricDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11))), sourceValueToMetricSource, contextBlobToMetricContext, networkConnectionBytesToNetworkConnection, statusValueToMetricStatus, instantStringToInstant, instantStringToInstant2, listStringToPauseList));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object updateMetricPause(final UUID uuid, final List<PerformanceMetric.Pause> list, Continuation<? super Integer> continuation) {
        final String str = "\n        UPDATE PerformanceMetric\n        SET pauses = ?\n        WHERE id = ?\n        ";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PerformanceMetricDao_Impl.updateMetricPause$lambda$13(str, this, list, uuid, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateMetricPause$lambda$13(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, List list, UUID uuid, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strPauseListToString = performanceMetricDao_Impl.__performanceMetricConverters().pauseListToString(list);
            if (strPauseListToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strPauseListToString);
            }
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strUuidToString);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object updateMetric(final UUID uuid, final PerformanceMetricEventData.Status status, final Instant instant, Continuation<? super Integer> continuation) {
        final String str = "\n        UPDATE PerformanceMetric\n        SET status = ?, endTimestamp = ?\n        WHERE id = ?\n        ";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PerformanceMetricDao_Impl.updateMetric$lambda$14(str, this, status, instant, uuid, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateMetric$lambda$14(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, PerformanceMetricEventData.Status status, Instant instant, UUID uuid, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            if (performanceMetricDao_Impl.__performanceMetricConverters().metricStatusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindLong(1, r5.intValue());
            }
            String strInstantToString = performanceMetricDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strInstantToString);
            }
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, strUuidToString);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object updateSpans(final UUID uuid, final String str, final PerformanceMetricSpanEventData.Status status, final PerformanceMetricSpanEventData.Status status2, final Instant instant, Continuation<? super Integer> continuation) {
        final String str2 = "\n        UPDATE PerformanceSpan\n        SET status = ?, endTimestamp = ?\n        WHERE key_metricId = ?\n        AND (? IS NULL OR status = ?)\n        AND (? IS NULL OR key_spanName = ?)\n        ";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PerformanceMetricDao_Impl.updateSpans$lambda$15(str2, this, status2, instant, uuid, status, str, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSpans$lambda$15(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, PerformanceMetricSpanEventData.Status status, Instant instant, UUID uuid, PerformanceMetricSpanEventData.Status status2, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status) == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindLong(1, r5.intValue());
            }
            String strInstantToString = performanceMetricDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strInstantToString);
            }
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, strUuidToString);
            }
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status2) == null) {
                sQLiteStatementPrepare.bindNull(4);
            } else {
                sQLiteStatementPrepare.bindLong(4, r5.intValue());
            }
            if (performanceMetricDao_Impl.__performanceSpanConverters().statusToValue(status2) == null) {
                sQLiteStatementPrepare.bindNull(5);
            } else {
                sQLiteStatementPrepare.bindLong(5, r4.intValue());
            }
            if (str2 == null) {
                sQLiteStatementPrepare.bindNull(6);
            } else {
                sQLiteStatementPrepare.bindText(6, str2);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.bindNull(7);
            } else {
                sQLiteStatementPrepare.bindText(7, str2);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object abortIncompleteMetrics(final UUID uuid, final Instant instant, Continuation<? super Integer> continuation) {
        final String str = "\n        UPDATE PerformanceMetric\n        SET status = 3, endTimestamp = ?\n        WHERE (? IS NULL OR key_sessionId != ?)\n        AND status = 0\n        ";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PerformanceMetricDao_Impl.abortIncompleteMetrics$lambda$16(str, this, instant, uuid, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int abortIncompleteMetrics$lambda$16(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, Instant instant, UUID uuid, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strInstantToString = performanceMetricDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strInstantToString);
            }
            String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strUuidToString);
            }
            String strUuidToString2 = performanceMetricDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, strUuidToString2);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    protected Object abortIncompleteSpans(final Set<UUID> set, final Instant instant, Continuation<? super Integer> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        UPDATE PerformanceSpan");
        sb.append("\n");
        sb.append("        SET status = 3, endTimestamp = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        WHERE (key_metricId IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append("))");
        sb.append("\n");
        sb.append("        AND status = 0");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PerformanceMetricDao_Impl.abortIncompleteSpans$lambda$17(string2, this, instant, set, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int abortIncompleteSpans$lambda$17(String str, PerformanceMetricDao_Impl performanceMetricDao_Impl, Instant instant, Set set, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strInstantToString = performanceMetricDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strInstantToString);
            }
            Iterator it = set.iterator();
            int i = 2;
            while (it.hasNext()) {
                String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
                if (strUuidToString == null) {
                    sQLiteStatementPrepare.bindNull(i);
                } else {
                    sQLiteStatementPrepare.bindText(i, strUuidToString);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.PerformanceMetricDao
    public Object deleteMetrics$lib_analytics_externalRelease(final Set<UUID> set, Continuation<? super Integer> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append("\n");
        sb.append("        DELETE FROM PerformanceMetric");
        sb.append("\n");
        sb.append("        WHERE id IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(")");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.PerformanceMetricDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PerformanceMetricDao_Impl.deleteMetrics$lambda$18(string2, set, this, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteMetrics$lambda$18(String str, Set set, PerformanceMetricDao_Impl performanceMetricDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i = 1;
            while (it.hasNext()) {
                String strUuidToString = performanceMetricDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
                if (strUuidToString == null) {
                    sQLiteStatementPrepare.bindNull(i);
                } else {
                    sQLiteStatementPrepare.bindText(i, strUuidToString);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PerformanceMetric2 __performanceMetricConverters() {
        return this.__performanceMetricConverters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PerformanceSpan2 __performanceSpanConverters() {
        return this.__performanceSpanConverters.getValue();
    }

    /* compiled from: PerformanceMetricDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/analytics/dao/PerformanceMetricDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(CommonRoomConverters.class), Reflection.getOrCreateKotlinClass(PerformanceMetric2.class), Reflection.getOrCreateKotlinClass(PerformanceSpan2.class)});
        }
    }
}
