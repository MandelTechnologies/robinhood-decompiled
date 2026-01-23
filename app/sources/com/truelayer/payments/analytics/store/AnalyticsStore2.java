package com.truelayer.payments.analytics.store;

import android.content.Context;
import androidx.room.Room;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.analytics.AnalyticsDB;
import com.truelayer.payments.analytics.AnalyticsDB2;
import com.truelayer.payments.analytics.configuration.AnalyticsNetworkConfiguration;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.truelayer.payments.analytics.store.AnalyticsStore2;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;

/* compiled from: AnalyticsStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B/\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0096@¢\u0006\u0002\u0010\u001eJ\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190#H\u0016J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010%R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/truelayer/payments/analytics/store/AnalyticsStoreImpl;", "Lcom/truelayer/payments/analytics/store/AnalyticsStore;", "dbProvider", "Lkotlin/Function0;", "Lcom/truelayer/payments/analytics/AnalyticsDB;", "workManager", "Landroidx/work/WorkManager;", "autoSend", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlin/jvm/functions/Function0;Landroidx/work/WorkManager;ZLkotlinx/coroutines/CoroutineDispatcher;)V", "analyticsEventDao", "Lcom/truelayer/payments/analytics/AnalyticsEventDao;", "getAnalyticsEventDao", "()Lcom/truelayer/payments/analytics/AnalyticsEventDao;", "analyticsEventDao$delegate", "Lkotlin/Lazy;", PlaceTypes.STORE, "getStore", "()Lcom/truelayer/payments/analytics/AnalyticsDB;", "store$delegate", "add", "", "analyticsEvent", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueWorker", "getAll", "", "getFirst", "Lkotlinx/coroutines/flow/Flow;", "remove", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.analytics.store.AnalyticsStoreImpl, reason: use source file name */
/* loaded from: classes6.dex */
public final class AnalyticsStore2 implements AnalyticsStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AnalyticsStore2 sharedInstance;

    /* renamed from: analyticsEventDao$delegate, reason: from kotlin metadata */
    private final Lazy analyticsEventDao;
    private final boolean autoSend;
    private final CoroutineDispatcher dispatcher;

    /* renamed from: store$delegate, reason: from kotlin metadata */
    private final Lazy store;
    private final WorkManager workManager;

    public /* synthetic */ AnalyticsStore2(Function0 function0, WorkManager workManager, boolean z, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, workManager, z, coroutineDispatcher);
    }

    private AnalyticsStore2(final Function0<? extends AnalyticsDB> function0, WorkManager workManager, boolean z, CoroutineDispatcher coroutineDispatcher) {
        this.workManager = workManager;
        this.autoSend = z;
        this.dispatcher = coroutineDispatcher;
        this.store = LazyKt.lazy(new Function0<AnalyticsDB>() { // from class: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$store$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* compiled from: AnalyticsStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.truelayer.payments.analytics.store.AnalyticsStoreImpl$store$2$1", m3645f = "AnalyticsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$store$2$1 */
            static final class C427181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ AnalyticsDB $store;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C427181(AnalyticsDB analyticsDB, Continuation<? super C427181> continuation) {
                    super(2, continuation);
                    this.$store = analyticsDB;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C427181(this.$store, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C427181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AnalyticsDB2.DefaultImpls.trimDB$default(this.$store.analyticsEventDao(), 0L, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnalyticsDB invoke() {
                AnalyticsDB analyticsDBInvoke = function0.invoke();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.MainScope(), this.dispatcher, null, new C427181(analyticsDBInvoke, null), 2, null);
                return analyticsDBInvoke;
            }
        });
        this.analyticsEventDao = LazyKt.lazy(new Function0<AnalyticsDB2>() { // from class: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$analyticsEventDao$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnalyticsDB2 invoke() {
                return this.this$0.getStore().analyticsEventDao();
            }
        });
    }

    /* synthetic */ AnalyticsStore2(Function0 function0, WorkManager workManager, boolean z, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, workManager, z, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsDB getStore() {
        return (AnalyticsDB) this.store.getValue();
    }

    private final AnalyticsDB2 getAnalyticsEventDao() {
        return (AnalyticsDB2) this.analyticsEventDao.getValue();
    }

    /* compiled from: AnalyticsStore.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ<\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/analytics/store/AnalyticsStoreImpl$Companion;", "", "()V", "sharedInstance", "Lcom/truelayer/payments/analytics/store/AnalyticsStoreImpl;", "defaultEventDatabaseProvider", "Lcom/truelayer/payments/analytics/AnalyticsDB;", "applicationContext", "Landroid/content/Context;", "shared", "context", "dbProvider", "Lkotlin/Function0;", "workManager", "Landroidx/work/WorkManager;", "startSendingEventsAutomatically", "", "dbTrimDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ AnalyticsStore2 shared$default(Companion companion, final Context context, Function0 function0, WorkManager workManager, boolean z, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = new Function0<AnalyticsDB>() { // from class: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$Companion$shared$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final AnalyticsDB invoke() {
                        AnalyticsStore2.Companion companion2 = AnalyticsStore2.INSTANCE;
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        return companion2.defaultEventDatabaseProvider(applicationContext);
                    }
                };
            }
            Function0 function02 = function0;
            if ((i & 4) != 0) {
                workManager = WorkManager.getInstance(context.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
            }
            WorkManager workManager2 = workManager;
            if ((i & 8) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                coroutineDispatcher = Dispatchers.getIO();
            }
            return companion.shared(context, function02, workManager2, z2, coroutineDispatcher);
        }

        public final AnalyticsStore2 shared(Context context, Function0<? extends AnalyticsDB> dbProvider, WorkManager workManager, boolean startSendingEventsAutomatically, CoroutineDispatcher dbTrimDispatcher) {
            AnalyticsStore2 analyticsStore2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbProvider, "dbProvider");
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            Intrinsics.checkNotNullParameter(dbTrimDispatcher, "dbTrimDispatcher");
            AnalyticsStore2 analyticsStore22 = AnalyticsStore2.sharedInstance;
            if (analyticsStore22 != null) {
                return analyticsStore22;
            }
            synchronized (this) {
                analyticsStore2 = new AnalyticsStore2(dbProvider, workManager, startSendingEventsAutomatically, dbTrimDispatcher, null);
                AnalyticsStore2.sharedInstance = analyticsStore2;
            }
            return analyticsStore2;
        }

        public final AnalyticsDB defaultEventDatabaseProvider(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return (AnalyticsDB) Room.databaseBuilder(applicationContext, AnalyticsDB.class, "event-db").build();
        }
    }

    private final void enqueueWorker(AnalyticsNetworkConfiguration configuration) throws Throwable {
        WorkInfo.State state;
        List<WorkInfo> list = this.workManager.getWorkInfosForUniqueWork(EventSenderWorker.WORKER_NAME).get();
        Intrinsics.checkNotNull(list);
        WorkInfo workInfo = (WorkInfo) CollectionsKt.firstOrNull((List) list);
        if ((workInfo == null || (state = workInfo.getState()) == null) ? true : state.isFinished()) {
            Json.Companion companion = Json.INSTANCE;
            companion.getSerializersModule();
            String strEncodeToString = companion.encodeToString(AnalyticsNetworkConfiguration.INSTANCE.serializer(), configuration);
            OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder(EventSenderWorker.class);
            Data dataBuild = new Data.Builder().putString(EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, strEncodeToString).build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
            this.workManager.enqueueUniqueWork(EventSenderWorker.WORKER_NAME, ExistingWorkPolicy.KEEP, builder.setInputData(dataBuild).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        }
    }

    @Override // com.truelayer.payments.analytics.store.AnalyticsStore
    public Object add(AnalyticsEvent analyticsEvent, AnalyticsNetworkConfiguration analyticsNetworkConfiguration, Continuation<? super Unit> continuation) throws Throwable {
        getAnalyticsEventDao().insert(analyticsEvent);
        if (this.autoSend) {
            enqueueWorker(analyticsNetworkConfiguration);
        }
        return Unit.INSTANCE;
    }

    @Override // com.truelayer.payments.analytics.store.AnalyticsStore
    public Flow<AnalyticsEvent> getFirst() {
        Flow<AnalyticsEvent> flowTakeWhile = FlowKt.takeWhile(FlowKt.m28818catch(FlowKt.distinctUntilChanged(getAnalyticsEventDao().getFirst()), new C427161(null)), new C427172(null));
        Intrinsics.checkNotNull(flowTakeWhile, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.truelayer.payments.analytics.events.AnalyticsEvent>");
        return flowTakeWhile;
    }

    /* compiled from: AnalyticsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "it", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.analytics.store.AnalyticsStoreImpl$getFirst$1", m3645f = "AnalyticsStore.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$getFirst$1 */
    static final class C427161 extends ContinuationImpl7 implements Function3<FlowCollector<? super AnalyticsEvent>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C427161(Continuation<? super C427161> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super AnalyticsEvent> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C427161 c427161 = new C427161(continuation);
            c427161.L$0 = flowCollector;
            return c427161.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                this.label = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    /* compiled from: AnalyticsStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.analytics.store.AnalyticsStoreImpl$getFirst$2", m3645f = "AnalyticsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.analytics.store.AnalyticsStoreImpl$getFirst$2 */
    static final class C427172 extends ContinuationImpl7 implements Function2<AnalyticsEvent, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C427172(Continuation<? super C427172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427172 c427172 = new C427172(continuation);
            c427172.L$0 = obj;
            return c427172;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AnalyticsEvent analyticsEvent, Continuation<? super Boolean> continuation) {
            return ((C427172) create(analyticsEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(((AnalyticsEvent) this.L$0) != null);
        }
    }

    @Override // com.truelayer.payments.analytics.store.AnalyticsStore
    public Object getAll(Continuation<? super List<AnalyticsEvent>> continuation) {
        return getAnalyticsEventDao().getAll();
    }

    @Override // com.truelayer.payments.analytics.store.AnalyticsStore
    public Object remove(AnalyticsEvent analyticsEvent, Continuation<? super Unit> continuation) {
        getAnalyticsEventDao().delete(analyticsEvent);
        return Unit.INSTANCE;
    }

    @Override // com.truelayer.payments.analytics.store.AnalyticsStore
    public Object close(Continuation<? super Unit> continuation) {
        getStore().close();
        sharedInstance = null;
        return Unit.INSTANCE;
    }
}
