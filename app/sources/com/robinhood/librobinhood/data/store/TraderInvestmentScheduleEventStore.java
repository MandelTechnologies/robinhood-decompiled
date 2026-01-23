package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.api.ApiInvestmentScheduleEvent;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.EquityOrderState6;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.bonfire.PaymentTransfer2;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.dao.InvestmentScheduleEventDao;
import com.robinhood.recurring.models.dao.InvestmentScheduleEventDao2;
import com.robinhood.recurring.models.p365db.InvestmentScheduleEvent;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.BrokerageCashTransferScheduleTransaction;
import com.robinhood.shared.models.history.CryptoInvestmentScheduleWithAchTransaction;
import com.robinhood.shared.models.history.CryptoInvestmentScheduleWithBuyingPowerTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleEventWithAchTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleEventWithBuyingPowerTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.OrderState2;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: TraderInvestmentScheduleEventStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0018\u00101\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010!\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\"\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0$\u0012\u0006\u0012\u0004\u0018\u00010'0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010'0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010'0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\u000203¢\u0006\u000e\n\u0000\u0012\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u001609¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006<"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "recurringApi", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "uiCurrencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/InvestmentScheduleEventDao;", "<init>", "(Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/recurring/models/dao/InvestmentScheduleEventDao;)V", "streamInvestmentScheduleEventQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "streamInvestmentScheduleEventByScheduleQuery", "", "streamInvestmentScheduleEventBySchedule", "Lkotlinx/coroutines/flow/Flow;", "scheduleId", "streamInvestmentScheduleEventByAchTransferQuery", "streamInvestmentScheduleEventByAchTransfer", "achTransferId", "streamInvestmentScheduleEventByOrderQuery", "streamInvestmentScheduleEventByOrder", "orderId", "getInvestmentScheduleEvents", "Lcom/robinhood/api/PaginatedEndpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "Lcom/robinhood/models/api/ApiInvestmentScheduleEvent;", "getInvestmentScheduleEventsByAchTransfer", "getInvestmentScheduleEventsByOrder", "refresh", "", "force", "", "accountNumber", "refreshAccountFirstPage", "refreshByAchTransfer", "refreshByOrder", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader$annotations", "()V", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderInvestmentScheduleEventStore extends Store implements InvestmentScheduleEventStore {
    private final InvestmentScheduleEventDao dao;
    private final PaginatedEndpoint<Tuples2<String, ApiAssetType>, ApiInvestmentScheduleEvent> getInvestmentScheduleEvents;
    private final PaginatedEndpoint<UUID, ApiInvestmentScheduleEvent> getInvestmentScheduleEventsByAchTransfer;
    private final PaginatedEndpoint<UUID, ApiInvestmentScheduleEvent> getInvestmentScheduleEventsByOrder;
    private final HistoryLoader.Callbacks<UiInvestmentScheduleEvent> historyLoaderCallbacks;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final OrderStore orderStore;
    private final PaymentTransferStore paymentTransferStore;
    private final RecurringApi recurringApi;
    private final Query<UUID, UiInvestmentScheduleEvent> streamInvestmentScheduleEventByAchTransferQuery;
    private final Query<UUID, UiInvestmentScheduleEvent> streamInvestmentScheduleEventByOrderQuery;
    private final Query<UUID, List<UiInvestmentScheduleEvent>> streamInvestmentScheduleEventByScheduleQuery;
    private final Query<UUID, UiInvestmentScheduleEvent> streamInvestmentScheduleEventQuery;
    private final HistoryTransactionLoader transactionLoader;
    private final CurrencyPairStore uiCurrencyPairStore;

    public static /* synthetic */ void getTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderInvestmentScheduleEventStore(RecurringApi recurringApi, PaymentTransferStore paymentTransferStore, TraderInvestmentScheduleStore investmentScheduleStore, OrderStore orderStore, CurrencyPairStore uiCurrencyPairStore, StoreBundle storeBundle, InvestmentScheduleEventDao dao) {
        super(storeBundle, InvestmentScheduleEvent.INSTANCE);
        Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(uiCurrencyPairStore, "uiCurrencyPairStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.recurringApi = recurringApi;
        this.paymentTransferStore = paymentTransferStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.orderStore = orderStore;
        this.uiCurrencyPairStore = uiCurrencyPairStore;
        this.dao = dao;
        Query.Companion companion = Query.INSTANCE;
        this.streamInvestmentScheduleEventQuery = Store.create$default(this, companion, "streamInvestmentScheduleEvent", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleEventStore.streamInvestmentScheduleEventQuery$lambda$0(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamInvestmentScheduleEventByScheduleQuery = Store.create$default(this, companion, "streamInvestmentScheduleEventBySchedule", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleEventStore.streamInvestmentScheduleEventByScheduleQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamInvestmentScheduleEventByAchTransferQuery = Store.create$default(this, companion, "streamInvestmentScheduleEventByAchTransfer", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleEventStore.streamInvestmentScheduleEventByAchTransferQuery$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamInvestmentScheduleEventByOrderQuery = Store.create$default(this, companion, "streamInvestmentScheduleEventByOrder", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleEventStore.streamInvestmentScheduleEventByOrderQuery$lambda$3(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        PaginatedEndpoint.Companion companion2 = PaginatedEndpoint.INSTANCE;
        TraderInvestmentScheduleEventStore2 traderInvestmentScheduleEventStore2 = new TraderInvestmentScheduleEventStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        TraderInvestmentScheduleEventStore3 traderInvestmentScheduleEventStore3 = new TraderInvestmentScheduleEventStore3(this, null);
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        this.getInvestmentScheduleEvents = companion2.create(traderInvestmentScheduleEventStore2, logoutKillswitch, traderInvestmentScheduleEventStore3, clock, new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        this.getInvestmentScheduleEventsByAchTransfer = companion2.create(new TraderInvestmentScheduleEventStore4(this, null), getLogoutKillswitch(), new TraderInvestmentScheduleEventStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        this.getInvestmentScheduleEventsByOrder = companion2.create(new TraderInvestmentScheduleEventStore6(this, null), getLogoutKillswitch(), new TraderInvestmentScheduleEventStore7(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH}));
                final Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.streamInvestmentScheduleEventQuery.asFlow(reference.getSourceId()), new C34391xd7b026ed(null, this.this$0));
                return new Flow<MinervaTransaction>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MinervaTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "TraderInvestmentScheduleEventStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                            MinervaTransaction investmentScheduleEventWithAchTransaction;
                            MinervaTransaction cryptoInvestmentScheduleWithAchTransaction;
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
                                Tuples2 tuples2 = (Tuples2) obj;
                                UiInvestmentScheduleEvent uiInvestmentScheduleEvent = (UiInvestmentScheduleEvent) tuples2.component1();
                                UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) tuples2.component2();
                                if (uiInvestmentScheduleEvent.getIsBrokerageCashTransfer()) {
                                    investmentScheduleEventWithAchTransaction = new BrokerageCashTransferScheduleTransaction(uiInvestmentScheduleEvent);
                                } else if (uiInvestmentScheduleEvent.getIsUsingBuyingPower()) {
                                    if (!uiInvestmentScheduleEvent.getIsCrypto()) {
                                        investmentScheduleEventWithAchTransaction = new InvestmentScheduleEventWithBuyingPowerTransaction(uiInvestmentScheduleEvent);
                                    } else if (uiCurrencyPair != null) {
                                        cryptoInvestmentScheduleWithAchTransaction = new CryptoInvestmentScheduleWithBuyingPowerTransaction(uiInvestmentScheduleEvent, uiCurrencyPair);
                                        investmentScheduleEventWithAchTransaction = cryptoInvestmentScheduleWithAchTransaction;
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else if (!uiInvestmentScheduleEvent.getIsCrypto()) {
                                    investmentScheduleEventWithAchTransaction = new InvestmentScheduleEventWithAchTransaction(uiInvestmentScheduleEvent);
                                } else if (uiCurrencyPair != null) {
                                    cryptoInvestmentScheduleWithAchTransaction = new CryptoInvestmentScheduleWithAchTransaction(uiInvestmentScheduleEvent, uiCurrencyPair);
                                    investmentScheduleEventWithAchTransaction = cryptoInvestmentScheduleWithAchTransaction;
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(investmentScheduleEventWithAchTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiInvestmentScheduleEvent>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
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
                InvestmentScheduleEventStore.DefaultImpls.refresh$default(this.this$0, false, null, 2, null);
                final Flow flowCountTotal$default = InvestmentScheduleEventDao.countTotal$default(this.this$0.dao, filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), EquityOrderState6.getEquityOrderStates(filter.getState()), OrderState2.getOrderStates(filter.getState()), PaymentTransfer2.getPaymentTransferStates(filter.getState()), ApiAssetType.INSTANCE.getCryptoTypes(), InvestmentScheduleEventDao2.isBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isAchAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoAchAllowed(filter.getTypes()), false, 8192, null);
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountTotal$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2", m3645f = "TraderInvestmentScheduleEventStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2$1, reason: invalid class name */
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
                                Integer num = (Integer) obj;
                                Integer numBoxInt = boxing.boxInt(num != null ? num.intValue() : 0);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow flowCountLater$default = InvestmentScheduleEventDao.countLater$default(this.this$0.dao, filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), EquityOrderState6.getEquityOrderStates(filter.getState()), OrderState2.getOrderStates(filter.getState()), PaymentTransfer2.getPaymentTransferStates(filter.getState()), ApiAssetType.INSTANCE.getCryptoTypes(), InvestmentScheduleEventDao2.isBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isAchAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoAchAllowed(filter.getTypes()), false, 32768, null);
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountLater$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2", m3645f = "TraderInvestmentScheduleEventStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2$1, reason: invalid class name */
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
                                Integer num = (Integer) obj;
                                Integer numBoxInt = boxing.boxInt(num != null ? num.intValue() : 0);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInvestmentScheduleEvent>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                InvestmentScheduleEventStore.DefaultImpls.refresh$default(this.this$0, false, null, 2, null);
                return InvestmentScheduleEventDao.getLatest$default(this.this$0.dao, filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), EquityOrderState6.getEquityOrderStates(filter.getState()), OrderState2.getOrderStates(filter.getState()), PaymentTransfer2.getPaymentTransferStates(filter.getState()), ApiAssetType.INSTANCE.getCryptoTypes(), InvestmentScheduleEventDao2.isBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isAchAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoAchAllowed(filter.getTypes()), false, 16384, null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInvestmentScheduleEvent>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return InvestmentScheduleEventDao.getLater$default(this.this$0.dao, filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), EquityOrderState6.getEquityOrderStates(filter.getState()), OrderState2.getOrderStates(filter.getState()), PaymentTransfer2.getPaymentTransferStates(filter.getState()), ApiAssetType.INSTANCE.getCryptoTypes(), InvestmentScheduleEventDao2.isBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isAchAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoAchAllowed(filter.getTypes()), false, 65536, null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInvestmentScheduleEvent>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return InvestmentScheduleEventDao.get$default(this.this$0.dao, filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), EquityOrderState6.getEquityOrderStates(filter.getState()), OrderState2.getOrderStates(filter.getState()), PaymentTransfer2.getPaymentTransferStates(filter.getState()), ApiAssetType.INSTANCE.getCryptoTypes(), InvestmentScheduleEventDao2.isBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isAchAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoAchAllowed(filter.getTypes()), false, 32768, null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInvestmentScheduleEvent>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return InvestmentScheduleEventDao.getEarlier$default(this.this$0.dao, filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), EquityOrderState6.getEquityOrderStates(filter.getState()), OrderState2.getOrderStates(filter.getState()), PaymentTransfer2.getPaymentTransferStates(filter.getState()), ApiAssetType.INSTANCE.getCryptoTypes(), InvestmentScheduleEventDao2.isBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoBpAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isAchAllowed(filter.getTypes()), InvestmentScheduleEventDao2.isCryptoAchAllowed(filter.getTypes()), false, 65536, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentScheduleEventQuery$lambda$0(TraderInvestmentScheduleEventStore traderInvestmentScheduleEventStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleEventStore.dao.get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentScheduleEventByScheduleQuery$lambda$1(TraderInvestmentScheduleEventStore traderInvestmentScheduleEventStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InvestmentScheduleEventDao.getByScheduleId$default(traderInvestmentScheduleEventStore.dao, it, false, 2, null);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public Flow<List<UiInvestmentScheduleEvent>> streamInvestmentScheduleEventBySchedule(UUID scheduleId) {
        Intrinsics.checkNotNullParameter(scheduleId, "scheduleId");
        return this.streamInvestmentScheduleEventByScheduleQuery.asFlow(scheduleId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentScheduleEventByAchTransferQuery$lambda$2(TraderInvestmentScheduleEventStore traderInvestmentScheduleEventStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleEventStore.dao.getByAchTransferId(it);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public Flow<UiInvestmentScheduleEvent> streamInvestmentScheduleEventByAchTransfer(UUID achTransferId) {
        Intrinsics.checkNotNullParameter(achTransferId, "achTransferId");
        return this.streamInvestmentScheduleEventByAchTransferQuery.asFlow(achTransferId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentScheduleEventByOrderQuery$lambda$3(TraderInvestmentScheduleEventStore traderInvestmentScheduleEventStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleEventStore.dao.getByOrderId(it);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public Flow<UiInvestmentScheduleEvent> streamInvestmentScheduleEventByOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.streamInvestmentScheduleEventByOrderQuery.asFlow(orderId);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public void refresh(boolean force, String accountNumber) {
        this.getInvestmentScheduleEvents.refreshAllPages(Tuples4.m3642to(accountNumber, ApiAssetType.EQUITY), force);
        this.getInvestmentScheduleEvents.refreshAllPages(Tuples4.m3642to(accountNumber, ApiAssetType.CRYPTO), force);
        this.getInvestmentScheduleEvents.refreshAllPages(Tuples4.m3642to(accountNumber, ApiAssetType.BROKERAGE_CASH), force);
        if (accountNumber != null) {
            this.investmentScheduleStore.refreshAccount(force, accountNumber);
        } else {
            this.investmentScheduleStore.refreshAllAccounts(force);
        }
        this.paymentTransferStore.refreshPaginated(false);
        this.orderStore.refresh(false);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public void refreshAccountFirstPage(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint.DefaultImpls.refresh$default(this.getInvestmentScheduleEvents.getEndpoint(), Tuples4.m3642to(Tuples4.m3642to(accountNumber, ApiAssetType.CRYPTO), null), false, null, 6, null);
        Endpoint.DefaultImpls.refresh$default(this.getInvestmentScheduleEvents.getEndpoint(), Tuples4.m3642to(Tuples4.m3642to(accountNumber, ApiAssetType.EQUITY), null), false, null, 6, null);
        Endpoint.DefaultImpls.refresh$default(this.getInvestmentScheduleEvents.getEndpoint(), Tuples4.m3642to(Tuples4.m3642to(accountNumber, ApiAssetType.BROKERAGE_CASH), null), false, null, 6, null);
        this.investmentScheduleStore.refreshAccount(force, accountNumber);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public void refreshByAchTransfer(boolean force, UUID achTransferId) {
        Intrinsics.checkNotNullParameter(achTransferId, "achTransferId");
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.getInvestmentScheduleEventsByAchTransfer, achTransferId, false, 2, null);
        this.investmentScheduleStore.refresh(force);
        this.paymentTransferStore.refreshPaginated(false);
        this.orderStore.refresh(false);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleEventStore
    public void refreshByOrder(boolean force, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.getInvestmentScheduleEventsByOrder, orderId, false, 2, null);
        this.investmentScheduleStore.refresh(force);
        this.paymentTransferStore.refreshPaginated(false);
        this.orderStore.refresh(false);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<UiInvestmentScheduleEvent> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
