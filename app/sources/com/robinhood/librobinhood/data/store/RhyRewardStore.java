package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.pluto.ApiMerchantOfferBanner;
import com.robinhood.models.api.pluto.ApiRhyReward;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.dao.MerchantRewardDao;
import com.robinhood.models.dao.RoundupRewardDao;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.MerchantReward3;
import com.robinhood.models.p320db.RoundupReward;
import com.robinhood.models.p320db.RoundupReward2;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner2;
import com.robinhood.models.p355ui.UiRoundupReward;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MerchantRewardTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RoundupRewardTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: RhyRewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160*2\u0006\u0010+\u001a\u00020\u0012J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0006\u0010+\u001a\u00020\u0012J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0018\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u00107R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R \u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u000203020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "Lcom/robinhood/store/Store;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "roundupRewardDao", "Lcom/robinhood/models/dao/RoundupRewardDao;", "merchantRewardDao", "Lcom/robinhood/models/dao/MerchantRewardDao;", "<init>", "(Lcom/robinhood/api/pluto/PlutoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RoundupRewardDao;Lcom/robinhood/models/dao/MerchantRewardDao;)V", "allRewardsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/pluto/ApiRhyReward;", "rewardEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/utils/Optional;", "queryReward", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/ui/UiRoundupReward;", "queryMerchantReward", "Lcom/robinhood/models/db/MerchantReward;", "roundUpHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getRoundUpHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "roundupHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getRoundupHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "merchantHistoryTransactionLoader", "getMerchantHistoryTransactionLoader", "merchantHistoryLoaderCallbacks", "getMerchantHistoryLoaderCallbacks", "getInvestmentType", "Lcom/robinhood/models/api/pluto/RoundupInvestmentType;", "staticFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "streamReward", "Lio/reactivex/Observable;", "id", "streamMerchantReward", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "bannerEndpoint", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferBanner;", "streamBanner", "Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", "rewardId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyRewardStore extends Store {
    private final PaginatedEndpoint<Unit, ApiRhyReward> allRewardsEndpoint;
    private final Endpoint<UUID, Response<ApiMerchantOfferBanner>> bannerEndpoint;
    private final HistoryLoader.Callbacks<MerchantReward> merchantHistoryLoaderCallbacks;
    private final HistoryTransactionLoader merchantHistoryTransactionLoader;
    private final MerchantRewardDao merchantRewardDao;
    private final PlutoApi pluto;
    private final Query<UUID, MerchantReward> queryMerchantReward;
    private final Query<UUID, UiRoundupReward> queryReward;
    private final Endpoint<UUID, Optional<ApiRhyReward>> rewardEndpoint;
    private final HistoryTransactionLoader roundUpHistoryTransactionLoader;
    private final HistoryLoader.Callbacks<UiRoundupReward> roundupHistoryLoaderCallbacks;
    private final RoundupRewardDao roundupRewardDao;

    /* compiled from: RhyRewardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryStaticFilter.InstrumentFilterType.values().length];
            try {
                iArr[HistoryStaticFilter.InstrumentFilterType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryStaticFilter.InstrumentFilterType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: RhyRewardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore", m3645f = "RhyRewardStore.kt", m3646l = {358}, m3647m = "streamBanner")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyRewardStore$streamBanner$1 */
    static final class C343051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343051(Continuation<? super C343051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhyRewardStore.this.streamBanner(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyRewardStore(PlutoApi pluto, StoreBundle storeBundle, RoundupRewardDao roundupRewardDao, MerchantRewardDao merchantRewardDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(roundupRewardDao, "roundupRewardDao");
        Intrinsics.checkNotNullParameter(merchantRewardDao, "merchantRewardDao");
        this.pluto = pluto;
        this.roundupRewardDao = roundupRewardDao;
        this.merchantRewardDao = merchantRewardDao;
        this.allRewardsEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new RhyRewardStore$allRewardsEndpoint$1(this, null), getLogoutKillswitch(), new RhyRewardStore$allRewardsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.rewardEndpoint = Endpoint.Companion.create$default(companion, new RhyRewardStore$rewardEndpoint$1(this, null), getLogoutKillswitch(), new RhyRewardStore$rewardEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.queryReward = Store.create$default(this, companion2, "streamRoundupReward", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyRewardStore.queryReward$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyRewardStore.queryReward$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.queryMerchantReward = Store.create$default(this, companion2, "streamMerchantReward", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyRewardStore.queryMerchantReward$lambda$2(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyRewardStore.queryMerchantReward$lambda$3(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.roundUpHistoryTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$roundUpHistoryTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.ROUNDUP_REWARD);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.streamReward(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<RoundupRewardTransaction>() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$roundUpHistoryTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super RoundupRewardTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.RhyRewardStore$roundUpHistoryTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$roundUpHistoryTransactionLoader$1$load$$inlined$map$1$2", m3645f = "RhyRewardStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.RhyRewardStore$roundUpHistoryTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                RoundupRewardTransaction roundupRewardTransaction = new RoundupRewardTransaction((UiRoundupReward) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(roundupRewardTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.roundupHistoryLoaderCallbacks = new HistoryLoader.Callbacks<UiRoundupReward>() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$roundupHistoryLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.ROUNDUP_REWARD);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
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
                this.this$0.refresh(false);
                return FlowKt.filterNotNull(this.this$0.roundupRewardDao.countTotal(filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), this.this$0.getInvestmentType(filter.getStaticFilter()), RoundupReward2.getRoundupRewardStates(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.roundupRewardDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), this.this$0.getInvestmentType(filter.getStaticFilter()), RoundupReward2.getRoundupRewardStates(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRoundupReward>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return this.this$0.roundupRewardDao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId(), this.this$0.getInvestmentType(filter.getStaticFilter()), RoundupReward2.getRoundupRewardStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRoundupReward>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.roundupRewardDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), this.this$0.getInvestmentType(filter.getStaticFilter()), RoundupReward2.getRoundupRewardStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRoundupReward>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.roundupRewardDao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), this.this$0.getInvestmentType(filter.getStaticFilter()), RoundupReward2.getRoundupRewardStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiRoundupReward>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.roundupRewardDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), this.this$0.getInvestmentType(filter.getStaticFilter()), RoundupReward2.getRoundupRewardStates(filter.getState()));
            }
        };
        this.merchantHistoryTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$merchantHistoryTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.MERCHANT_REWARD);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.streamMerchantReward(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<MerchantRewardTransaction>() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$merchantHistoryTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MerchantRewardTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.RhyRewardStore$merchantHistoryTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$merchantHistoryTransactionLoader$1$load$$inlined$map$1$2", m3645f = "RhyRewardStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.RhyRewardStore$merchantHistoryTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                MerchantRewardTransaction merchantRewardTransaction = new MerchantRewardTransaction((MerchantReward) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(merchantRewardTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.merchantHistoryLoaderCallbacks = new HistoryLoader.Callbacks<MerchantReward>() { // from class: com.robinhood.librobinhood.data.store.RhyRewardStore$merchantHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.MERCHANT_REWARD);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                this.supportedBrokerageAccountTypes = SetsKt.emptySet();
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
                return FlowKt.filterNotNull(this.this$0.merchantRewardDao.countTotal(filter.getSince(), filter.getBefore(), MerchantReward3.getMerchantRewardStates(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.merchantRewardDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, MerchantReward3.getMerchantRewardStates(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MerchantReward>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return this.this$0.merchantRewardDao.getLatest(filter.getSince(), filter.getBefore(), limit, MerchantReward3.getMerchantRewardStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MerchantReward>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.merchantRewardDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, MerchantReward3.getMerchantRewardStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MerchantReward>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.merchantRewardDao.get(filter.getSince(), filter.getBefore(), timestamp, id, MerchantReward3.getMerchantRewardStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MerchantReward>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.merchantRewardDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, MerchantReward3.getMerchantRewardStates(filter.getState()));
            }
        };
        this.bannerEndpoint = Endpoint.Companion.create$default(companion, new RhyRewardStore$bannerEndpoint$1(this, null), getLogoutKillswitch(), new RhyRewardStore$bannerEndpoint$2(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryReward$lambda$0(RhyRewardStore rhyRewardStore, UUID roundupRewardId) {
        Intrinsics.checkNotNullParameter(roundupRewardId, "roundupRewardId");
        return Endpoint.DefaultImpls.poll$default(rhyRewardStore.rewardEndpoint, roundupRewardId, RoundupReward.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryReward$lambda$1(RhyRewardStore rhyRewardStore, UUID roundupRewardId) {
        Intrinsics.checkNotNullParameter(roundupRewardId, "roundupRewardId");
        return rhyRewardStore.roundupRewardDao.getRoundupReward(roundupRewardId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryMerchantReward$lambda$2(RhyRewardStore rhyRewardStore, UUID rewardId) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        return Endpoint.DefaultImpls.poll$default(rhyRewardStore.rewardEndpoint, rewardId, MerchantReward.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryMerchantReward$lambda$3(RhyRewardStore rhyRewardStore, UUID rewardId) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        return rhyRewardStore.merchantRewardDao.getMerchantReward(rewardId);
    }

    public final HistoryTransactionLoader getRoundUpHistoryTransactionLoader() {
        return this.roundUpHistoryTransactionLoader;
    }

    public final HistoryLoader.Callbacks<UiRoundupReward> getRoundupHistoryLoaderCallbacks() {
        return this.roundupHistoryLoaderCallbacks;
    }

    public final HistoryTransactionLoader getMerchantHistoryTransactionLoader() {
        return this.merchantHistoryTransactionLoader;
    }

    public final HistoryLoader.Callbacks<MerchantReward> getMerchantHistoryLoaderCallbacks() {
        return this.merchantHistoryLoaderCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoundupInvestmentType getInvestmentType(HistoryStaticFilter staticFilter) {
        HistoryStaticFilter.InstrumentFilter instrumentFilter;
        HistoryStaticFilter.InstrumentFilterType type2 = (staticFilter == null || (instrumentFilter = staticFilter.getInstrumentFilter()) == null) ? null : instrumentFilter.getType();
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return RoundupInvestmentType.STOCK;
        }
        if (i == 2) {
            return RoundupInvestmentType.CRYPTO;
        }
        if (staticFilter != null ? Intrinsics.areEqual(staticFilter.isCrypto(), Boolean.TRUE) : false) {
            return RoundupInvestmentType.CRYPTO;
        }
        if (staticFilter != null ? Intrinsics.areEqual(staticFilter.isBrokerage(), Boolean.TRUE) : false) {
            return RoundupInvestmentType.STOCK;
        }
        return null;
    }

    public final Observable<UiRoundupReward> streamReward(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.queryReward.asObservable(id);
    }

    public final Observable<MerchantReward> streamMerchantReward(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.queryMerchantReward.asObservable(id);
    }

    public final Job refresh(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.allRewardsEndpoint, force);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamBanner(UUID uuid, Continuation<? super MerchantOfferBanner> continuation) {
        C343051 c343051;
        if (continuation instanceof C343051) {
            c343051 = (C343051) continuation;
            int i = c343051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343051.label = i - Integer.MIN_VALUE;
            } else {
                c343051 = new C343051(continuation);
            }
        }
        C343051 c3430512 = c343051;
        Object objForceFetch$default = c3430512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3430512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, Response<ApiMerchantOfferBanner>> endpoint = this.bannerEndpoint;
            c3430512.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c3430512, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiMerchantOfferBanner apiMerchantOfferBanner = (ApiMerchantOfferBanner) ((Response) objForceFetch$default).body();
        if (apiMerchantOfferBanner != null) {
            return MerchantOfferBanner2.toDbModel(apiMerchantOfferBanner);
        }
        return null;
    }
}
