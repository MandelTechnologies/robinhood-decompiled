package com.truelayer.payments.analytics;

import android.content.Context;
import androidx.work.WorkManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.configuration.AnalyticsNetworkConfiguration;
import com.truelayer.payments.analytics.configuration.Environment;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.analytics.events.AppAnalytics;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.truelayer.payments.analytics.store.AnalyticsStore;
import com.truelayer.payments.analytics.store.AnalyticsStore2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: TrueLayerAnalyticsImpl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalyticsImpl;", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "context", "Landroid/content/Context;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/analytics/TrueLayerAnalytics$Configuration;", "dbProvider", "Lkotlin/Function0;", "Lcom/truelayer/payments/analytics/AnalyticsDB;", "workManager", "Landroidx/work/WorkManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lcom/truelayer/payments/analytics/TrueLayerAnalytics$Configuration;Lkotlin/jvm/functions/Function0;Landroidx/work/WorkManager;Lkotlinx/coroutines/CoroutineScope;)V", "analyticsEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "appAnalytics", "Lcom/truelayer/payments/analytics/events/AppAnalytics;", PlaceTypes.STORE, "Lcom/truelayer/payments/analytics/store/AnalyticsStore;", "getStore", "()Lcom/truelayer/payments/analytics/store/AnalyticsStore;", "store$delegate", "Lkotlin/Lazy;", "track", "", "event", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TrueLayerAnalyticsImpl implements TrueLayerAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile TrueLayerAnalyticsImpl sharedInstance;
    private final SharedFlow2<AnalyticsEvents> analyticsEventsFlow;
    private AppAnalytics appAnalytics;
    private final TrueLayerAnalytics.Configuration configuration;
    private final CoroutineScope coroutineScope;

    /* renamed from: store$delegate, reason: from kotlin metadata */
    private final Lazy store;

    public /* synthetic */ TrueLayerAnalyticsImpl(Context context, TrueLayerAnalytics.Configuration configuration, Function0 function0, WorkManager workManager, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, configuration, function0, workManager, coroutineScope);
    }

    private TrueLayerAnalyticsImpl(final Context context, TrueLayerAnalytics.Configuration configuration, final Function0<? extends AnalyticsDB> function0, final WorkManager workManager, CoroutineScope coroutineScope) {
        this.configuration = configuration;
        this.coroutineScope = coroutineScope;
        this.store = LazyKt.lazy(new Function0<AnalyticsStore2>() { // from class: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$store$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnalyticsStore2 invoke() {
                return AnalyticsStore2.Companion.shared$default(AnalyticsStore2.INSTANCE, context, function0, workManager, this.configuration.getStartSendingEventsAutomatically(), null, 16, null);
            }
        });
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.appAnalytics = new AppAnalytics(applicationContext, configuration.getClientId(), configuration.getSdkVersion(), null, null, null, null, null, null, null, null, 2040, null);
        this.analyticsEventsFlow = SharedFlow4.MutableSharedFlow$default(0, 100, BufferOverflow.SUSPEND, 1, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C427081(null), 3, null);
    }

    /* compiled from: TrueLayerAnalyticsImpl.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ:\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalyticsImpl$Companion;", "", "()V", "sharedInstance", "Lcom/truelayer/payments/analytics/TrueLayerAnalyticsImpl;", "getAnalyticsUrlString", "", "environment", "Lcom/truelayer/payments/analytics/configuration/Environment;", "resetAnalyticsInstance", "", "resetAnalyticsInstance$payments_analytics_release", "shared", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "context", "Landroid/content/Context;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/analytics/TrueLayerAnalytics$Configuration;", "dbProvider", "Lkotlin/Function0;", "Lcom/truelayer/payments/analytics/AnalyticsDB;", "workManager", "Landroidx/work/WorkManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: TrueLayerAnalyticsImpl.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Environment.values().length];
                try {
                    iArr[Environment.PRODUCTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Environment.SANDBOX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Environment.DEVELOPMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ TrueLayerAnalytics shared$default(Companion companion, final Context context, TrueLayerAnalytics.Configuration configuration, Function0 function0, WorkManager workManager, CoroutineScope coroutineScope, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = new Function0<AnalyticsDB>() { // from class: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$Companion$shared$1
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
            if ((i & 8) != 0) {
                workManager = WorkManager.getInstance(context.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
            }
            WorkManager workManager2 = workManager;
            if ((i & 16) != 0) {
                coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getIO());
            }
            return companion.shared(context, configuration, function02, workManager2, coroutineScope);
        }

        public final TrueLayerAnalytics shared(Context context, TrueLayerAnalytics.Configuration configuration, Function0<? extends AnalyticsDB> dbProvider, WorkManager workManager, CoroutineScope coroutineScope) {
            TrueLayerAnalyticsImpl trueLayerAnalyticsImpl;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(dbProvider, "dbProvider");
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            TrueLayerAnalyticsImpl trueLayerAnalyticsImpl2 = TrueLayerAnalyticsImpl.sharedInstance;
            if (trueLayerAnalyticsImpl2 != null) {
                return trueLayerAnalyticsImpl2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext);
                trueLayerAnalyticsImpl = new TrueLayerAnalyticsImpl(applicationContext, configuration, dbProvider, workManager, coroutineScope, null);
                TrueLayerAnalyticsImpl.sharedInstance = trueLayerAnalyticsImpl;
            }
            return trueLayerAnalyticsImpl;
        }

        public final String getAnalyticsUrlString(Environment environment) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            int i = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
            if (i == 1) {
                return BuildConfig.ANALYTICS_API_URI;
            }
            if (i == 2) {
                return BuildConfig.ANALYTICS_API_URI_SANDBOX;
            }
            if (i == 3) {
                return BuildConfig.ANALYTICS_API_URI_DEV;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final void resetAnalyticsInstance$payments_analytics_release() {
            TrueLayerAnalyticsImpl.sharedInstance = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsStore getStore() {
        return (AnalyticsStore) this.store.getValue();
    }

    /* compiled from: TrueLayerAnalyticsImpl.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1", m3645f = "TrueLayerAnalyticsImpl.kt", m3646l = {144}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1 */
    static final class C427081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C427081(Continuation<? super C427081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427081 c427081 = TrueLayerAnalyticsImpl.this.new C427081(continuation);
            c427081.L$0 = obj;
            return c427081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C427081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 100, BufferOverflow.SUSPEND, 1, null);
                final Flow flowOnEach = FlowKt.onEach(FlowKt.filterNotNull(TrueLayerAnalyticsImpl.this.analyticsEventsFlow), new TrueLayerAnalyticsImpl3(null));
                Flow flowMerge = FlowKt.merge(FlowKt.debounce(sharedFlow2MutableSharedFlow$default, 1000L), new Flow<AnalyticsEvents>() { // from class: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AnalyticsEvents> flowCollector, Continuation continuation) {
                        Object objCollect = flowOnEach.collect(new C427072(flowCollector, sharedFlow2MutableSharedFlow$default), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 9, 0})
                    @SourceDebugExtension
                    /* renamed from: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C427072<T> implements FlowCollector {
                        final /* synthetic */ SharedFlow2 $searchFlow$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$invokeSuspend$$inlined$filter$1$2", m3645f = "TrueLayerAnalyticsImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                        @SourceDebugExtension
                        /* renamed from: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C427072.this.emit(null, this);
                            }
                        }

                        public C427072(FlowCollector flowCollector, SharedFlow2 sharedFlow2) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$searchFlow$inlined = sharedFlow2;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
                        
                            if (r8.emit(r7, r0) == r1) goto L29;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
                            Object obj2;
                            FlowCollector flowCollector2;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj3 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            boolean z = true;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj3);
                                flowCollector = this.$this_unsafeFlow;
                                AnalyticsEvents analyticsEvents = (AnalyticsEvents) obj;
                                if (!(analyticsEvents instanceof AnalyticsEvents.ProviderSelectionSearch ? true : analyticsEvents instanceof AnalyticsEvents.BranchSelectionSearch)) {
                                    if (z) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.label = 2;
                                    }
                                    return Unit.INSTANCE;
                                }
                                SharedFlow2 sharedFlow2 = this.$searchFlow$inlined;
                                anonymousClass1.L$0 = obj;
                                anonymousClass1.L$1 = flowCollector;
                                anonymousClass1.label = 1;
                                if (sharedFlow2.emit(analyticsEvents, anonymousClass1) != coroutine_suspended) {
                                    obj2 = obj;
                                    flowCollector2 = flowCollector;
                                }
                                return coroutine_suspended;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj3);
                                return Unit.INSTANCE;
                            }
                            flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                            obj2 = anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            z = false;
                            flowCollector = flowCollector2;
                            obj = obj2;
                            if (z) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, TrueLayerAnalyticsImpl.this);
                this.label = 1;
                if (flowMerge.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: TrueLayerAnalyticsImpl.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "emit", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvents;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ TrueLayerAnalyticsImpl this$0;

            AnonymousClass1(CoroutineScope coroutineScope, TrueLayerAnalyticsImpl trueLayerAnalyticsImpl) {
                this.$$this$launch = coroutineScope;
                this.this$0 = trueLayerAnalyticsImpl;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(AnalyticsEvents analyticsEvents, Continuation<? super Unit> continuation) {
                TrueLayerAnalyticsImpl2 trueLayerAnalyticsImpl2;
                AnonymousClass1<T> anonymousClass1;
                if (continuation instanceof TrueLayerAnalyticsImpl2) {
                    trueLayerAnalyticsImpl2 = (TrueLayerAnalyticsImpl2) continuation;
                    int i = trueLayerAnalyticsImpl2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        trueLayerAnalyticsImpl2.label = i - Integer.MIN_VALUE;
                    } else {
                        trueLayerAnalyticsImpl2 = new TrueLayerAnalyticsImpl2(this, continuation);
                    }
                }
                Object obj = trueLayerAnalyticsImpl2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = trueLayerAnalyticsImpl2.label;
                Unit unit = null;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TrueLayerAnalytics.AnalyticsContext analyticsContext = TrueLayerAnalytics.INSTANCE.getAnalyticsContext();
                    if (analyticsContext != null) {
                        TrueLayerAnalyticsImpl trueLayerAnalyticsImpl = this.this$0;
                        AnalyticsStore store = trueLayerAnalyticsImpl.getStore();
                        AnalyticsEvent analyticsEventIntoEvent$payments_analytics_release = analyticsEvents.intoEvent$payments_analytics_release(trueLayerAnalyticsImpl.appAnalytics, analyticsContext);
                        AnalyticsNetworkConfiguration networkConfiguration = trueLayerAnalyticsImpl.configuration.getNetworkConfiguration();
                        trueLayerAnalyticsImpl2.L$0 = this;
                        trueLayerAnalyticsImpl2.L$1 = analyticsEvents;
                        trueLayerAnalyticsImpl2.label = 1;
                        if (store.add(analyticsEventIntoEvent$payments_analytics_release, networkConfiguration, trueLayerAnalyticsImpl2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass1 = this;
                    } else {
                        anonymousClass1 = this;
                        if (unit == null) {
                            CoroutineScope coroutineScope = anonymousClass1.$$this$launch;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    analyticsEvents = (AnalyticsEvents) trueLayerAnalyticsImpl2.L$1;
                    anonymousClass1 = (AnonymousClass1) trueLayerAnalyticsImpl2.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (analyticsEvents instanceof AnalyticsEvents.SDKReturnToHostApp) {
                    TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
                    TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
                    if (analyticsContext2 != null) {
                        analyticsContext2.setAmountInMinor(null);
                    }
                    TrueLayerAnalytics.AnalyticsContext analyticsContext3 = companion.getAnalyticsContext();
                    if (analyticsContext3 != null) {
                        analyticsContext3.setProviderId(null);
                    }
                    TrueLayerAnalytics.AnalyticsContext analyticsContext4 = companion.getAnalyticsContext();
                    if (analyticsContext4 != null) {
                        analyticsContext4.setProviderCountryCode(null);
                    }
                }
                unit = Unit.INSTANCE;
                if (unit == null) {
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AnalyticsEvents) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    @Override // com.truelayer.payments.analytics.TrueLayerAnalytics
    public void track(AnalyticsEvents event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.analyticsEventsFlow.tryEmit(event);
    }
}
