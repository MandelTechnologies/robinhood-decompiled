package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.OptionEventDao;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p320db.OptionEvent2;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.OptionEventTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.HttpUrls;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.EnumSet;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionEventStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0!2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001fJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010$\u001a\u00020\u001fJ\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u001e\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020'0(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/OptionEventDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/dao/OptionEventDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;)V", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/ui/UiOptionEvent;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getOptionEventsByEquityInstrument", "Lio/reactivex/Observable;", "", "accountNumber", "", "equityInstrumentId", "Ljava/util/UUID;", "streamOptionEventsByOptionInstrument", "Lkotlinx/coroutines/flow/Flow;", "optionInstrumentId", "getOptionEvent", "id", "getOptionEvents", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/models/api/ApiOptionEvent;", "Lcom/robinhood/android/moria/network/Endpoint;", "getGetOptionEvent", "()Lcom/robinhood/android/moria/network/Endpoint;", "refresh", "", "force", "", "refreshWithAllAccounts", "refreshWithAccounts", "accountNumbers", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionEventStore extends Store {
    private final AccountProvider accountProvider;
    private final OptionEventDao dao;
    private final Endpoint<UUID, ApiOptionEvent> getOptionEvent;
    private final PaginatedEndpoint<List<String>, ApiOptionEvent> getOptionEvents;
    private final HistoryLoader.Callbacks<UiOptionEvent> historyLoaderCallbacks;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionsApi optionsApi;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionEventStore(StoreBundle storeBundle, AccountProvider accountProvider, OptionEventDao dao, OptionsApi optionsApi, OptionInstrumentStore optionInstrumentStore, OptionPositionStore optionPositionStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        this.accountProvider = accountProvider;
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionPositionStore = optionPositionStore;
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.OptionEventStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.OPTION_EVENT);
                this.this$0.refreshWithAllAccounts(false);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getOptionEvent(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<OptionEventTransaction>() { // from class: com.robinhood.librobinhood.data.store.OptionEventStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C340252<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionEventStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "OptionEventStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C340252.this.emit(null, this);
                            }
                        }

                        public C340252(FlowCollector flowCollector) {
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
                                OptionEventTransaction optionEventTransaction = new OptionEventTransaction((UiOptionEvent) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionEventTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super OptionEventTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C340252(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiOptionEvent>() { // from class: com.robinhood.librobinhood.data.store.OptionEventStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.OPTION_EVENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
                this.isInstrumentHistoryLoader = true;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader, reason: from getter */
            public boolean getIsInstrumentHistoryLoader() {
                return this.isInstrumentHistoryLoader;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshWithAllAccounts(false);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(OptionEvent2.getOptionEventStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(OptionEvent2.getOptionEventStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionEvent>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshWithAllAccounts(false);
                return this.this$0.dao.getLatest(OptionEvent2.getOptionEventStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionEvent>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(OptionEvent2.getOptionEventStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionEvent>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(OptionEvent2.getOptionEventStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionEvent>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(OptionEvent2.getOptionEventStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        OptionEventStore2 optionEventStore2 = new OptionEventStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        OptionEventStore3 optionEventStore3 = new OptionEventStore3(dao);
        Clock clock = storeBundle.getClock();
        OptionEvent.Companion companion2 = OptionEvent.INSTANCE;
        this.getOptionEvents = companion.create(optionEventStore2, logoutKillswitch, optionEventStore3, clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getOptionEvent = Endpoint.INSTANCE.create(new C340261(optionsApi), getLogoutKillswitch(), new C340272(dao), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<UiOptionEvent> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final Observable<List<UiOptionEvent>> getOptionEventsByEquityInstrument(String accountNumber, UUID equityInstrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
        return asObservable(takeWhileLoggedIn(this.dao.getOptionEventsByEquityInstrument(accountNumber, equityInstrumentId)));
    }

    public final Flow<List<UiOptionEvent>> streamOptionEventsByOptionInstrument(String accountNumber, UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        return takeWhileLoggedIn(this.dao.getOptionEventsByOptionInstrument(accountNumber, optionInstrumentId));
    }

    public final Observable<UiOptionEvent> getOptionEvent(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getOptionEvent(id))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getOptionEvents$insertPaginated(OptionEventDao optionEventDao, PaginatedResult paginatedResult, Continuation continuation) {
        optionEventDao.insertPaginated(paginatedResult);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionEventStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$getOptionEvent$1 */
    /* synthetic */ class C340261 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiOptionEvent>, Object>, ContinuationImpl6 {
        C340261(Object obj) {
            super(2, obj, OptionsApi.class, "getOptionEvent", "getOptionEvent(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super ApiOptionEvent> continuation) {
            return ((OptionsApi) this.receiver).getOptionEvent(uuid, continuation);
        }
    }

    public final Endpoint<UUID, ApiOptionEvent> getGetOptionEvent() {
        return this.getOptionEvent;
    }

    /* compiled from: OptionEventStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$getOptionEvent$2 */
    /* synthetic */ class C340272 extends AdaptedFunctionReference implements Function2<ApiOptionEvent, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C340272(Object obj) {
            super(2, obj, OptionEventDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiOptionEvent;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionEvent apiOptionEvent, Continuation<? super Unit> continuation) {
            return OptionEventStore.getOptionEvent$insert((OptionEventDao) this.receiver, apiOptionEvent, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getOptionEvent$insert(OptionEventDao optionEventDao, ApiOptionEvent apiOptionEvent, Continuation continuation) {
        optionEventDao.insert(apiOptionEvent);
        return Unit.INSTANCE;
    }

    public final void refresh(boolean force, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        refreshWithAccounts(force, CollectionsKt.listOf(accountNumber));
    }

    /* compiled from: OptionEventStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionEventStore$refreshWithAllAccounts$1", m3645f = "OptionEventStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$refreshWithAllAccounts$1 */
    static final class C340291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340291(boolean z, Continuation<? super C340291> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionEventStore.this.new C340291(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C340291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<List<String>> observableStreamAllSelfDirectedAccountNumbers = OptionEventStore.this.accountProvider.streamAllSelfDirectedAccountNumbers();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(observableStreamAllSelfDirectedAccountNumbers, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (list != null) {
                OptionEventStore.this.refreshWithAccounts(this.$force, list);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshWithAllAccounts(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C340291(force, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshWithAccounts(boolean force, final List<String> accountNumbers) {
        Flow<PaginatedResult<ApiOptionEvent>> flowFetchAllPages;
        if (force) {
            flowFetchAllPages = this.getOptionEvents.forceFetchAllPages(accountNumbers);
        } else {
            flowFetchAllPages = this.getOptionEvents.fetchAllPages(accountNumbers);
        }
        Completable completableFlatMapCompletable = asObservable(flowFetchAllPages).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionEventStore.refreshWithAccounts.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(PaginatedResult<ApiOptionEvent> events) {
                Intrinsics.checkNotNullParameter(events, "events");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
                Iterator<ApiOptionEvent> it = events.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.toUuid(HttpUrls.lastNonEmptyPathSegment(it.next().getOption())));
                }
                OptionPositionStore.refresh$default(OptionEventStore.this.optionPositionStore, false, (UUID) null, (List) accountNumbers, 2, (Object) null);
                return OptionInstrumentStore.pingOptionInstrumentsCompletable$default(OptionEventStore.this.optionInstrumentStore, arrayList, false, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableFlatMapCompletable), getStoreScope());
    }
}
