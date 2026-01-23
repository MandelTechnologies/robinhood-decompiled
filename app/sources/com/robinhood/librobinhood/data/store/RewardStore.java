package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.models.api.ApiRewardSection;
import com.robinhood.models.api.ApiRewards2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.RewardDao;
import com.robinhood.models.p320db.CashReward;
import com.robinhood.models.p320db.RewardsKt;
import com.robinhood.models.p320db.StockReward;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p355ui.UiRewards3;
import com.robinhood.models.p355ui.UiStockRewardSection;
import com.robinhood.referral.api.RewardsApi;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.StockRewardItemTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: RewardStore.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\u00162\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R)\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00100*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104¨\u00067"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/referral/api/RewardsApi;", "rewardsApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/RewardDao;", "dao", "<init>", "(Lcom/robinhood/referral/api/RewardsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RewardDao;)V", "", "force", "", "refresh", "(Z)V", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/ui/UiStockRewardSection;", "streamSections", "()Lio/reactivex/Observable;", "Ljava/util/UUID;", "id", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/UiRewardItem;", "streamItem", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/StockReward;", "streamReward", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "Lcom/robinhood/models/db/CashReward;", "streamCashReward", "j$/time/Duration", "duration", "pollAllStockRewards", "(Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/referral/api/RewardsApi;", "Lcom/robinhood/models/dao/RewardDao;", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiRewardSection;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "stockRewardHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getStockRewardHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "cashRewardHistoryTransactionLoader", "getCashRewardHistoryTransactionLoader", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RewardStore extends Store {
    private final HistoryTransactionLoader cashRewardHistoryTransactionLoader;
    private final RewardDao dao;
    private final Endpoint<Unit, List<ApiRewardSection>> endpoint;
    private final HistoryLoader.Callbacks<UiRewards3> historyLoaderCallbacks;
    private final RewardsApi rewardsApi;
    private final HistoryTransactionLoader stockRewardHistoryTransactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardStore(RewardsApi rewardsApi, StoreBundle storeBundle, RewardDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.rewardsApi = rewardsApi;
        this.dao = dao;
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiRewards3>() { // from class: com.robinhood.librobinhood.data.store.RewardStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.STOCK_REWARD_ITEM, HistoryTransactionType.CASH_REWARD_ITEM);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
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

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                RewardDao rewardDao = this.this$0.dao;
                Set<ApiRewards2.State> stockRewardStates = RewardsKt.getStockRewardStates(filter.getState());
                Set<ApiRewards2.State> cashRewardStates = RewardsKt.getCashRewardStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                UUID staticAssetId = filter.getStaticAssetId();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return rewardDao.countTotalItems(stockRewardStates, cashRewardStates, since, before, staticAssetId, staticFilter != null ? staticFilter.isCrypto() : null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                RewardDao rewardDao = this.this$0.dao;
                Set<ApiRewards2.State> stockRewardStates = RewardsKt.getStockRewardStates(filter.getState());
                Set<ApiRewards2.State> cashRewardStates = RewardsKt.getCashRewardStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                UUID staticAssetId = filter.getStaticAssetId();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return rewardDao.countLaterItems(stockRewardStates, cashRewardStates, since, before, timestamp, id, staticAssetId, staticFilter != null ? staticFilter.isCrypto() : null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRewards3>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                RewardDao rewardDao = this.this$0.dao;
                Set<ApiRewards2.State> stockRewardStates = RewardsKt.getStockRewardStates(filter.getState());
                Set<ApiRewards2.State> cashRewardStates = RewardsKt.getCashRewardStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                UUID staticAssetId = filter.getStaticAssetId();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return rewardDao.getLatestItems(stockRewardStates, cashRewardStates, since, before, limit, staticAssetId, staticFilter != null ? staticFilter.isCrypto() : null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRewards3>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                RewardDao rewardDao = this.this$0.dao;
                Set<ApiRewards2.State> stockRewardStates = RewardsKt.getStockRewardStates(filter.getState());
                Set<ApiRewards2.State> cashRewardStates = RewardsKt.getCashRewardStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                UUID staticAssetId = filter.getStaticAssetId();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return rewardDao.getLaterItems(stockRewardStates, cashRewardStates, since, before, timestamp, id, limit, staticAssetId, staticFilter != null ? staticFilter.isCrypto() : null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRewards3>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                RewardDao rewardDao = this.this$0.dao;
                Set<ApiRewards2.State> stockRewardStates = RewardsKt.getStockRewardStates(filter.getState());
                Set<ApiRewards2.State> cashRewardStates = RewardsKt.getCashRewardStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                UUID staticAssetId = filter.getStaticAssetId();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return rewardDao.getItem(stockRewardStates, cashRewardStates, since, before, timestamp, id, staticAssetId, staticFilter != null ? staticFilter.isCrypto() : null);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRewards3>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                RewardDao rewardDao = this.this$0.dao;
                Set<ApiRewards2.State> stockRewardStates = RewardsKt.getStockRewardStates(filter.getState());
                Set<ApiRewards2.State> cashRewardStates = RewardsKt.getCashRewardStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                UUID staticAssetId = filter.getStaticAssetId();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return rewardDao.getEarlierItems(stockRewardStates, cashRewardStates, since, before, timestamp, id, limit, staticAssetId, staticFilter != null ? staticFilter.isCrypto() : null);
            }
        };
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RewardStore3(this, null), getLogoutKillswitch(), new RewardStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.stockRewardHistoryTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.RewardStore$stockRewardHistoryTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.STOCK_REWARD_ITEM);
                final Flow<UiRewards3> flowStreamItem = this.this$0.streamItem(reference.getSourceId());
                return new Flow<StockRewardItemTransaction>() { // from class: com.robinhood.librobinhood.data.store.RewardStore$stockRewardHistoryTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StockRewardItemTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamItem.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.RewardStore$stockRewardHistoryTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RewardStore$stockRewardHistoryTransactionLoader$1$load$$inlined$map$1$2", m3645f = "RewardStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.RewardStore$stockRewardHistoryTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                StockRewardItemTransaction stockRewardItemTransaction = new StockRewardItemTransaction((UiRewards3) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(stockRewardItemTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.cashRewardHistoryTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.RewardStore$cashRewardHistoryTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.CASH_REWARD_ITEM);
                final Flow<UiRewards3> flowStreamItem = this.this$0.streamItem(reference.getSourceId());
                return new Flow<StockRewardItemTransaction>() { // from class: com.robinhood.librobinhood.data.store.RewardStore$cashRewardHistoryTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StockRewardItemTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamItem.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.RewardStore$cashRewardHistoryTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RewardStore$cashRewardHistoryTransactionLoader$1$load$$inlined$map$1$2", m3645f = "RewardStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.RewardStore$cashRewardHistoryTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                StockRewardItemTransaction stockRewardItemTransaction = new StockRewardItemTransaction((UiRewards3) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(stockRewardItemTransaction, anonymousClass1) == coroutine_suspended) {
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
    }

    public final HistoryLoader.Callbacks<UiRewards3> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final Endpoint<Unit, List<ApiRewardSection>> getEndpoint() {
        return this.endpoint;
    }

    public final HistoryTransactionLoader getStockRewardHistoryTransactionLoader() {
        return this.stockRewardHistoryTransactionLoader;
    }

    public final HistoryTransactionLoader getCashRewardHistoryTransactionLoader() {
        return this.cashRewardHistoryTransactionLoader;
    }

    public static /* synthetic */ void refresh$default(RewardStore rewardStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rewardStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<List<UiStockRewardSection>> streamSections() {
        return asObservable(takeWhileLoggedIn(this.dao.getSections()));
    }

    public final Flow<UiRewards3> streamItem(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.filterNotNull(takeWhileLoggedIn(this.dao.getItem(id)));
    }

    public final Observable<StockReward> streamReward(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getReward(id))));
    }

    public final Observable<CashReward> streamCashReward(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getCashReward(id))));
    }

    public static /* synthetic */ Flow pollAllStockRewards$default(RewardStore rewardStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return rewardStore.pollAllStockRewards(duration);
    }

    public final Flow<List<StockReward>> pollAllStockRewards(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.transformLatest(Endpoint8.poll$default(this.endpoint, duration, null, 2, null), new RewardStore$pollAllStockRewards$$inlined$flatMapLatest$1(null, this));
    }
}
