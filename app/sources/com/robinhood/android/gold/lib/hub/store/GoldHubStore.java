package com.robinhood.android.gold.lib.hub.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.api.gold.hub.ApiGoldDepositBoostAdjustment;
import com.robinhood.android.api.gold.hub.ApiGoldDepositBoostPayout;
import com.robinhood.android.gold.lib.hub.api.ApiDepositBoostHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldDepositBoostHubQueryParams;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldSweepHub;
import com.robinhood.android.gold.lib.hub.api.GoldHubApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.gold.hub.GoldDepositBoostAdjustment;
import com.robinhood.models.gold.hub.GoldDepositBoostAdjustmentDao;
import com.robinhood.models.gold.hub.GoldDepositBoostPayout;
import com.robinhood.models.gold.hub.GoldDepositBoostPayoutDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.GoldDepositBoostAdjustmentTransaction;
import com.robinhood.shared.models.history.GoldDepositBoostPayoutTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import java.util.EnumSet;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: GoldHubStore.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eJ&\u0010\u001f\u001a\u00020\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0086@¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020,0'2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020(04¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020,04¢\u0006\b\n\u0000\u001a\u0004\b8\u00106¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "Lcom/robinhood/store/Store;", "goldHubApi", "Lcom/robinhood/android/gold/lib/hub/api/GoldHubApi;", "goldDepositBoostPayoutDao", "Lcom/robinhood/models/gold/hub/GoldDepositBoostPayoutDao;", "goldDepositAdjustmentDao", "Lcom/robinhood/models/gold/hub/GoldDepositBoostAdjustmentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/gold/lib/hub/api/GoldHubApi;Lcom/robinhood/models/gold/hub/GoldDepositBoostPayoutDao;Lcom/robinhood/models/gold/hub/GoldDepositBoostAdjustmentDao;Lcom/robinhood/store/StoreBundle;)V", "goldHubRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "kotlin.jvm.PlatformType", "goldHubEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "goldDepositBoostHubEndpoint", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldDepositBoostHubQueryParams;", "Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "goldSweepHubEndpoint", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldSweepHub;", "goldDepositBoostPayoutsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;", "goldDepositBoostAdjustmentsEndpoint", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostAdjustment;", "streamGoldHub", "Lio/reactivex/Observable;", "fetchGoldDepositBoostHub", "transferIds", "", "amountList", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchGoldSweepHub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldDepositBoostPayout", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/gold/hub/GoldDepositBoostPayout;", "id", "Ljava/util/UUID;", "getGoldDepositBoostAdjustment", "Lcom/robinhood/models/gold/hub/GoldDepositBoostAdjustment;", "goldDepositBoostPayoutTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getGoldDepositBoostPayoutTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "goldDepositBoostAdjustmentTransactionLoader", "getGoldDepositBoostAdjustmentTransactionLoader", "goldDepositBoostPayoutHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getGoldDepositBoostPayoutHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "goldDepositAdjustmentHistoryLoaderCallbacks", "getGoldDepositAdjustmentHistoryLoaderCallbacks", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldHubStore extends Store {
    private final GoldDepositBoostAdjustmentDao goldDepositAdjustmentDao;
    private final HistoryLoader.Callbacks<GoldDepositBoostAdjustment> goldDepositAdjustmentHistoryLoaderCallbacks;
    private final HistoryTransactionLoader goldDepositBoostAdjustmentTransactionLoader;
    private final PaginatedEndpoint<Unit, ApiGoldDepositBoostAdjustment> goldDepositBoostAdjustmentsEndpoint;
    private final Endpoint<ApiGoldDepositBoostHubQueryParams, ApiDepositBoostHub> goldDepositBoostHubEndpoint;
    private final GoldDepositBoostPayoutDao goldDepositBoostPayoutDao;
    private final HistoryLoader.Callbacks<GoldDepositBoostPayout> goldDepositBoostPayoutHistoryLoaderCallbacks;
    private final HistoryTransactionLoader goldDepositBoostPayoutTransactionLoader;
    private final PaginatedEndpoint<Unit, ApiGoldDepositBoostPayout> goldDepositBoostPayoutsEndpoint;
    private final GoldHubApi goldHubApi;
    private final Endpoint<Unit, ApiGoldHub> goldHubEndpoint;
    private final BehaviorRelay<ApiGoldHub> goldHubRelay;
    private final Endpoint<Unit, ApiGoldSweepHub> goldSweepHubEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldHubStore(GoldHubApi goldHubApi, GoldDepositBoostPayoutDao goldDepositBoostPayoutDao, GoldDepositBoostAdjustmentDao goldDepositAdjustmentDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(goldHubApi, "goldHubApi");
        Intrinsics.checkNotNullParameter(goldDepositBoostPayoutDao, "goldDepositBoostPayoutDao");
        Intrinsics.checkNotNullParameter(goldDepositAdjustmentDao, "goldDepositAdjustmentDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldHubApi = goldHubApi;
        this.goldDepositBoostPayoutDao = goldDepositBoostPayoutDao;
        this.goldDepositAdjustmentDao = goldDepositAdjustmentDao;
        BehaviorRelay<ApiGoldHub> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.goldHubRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        GoldHubStore$goldHubEndpoint$1 goldHubStore$goldHubEndpoint$1 = new GoldHubStore$goldHubEndpoint$1(behaviorRelayCreate);
        this.goldHubEndpoint = Endpoint.Companion.create$default(companion, new GoldHubStore$goldHubEndpoint$2(this, null), getLogoutKillswitch(), goldHubStore$goldHubEndpoint$1, storeBundle.getClock(), null, 16, null);
        this.goldDepositBoostHubEndpoint = Endpoint.Companion.create$default(companion, new GoldHubStore$goldDepositBoostHubEndpoint$1(this, null), getLogoutKillswitch(), new GoldHubStore$goldDepositBoostHubEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.goldSweepHubEndpoint = Endpoint.Companion.create$default(companion, new GoldHubStore$goldSweepHubEndpoint$1(this, null), getLogoutKillswitch(), new GoldHubStore$goldSweepHubEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        PaginatedEndpoint.Companion companion2 = PaginatedEndpoint.INSTANCE;
        this.goldDepositBoostPayoutsEndpoint = PaginatedEndpoint.Companion.create$default(companion2, new GoldHubStore$goldDepositBoostPayoutsEndpoint$1(this, null), getLogoutKillswitch(), new GoldHubStore$goldDepositBoostPayoutsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.goldDepositBoostAdjustmentsEndpoint = PaginatedEndpoint.Companion.create$default(companion2, new GoldHubStore$goldDepositBoostAdjustmentsEndpoint$1(this, null), getLogoutKillswitch(), new GoldHubStore$goldDepositBoostAdjustmentsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.goldDepositBoostPayoutTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostPayoutTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT);
                final Flow goldDepositBoostPayout = this.this$0.getGoldDepositBoostPayout(reference.getSourceId());
                return new Flow<GoldDepositBoostPayoutTransaction>() { // from class: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostPayoutTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super GoldDepositBoostPayoutTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = goldDepositBoostPayout.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostPayoutTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostPayoutTransactionLoader$1$load$$inlined$map$1$2", m3645f = "GoldHubStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostPayoutTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                GoldDepositBoostPayoutTransaction goldDepositBoostPayoutTransaction = new GoldDepositBoostPayoutTransaction((GoldDepositBoostPayout) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(goldDepositBoostPayoutTransaction, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
        this.goldDepositBoostAdjustmentTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostAdjustmentTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT);
                final Flow goldDepositBoostAdjustment = this.this$0.getGoldDepositBoostAdjustment(reference.getSourceId());
                return new Flow<GoldDepositBoostAdjustmentTransaction>() { // from class: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostAdjustmentTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super GoldDepositBoostAdjustmentTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = goldDepositBoostAdjustment.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostAdjustmentTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostAdjustmentTransactionLoader$1$load$$inlined$map$1$2", m3645f = "GoldHubStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostAdjustmentTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                GoldDepositBoostAdjustmentTransaction goldDepositBoostAdjustmentTransaction = new GoldDepositBoostAdjustmentTransaction((GoldDepositBoostAdjustment) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(goldDepositBoostAdjustmentTransaction, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
        this.goldDepositBoostPayoutHistoryLoaderCallbacks = new HistoryLoader.Callbacks<GoldDepositBoostPayout>() { // from class: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostPayoutHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT);

            {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.goldDepositBoostPayoutDao.countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.goldDepositBoostPayoutDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostPayout>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                GoldHubStore goldHubStore = this.this$0;
                ScopedSubscriptionKt.subscribeIn(goldHubStore.asObservable(goldHubStore.goldDepositBoostPayoutsEndpoint.forceFetchAllPages(Unit.INSTANCE)), this.this$0.getStoreScope());
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositBoostPayoutDao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostPayout>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositBoostPayoutDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostPayout>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositBoostPayoutDao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostPayout>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositBoostPayoutDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
        this.goldDepositAdjustmentHistoryLoaderCallbacks = new HistoryLoader.Callbacks<GoldDepositBoostAdjustment>() { // from class: com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositAdjustmentHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT);

            {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.goldDepositAdjustmentDao.countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.goldDepositAdjustmentDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostAdjustment>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                GoldHubStore goldHubStore = this.this$0;
                ScopedSubscriptionKt.subscribeIn(goldHubStore.asObservable(goldHubStore.goldDepositBoostAdjustmentsEndpoint.forceFetchAllPages(Unit.INSTANCE)), this.this$0.getStoreScope());
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositAdjustmentDao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostAdjustment>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositAdjustmentDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostAdjustment>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING || filter.getIsFilteringByGoldDepositBoost()) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositAdjustmentDao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GoldDepositBoostAdjustment>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.goldDepositAdjustmentDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object goldHubEndpoint$accept(BehaviorRelay behaviorRelay, ApiGoldHub apiGoldHub, Continuation continuation) {
        behaviorRelay.accept(apiGoldHub);
        return Unit.INSTANCE;
    }

    public final Observable<ApiGoldHub> streamGoldHub() {
        Endpoint.DefaultImpls.refresh$default(this.goldHubEndpoint, Unit.INSTANCE, false, null, 6, null);
        return this.goldHubRelay;
    }

    public static /* synthetic */ Object fetchGoldDepositBoostHub$default(GoldHubStore goldHubStore, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return goldHubStore.fetchGoldDepositBoostHub(str, str2, continuation);
    }

    public final Object fetchGoldDepositBoostHub(String str, String str2, Continuation<? super ApiDepositBoostHub> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.goldDepositBoostHubEndpoint, new ApiGoldDepositBoostHubQueryParams(str, str2), null, continuation, 2, null);
    }

    public final Object fetchGoldSweepHub(Continuation<? super ApiGoldSweepHub> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.goldSweepHubEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<GoldDepositBoostPayout> getGoldDepositBoostPayout(UUID id) {
        return FlowKt.filterNotNull(this.goldDepositBoostPayoutDao.getPayoutItem(id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<GoldDepositBoostAdjustment> getGoldDepositBoostAdjustment(UUID id) {
        return FlowKt.filterNotNull(this.goldDepositAdjustmentDao.getAdjustment(id));
    }

    public final HistoryTransactionLoader getGoldDepositBoostPayoutTransactionLoader() {
        return this.goldDepositBoostPayoutTransactionLoader;
    }

    public final HistoryTransactionLoader getGoldDepositBoostAdjustmentTransactionLoader() {
        return this.goldDepositBoostAdjustmentTransactionLoader;
    }

    public final HistoryLoader.Callbacks<GoldDepositBoostPayout> getGoldDepositBoostPayoutHistoryLoaderCallbacks() {
        return this.goldDepositBoostPayoutHistoryLoaderCallbacks;
    }

    public final HistoryLoader.Callbacks<GoldDepositBoostAdjustment> getGoldDepositAdjustmentHistoryLoaderCallbacks() {
        return this.goldDepositAdjustmentHistoryLoaderCallbacks;
    }
}
