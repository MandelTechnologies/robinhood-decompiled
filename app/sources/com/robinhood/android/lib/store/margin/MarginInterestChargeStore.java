package com.robinhood.android.lib.store.margin;

import androidx.room.RoomDatabase;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiMarginInterestCharge;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.MarginInterestChargeDao;
import com.robinhood.models.p320db.MarginInterestCharge;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MarginInterestChargeTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: MarginInterestChargeStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginInterestChargeStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MarginInterestChargeDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MarginInterestChargeDao;)V", "saveAction", "Lkotlin/Function1;", "", "Lcom/robinhood/models/api/ApiMarginInterestCharge;", "", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/db/MarginInterestCharge;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getMarginInterestCharge", "Lio/reactivex/Observable;", "interestChargeId", "Ljava/util/UUID;", "refresh", "force", "", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginInterestChargeStore extends Store {
    private final Brokeback brokeback;
    private final MarginInterestChargeDao dao;
    private final HistoryLoader.Callbacks<MarginInterestCharge> historyLoaderCallbacks;
    private final Function1<Iterable<ApiMarginInterestCharge>, Unit> saveAction;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginInterestChargeStore(Brokeback brokeback, StoreBundle storeBundle, final MarginInterestChargeDao dao) {
        super(storeBundle, MarginInterestCharge.INSTANCE);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<Iterable<? extends ApiMarginInterestCharge>, Unit>() { // from class: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Iterable<? extends ApiMarginInterestCharge> iterable) {
                m15902invoke(iterable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15902invoke(Iterable<? extends ApiMarginInterestCharge> iterable) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(iterable);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.MARGIN_INTEREST_CHARGE);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getMarginInterestCharge(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<MarginInterestChargeTransaction>() { // from class: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$transactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginInterestChargeStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "MarginInterestChargeStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                MarginInterestChargeTransaction marginInterestChargeTransaction = new MarginInterestChargeTransaction((MarginInterestCharge) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(marginInterestChargeTransaction, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MarginInterestChargeTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<MarginInterestCharge>() { // from class: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            /* compiled from: MarginInterestChargeStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$historyLoaderCallbacks$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HistoryEvent.State.values().length];
                    try {
                        iArr[HistoryEvent.State.PENDING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HistoryEvent.State.SETTLED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.MARGIN_INTEREST_CHARGE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            private final Instant getSinceForState(HistoryLoader.Filter filter) {
                HistoryEvent.State state = filter.getState();
                int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        Instant since = filter.getSince();
                        Instant instantNow = Instant.now();
                        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                        Comparable comparableMaxOf = ComparisonsKt.maxOf(since, instantNow);
                        Intrinsics.checkNotNullExpressionValue(comparableMaxOf, "maxOf(...)");
                        return (Instant) comparableMaxOf;
                    }
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return filter.getSince();
            }

            private final Instant getBeforeForState(HistoryLoader.Filter filter) {
                HistoryEvent.State state = filter.getState();
                int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == -1 || i == 1) {
                    return filter.getBefore();
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Instant before = filter.getBefore();
                if (before != null) {
                    Instant instantNow = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                    Instant instant = (Instant) ComparisonsKt.minOf(before, instantNow);
                    if (instant != null) {
                        return instant;
                    }
                }
                return Instant.now();
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(getSinceForState(filter), getBeforeForState(filter), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(getSinceForState(filter), getBeforeForState(filter), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MarginInterestCharge>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return this.this$0.dao.getLatest(getSinceForState(filter), getBeforeForState(filter), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MarginInterestCharge>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(getSinceForState(filter), getBeforeForState(filter), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MarginInterestCharge>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(getSinceForState(filter), getBeforeForState(filter), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MarginInterestCharge>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(getSinceForState(filter), getBeforeForState(filter), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<MarginInterestCharge> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final Observable<MarginInterestCharge> getMarginInterestCharge(UUID interestChargeId) {
        Intrinsics.checkNotNullParameter(interestChargeId, "interestChargeId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getMarginInterestCharge(interestChargeId))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refresh$lambda$0(MarginInterestChargeStore marginInterestChargeStore, String str) {
        return RxFactory.DefaultImpls.rxSingle$default(marginInterestChargeStore, null, new MarginInterestChargeStore3(marginInterestChargeStore, str, null), 1, null);
    }

    public final void refresh(boolean force) {
        ScopedSubscriptionKt.subscribeIn(refreshPaginated(new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInterestChargeStore.refresh$lambda$0(this.f$0, (String) obj);
            }
        }).force(force).saveAction(this.saveAction).toMaybe(getNetworkWrapper()), getStoreScope());
    }
}
