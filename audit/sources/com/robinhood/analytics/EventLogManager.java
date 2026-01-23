package com.robinhood.analytics;

import android.annotation.SuppressLint;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import com.robinhood.analytics.api.AnalyticsApi;
import com.robinhood.analytics.dao.SharedEventLogDao;
import com.robinhood.analytics.dao.SharedEventLogDatabase;
import com.robinhood.analytics.models.SharedEventLog;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.Throwables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;
import timber.log.Timber;

/* compiled from: EventLogManager.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 ,*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u00020\u0005:\u0001,B3\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0083@¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00028\u00022\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00028\u0002H&¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/analytics/EventLogManager;", "LoggingEvent", "Lcom/robinhood/analytics/models/SharedEventLog;", "EventLog", "LoggingEventBatch", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "eventLogDatabase", "Lcom/robinhood/analytics/api/AnalyticsApi;", "analyticsApi", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/dao/SharedEventLogDatabase;Lcom/robinhood/analytics/api/AnalyticsApi;)V", "", "upload", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loggingEvent", "j$/time/Instant", "timestamp", "", "triggerUpload", "uploadImmediate", "send", "(Ljava/lang/Object;Lj$/time/Instant;ZZ)V", "record", "(Ljava/lang/Object;Lj$/time/Instant;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "eventLogs", "createEventBatch", "(Ljava/util/List;)Ljava/lang/Object;", "batch", "", "getBatchSize", "(Ljava/lang/Object;)I", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "Lcom/robinhood/analytics/api/AnalyticsApi;", "Lcom/robinhood/analytics/dao/SharedEventLogDao;", "dao", "Lcom/robinhood/analytics/dao/SharedEventLogDao;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "triggerFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class EventLogManager<LoggingEvent, EventLog extends SharedEventLog<? extends LoggingEvent>, LoggingEventBatch> {
    private static final long MAX_BATCH_WAIT_DURATION_MS = 10000;
    private static final int MAX_EVENT_LIMIT_IN_BATCH = 100;
    private final AnalyticsApi<LoggingEventBatch> analyticsApi;
    private final CoroutineScope coroutineScope;
    private final SharedEventLogDao<LoggingEvent, EventLog> dao;
    private final SharedEventLogDatabase<LoggingEvent, EventLog> eventLogDatabase;
    private final SharedFlow2<Unit> triggerFlow;

    /* compiled from: EventLogManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.EventLogManager", m3645f = "EventLogManager.kt", m3646l = {75, 77}, m3647m = "record$suspendImpl")
    /* renamed from: com.robinhood.analytics.EventLogManager$record$1 */
    /* loaded from: classes24.dex */
    static final class C73091<LoggingEvent, EventLog extends SharedEventLog<? extends LoggingEvent>, LoggingEventBatch> extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73091(EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, Continuation<? super C73091> continuation) {
            super(continuation);
            this.this$0 = eventLogManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventLogManager.record$suspendImpl(this.this$0, null, null, false, false, this);
        }
    }

    /* renamed from: createEventBatch */
    public abstract LoggingEventBatch createEventBatch2(List<? extends SharedEventLog<? extends LoggingEvent>> eventLogs);

    public abstract int getBatchSize(LoggingEventBatch batch);

    public Object record(LoggingEvent loggingevent, Instant instant, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        return record$suspendImpl(this, loggingevent, instant, z, z2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventLogManager(@RootCoroutineScope CoroutineScope coroutineScope, SharedEventLogDatabase<LoggingEvent, EventLog> eventLogDatabase, AnalyticsApi<? super LoggingEventBatch> analyticsApi) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.coroutineScope = coroutineScope;
        this.eventLogDatabase = eventLogDatabase;
        this.analyticsApi = analyticsApi;
        this.dao = eventLogDatabase.eventLogDao();
        SharedFlow2<Unit> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this.triggerFlow = sharedFlow2MutableSharedFlow$default;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.sample(sharedFlow2MutableSharedFlow$default, 10000L), new C73081(this, null)), coroutineScope);
    }

    /* compiled from: EventLogManager.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.EventLogManager$1", m3645f = "EventLogManager.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.EventLogManager$1 */
    static final class C73081 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73081(EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, Continuation<? super C73081> continuation) {
            super(2, continuation);
            this.this$0 = eventLogManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C73081(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C73081) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager = this.this$0;
                this.label = 1;
                if (eventLogManager.upload(this) == coroutine_suspended) {
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

    public static /* synthetic */ void send$default(EventLogManager eventLogManager, Object obj, Instant instant, boolean z, boolean z2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        eventLogManager.send(obj, instant, z, z2);
    }

    /* compiled from: EventLogManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.EventLogManager$send$1", m3645f = "EventLogManager.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.EventLogManager$send$1 */
    static final class C73101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LoggingEvent $loggingEvent;
        final /* synthetic */ Instant $timestamp;
        final /* synthetic */ boolean $triggerUpload;
        final /* synthetic */ boolean $uploadImmediate;
        int label;
        final /* synthetic */ EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73101(EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, LoggingEvent loggingevent, Instant instant, boolean z, boolean z2, Continuation<? super C73101> continuation) {
            super(2, continuation);
            this.this$0 = eventLogManager;
            this.$loggingEvent = loggingevent;
            this.$timestamp = instant;
            this.$triggerUpload = z;
            this.$uploadImmediate = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C73101(this.this$0, this.$loggingEvent, this.$timestamp, this.$triggerUpload, this.$uploadImmediate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C73101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager = this.this$0;
                LoggingEvent loggingevent = this.$loggingEvent;
                Instant instant = this.$timestamp;
                boolean z = this.$triggerUpload;
                boolean z2 = this.$uploadImmediate;
                this.label = 1;
                if (eventLogManager.record(loggingevent, instant, z, z2, this) == coroutine_suspended) {
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

    public final void send(LoggingEvent loggingEvent, Instant timestamp, boolean triggerUpload, boolean uploadImmediate) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C73101(this, loggingEvent, timestamp, triggerUpload, uploadImmediate, null), 3, null);
    }

    public static /* synthetic */ Object record$default(EventLogManager eventLogManager, Object obj, Instant instant, boolean z, boolean z2, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return eventLogManager.record(obj, instant, z3, z2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <LoggingEvent, EventLog extends SharedEventLog<? extends LoggingEvent>, LoggingEventBatch> Object record$suspendImpl(EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, LoggingEvent loggingevent, Instant instant, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        C73091 c73091;
        EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager2;
        boolean z3;
        if (continuation instanceof C73091) {
            c73091 = (C73091) continuation;
            int i = c73091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73091.label = i - Integer.MIN_VALUE;
            } else {
                c73091 = new C73091(eventLogManager, continuation);
            }
        }
        Object obj = c73091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedEventLogDao<LoggingEvent, EventLog> sharedEventLogDao = ((EventLogManager) eventLogManager).dao;
            c73091.L$0 = eventLogManager;
            c73091.Z$0 = z;
            c73091.Z$1 = z2;
            c73091.label = 1;
            if (sharedEventLogDao.insert(loggingevent, instant, c73091) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = c73091.Z$0;
            eventLogManager2 = (EventLogManager) c73091.L$0;
            ResultKt.throwOnFailure(obj);
            z = z3;
            eventLogManager = eventLogManager2;
            if (z || ((EventLogManager) eventLogManager).triggerFlow.tryEmit(Unit.INSTANCE)) {
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("Check failed.");
        }
        z2 = c73091.Z$1;
        z = c73091.Z$0;
        eventLogManager = (EventLogManager) c73091.L$0;
        ResultKt.throwOnFailure(obj);
        if (z && z2) {
            c73091.L$0 = eventLogManager;
            c73091.Z$0 = z;
            c73091.label = 2;
            if (eventLogManager.upload(c73091) != coroutine_suspended) {
                eventLogManager2 = eventLogManager;
                z3 = z;
                z = z3;
                eventLogManager = eventLogManager2;
            }
            return coroutine_suspended;
        }
        if (z) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EventLogManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.EventLogManager$upload$2", m3645f = "EventLogManager.kt", m3646l = {87, 88, 100, 103}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.analytics.EventLogManager$upload$2 */
    /* loaded from: classes24.dex */
    static final class C73112 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73112(EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, Continuation<? super C73112> continuation) {
            super(1, continuation);
            this.this$0 = eventLogManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C73112(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73112) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
        
            if (r1.delete(r11, r10) != r0) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[Catch: all -> 0x0019, LOOP:0: B:35:0x00e1->B:37:0x00e7, LOOP_END, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x010b, B:44:0x011a, B:45:0x0121, B:15:0x0028, B:34:0x00d0, B:35:0x00e1, B:37:0x00e7, B:38:0x00f5, B:30:0x008b), top: B:52:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            List<? extends SharedEventLog<? extends LoggingEvent>> list;
            List<? extends SharedEventLog<? extends LoggingEvent>> list2;
            Iterator<T> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    Timber.INSTANCE.mo3353e("Upload failed: %s", th.getMessage());
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedEventLogDao sharedEventLogDao = ((EventLogManager) this.this$0).dao;
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                Instant instantMinus = instantNow.minus((TemporalAmount) Days.m3991of(1));
                Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
                this.label = 1;
                obj = sharedEventLogDao.deleteOldItems(instantMinus, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                iIntValue = this.I$0;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (!list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                LoggingEventBatch loggingeventbatchCreateEventBatch = this.this$0.createEventBatch2(list);
                Timber.INSTANCE.mo3356i("Filtered LoggingEventBatch count: " + list.size() + " | Deleted old LoggingEventBatch count: " + iIntValue + " | size(byte): " + this.this$0.getBatchSize(loggingeventbatchCreateEventBatch), new Object[0]);
                AnalyticsApi analyticsApi = ((EventLogManager) this.this$0).analyticsApi;
                this.L$0 = list;
                this.label = 3;
                if (analyticsApi.track(loggingeventbatchCreateEventBatch, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                List<? extends SharedEventLog<? extends LoggingEvent>> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                }
                Set<UUID> set = CollectionsKt.toSet(arrayList);
                SharedEventLogDao sharedEventLogDao2 = ((EventLogManager) this.this$0).dao;
                this.L$0 = null;
                this.label = 4;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (((EventLogManager) this.this$0).triggerFlow.tryEmit(Unit.INSTANCE)) {
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                List<? extends SharedEventLog<? extends LoggingEvent>> list32 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
                it = list32.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((SharedEventLog) it.next()).getId());
                }
                Set<UUID> set2 = CollectionsKt.toSet(arrayList2);
                SharedEventLogDao sharedEventLogDao22 = ((EventLogManager) this.this$0).dao;
                this.L$0 = null;
                this.label = 4;
            }
            iIntValue = ((Number) obj).intValue();
            SharedEventLogDao sharedEventLogDao3 = ((EventLogManager) this.this$0).dao;
            this.I$0 = iIntValue;
            this.label = 2;
            obj = sharedEventLogDao3.get(100, this);
            if (obj != coroutine_suspended) {
                list = (List) obj;
                if (!list.isEmpty()) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BinaryOperationInTimber"})
    public final Object upload(Continuation<? super Unit> continuation) {
        SharedEventLogDatabase<LoggingEvent, EventLog> sharedEventLogDatabase = this.eventLogDatabase;
        Intrinsics.checkNotNull(sharedEventLogDatabase, "null cannot be cast to non-null type androidx.room.RoomDatabase");
        Object objWithTransaction = RoomDatabaseKt.withTransaction((RoomDatabase) sharedEventLogDatabase, new C73112(this, null), continuation);
        return objWithTransaction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithTransaction : Unit.INSTANCE;
    }
}
