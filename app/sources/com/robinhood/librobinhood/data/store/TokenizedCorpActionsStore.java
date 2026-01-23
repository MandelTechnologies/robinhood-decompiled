package com.robinhood.librobinhood.data.store;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.dao.TokenizedDividendDao;
import com.robinhood.models.crypto.dao.TokenizedSplitPaymentDao;
import com.robinhood.models.crypto.p314db.tokenized.TokenizedSplitPayment;
import com.robinhood.models.crypto.p315ui.tokenized.UiTokenizedDividend;
import com.robinhood.models.crypto.p315ui.tokenized.UiTokenizedSplitPayment;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.TokenizedCorpActionDividendTransaction;
import com.robinhood.shared.models.history.TokenizedCorpActionSplitPaymentTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.CorpActionCashDividendsPaymentDto;
import nummus.p512v1.CorpActionSplitPaymentDto;
import nummus.p512v1.RestNummusService;
import p479j$.time.Instant;

/* compiled from: TokenizedCorpActionsStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0!2\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TokenizedCorpActionsStore;", "Lcom/robinhood/store/Store;", "nummusService", "Lnummus/v1/RestNummusService;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "splitPaymentDao", "Lcom/robinhood/models/crypto/dao/TokenizedSplitPaymentDao;", "dividendDao", "Lcom/robinhood/models/crypto/dao/TokenizedDividendDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lnummus/v1/RestNummusService;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/models/crypto/dao/TokenizedSplitPaymentDao;Lcom/robinhood/models/crypto/dao/TokenizedDividendDao;Lcom/robinhood/store/StoreBundle;)V", "splitPaymentsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lnummus/v1/CorpActionSplitPaymentDto;", "splitsHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/crypto/ui/tokenized/UiTokenizedSplitPayment;", "getSplitsHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "dividendsPaymentsEndpoint", "Lnummus/v1/CorpActionCashDividendsPaymentDto;", "dividendsHistoryLoaderCallbacks", "Lcom/robinhood/models/crypto/ui/tokenized/UiTokenizedDividend;", "getDividendsHistoryLoaderCallbacks", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamSplitPayment", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "streamDividend", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TokenizedCorpActionsStore extends Store {
    private final CurrencyPairV2Store currencyPairV2Store;
    private final TokenizedDividendDao dividendDao;
    private final HistoryLoader.Callbacks<UiTokenizedDividend> dividendsHistoryLoaderCallbacks;
    private final PaginatedEndpoint<Unit, CorpActionCashDividendsPaymentDto> dividendsPaymentsEndpoint;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final RestNummusService nummusService;
    private final TokenizedSplitPaymentDao splitPaymentDao;
    private final PaginatedEndpoint<Unit, CorpActionSplitPaymentDto> splitPaymentsEndpoint;
    private final HistoryLoader.Callbacks<UiTokenizedSplitPayment> splitsHistoryLoaderCallbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizedCorpActionsStore(RestNummusService nummusService, CurrencyPairV2Store currencyPairV2Store, TokenizedSplitPaymentDao splitPaymentDao, TokenizedDividendDao dividendDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(splitPaymentDao, "splitPaymentDao");
        Intrinsics.checkNotNullParameter(dividendDao, "dividendDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusService = nummusService;
        this.currencyPairV2Store = currencyPairV2Store;
        this.splitPaymentDao = splitPaymentDao;
        this.dividendDao = dividendDao;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.splitPaymentsEndpoint = PaginatedEndpoint.Companion.create$default(companion, new TokenizedCorpActionsStore6(this, null), getLogoutKillswitch(), new TokenizedCorpActionsStore7(this, null), storeBundle.getClock(), null, 16, null);
        this.splitsHistoryLoaderCallbacks = new HistoryLoader.Callbacks<UiTokenizedSplitPayment>() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$splitsHistoryLoaderCallbacks$1
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return SetsKt.setOf(HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return SetsKt.emptySet();
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.currencyPairV2Store.refreshAll(false);
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.splitPaymentsEndpoint, Unit.INSTANCE, false, 2, null);
                return FlowKt.filterNotNull(this.this$0.splitPaymentDao.countTotal(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.splitPaymentDao.countLater(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedSplitPayment>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.splitPaymentsEndpoint, Unit.INSTANCE, false, 2, null);
                this.this$0.currencyPairV2Store.refreshAll(false);
                return this.this$0.splitPaymentDao.getLatest(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedSplitPayment>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.splitPaymentDao.getLater(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedSplitPayment>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.splitPaymentDao.get(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), id, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedSplitPayment>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.splitPaymentDao.getEarlier(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), timestamp, id, limit);
            }
        };
        this.dividendsPaymentsEndpoint = PaginatedEndpoint.Companion.create$default(companion, new TokenizedCorpActionsStore3(this, null), getLogoutKillswitch(), new TokenizedCorpActionsStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.dividendsHistoryLoaderCallbacks = new HistoryLoader.Callbacks<UiTokenizedDividend>() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$dividendsHistoryLoaderCallbacks$1
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return SetsKt.setOf(HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return SetsKt.emptySet();
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.dividendsPaymentsEndpoint, Unit.INSTANCE, false, 2, null);
                this.this$0.currencyPairV2Store.refreshAll(false);
                return FlowKt.filterNotNull(this.this$0.dividendDao.countTotal(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dividendDao.countLater(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedDividend>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.dividendsPaymentsEndpoint, Unit.INSTANCE, false, 2, null);
                this.this$0.currencyPairV2Store.refreshAll(false);
                return this.this$0.dividendDao.getLatest(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedDividend>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dividendDao.getLater(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedDividend>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dividendDao.get(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), id, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiTokenizedDividend>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dividendDao.getEarlier(TokenizedSplitPayment.INSTANCE.getSplitPaymentStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), timestamp, id, limit);
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1

            /* compiled from: TokenizedCorpActionsStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HistoryTransactionType.values().length];
                    try {
                        iArr[HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS, HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS}));
                int i = WhenMappings.$EnumSwitchMapping$0[reference.getSourceType().ordinal()];
                if (i == 1) {
                    final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.splitPaymentDao.getWithId(reference.getSourceId()));
                    return new Flow<TokenizedCorpActionSplitPaymentTransaction>() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super TokenizedCorpActionSplitPaymentTransaction> flowCollector, Continuation continuation) {
                            Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "TokenizedCorpActionsStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                    TokenizedCorpActionSplitPaymentTransaction tokenizedCorpActionSplitPaymentTransaction = new TokenizedCorpActionSplitPaymentTransaction((UiTokenizedSplitPayment) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tokenizedCorpActionSplitPaymentTransaction, anonymousClass1) == coroutine_suspended) {
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
                if (i == 2) {
                    final Flow flowFilterNotNull2 = FlowKt.filterNotNull(this.this$0.dividendDao.getWithId(reference.getSourceId()));
                    return new Flow<TokenizedCorpActionDividendTransaction>() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$2
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super TokenizedCorpActionDividendTransaction> flowCollector, Continuation continuation) {
                            Object objCollect = flowFilterNotNull2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$2$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$2$2", m3645f = "TokenizedCorpActionsStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$historyTransactionLoader$1$load$$inlined$map$2$2$1, reason: invalid class name */
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
                                    TokenizedCorpActionDividendTransaction tokenizedCorpActionDividendTransaction = new TokenizedCorpActionDividendTransaction((UiTokenizedDividend) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tokenizedCorpActionDividendTransaction, anonymousClass1) == coroutine_suspended) {
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
                throw new IllegalArgumentException("Unsupported transaction type: " + reference.getSourceType());
            }
        };
    }

    public final HistoryLoader.Callbacks<UiTokenizedSplitPayment> getSplitsHistoryLoaderCallbacks() {
        return this.splitsHistoryLoaderCallbacks;
    }

    public final HistoryLoader.Callbacks<UiTokenizedDividend> getDividendsHistoryLoaderCallbacks() {
        return this.dividendsHistoryLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final Flow<UiTokenizedSplitPayment> streamSplitPayment(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final Flow<MinervaTransaction> flowLoad = this.historyTransactionLoader.load(new TransactionReference(id, HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS, null, null, false, 28, null));
        return new Flow<UiTokenizedSplitPayment>() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamSplitPayment$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiTokenizedSplitPayment> flowCollector, Continuation continuation) {
                Object objCollect = flowLoad.collect(new C343732(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamSplitPayment$$inlined$map$1$2 */
            public static final class C343732<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamSplitPayment$$inlined$map$1$2", m3645f = "TokenizedCorpActionsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamSplitPayment$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C343732.this.emit(null, this);
                    }
                }

                public C343732(FlowCollector flowCollector) {
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
                        HistoryEvent event = ((MinervaTransaction) obj).getEvent();
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.models.crypto.ui.tokenized.UiTokenizedSplitPayment");
                        anonymousClass1.label = 1;
                        if (flowCollector.emit((UiTokenizedSplitPayment) event, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<UiTokenizedDividend> streamDividend(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final Flow<MinervaTransaction> flowLoad = this.historyTransactionLoader.load(new TransactionReference(id, HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS, null, null, false, 28, null));
        return new Flow<UiTokenizedDividend>() { // from class: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamDividend$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiTokenizedDividend> flowCollector, Continuation continuation) {
                Object objCollect = flowLoad.collect(new C343722(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamDividend$$inlined$map$1$2 */
            public static final class C343722<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamDividend$$inlined$map$1$2", m3645f = "TokenizedCorpActionsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$streamDividend$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C343722.this.emit(null, this);
                    }
                }

                public C343722(FlowCollector flowCollector) {
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
                        HistoryEvent event = ((MinervaTransaction) obj).getEvent();
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.models.crypto.ui.tokenized.UiTokenizedDividend");
                        anonymousClass1.label = 1;
                        if (flowCollector.emit((UiTokenizedDividend) event, anonymousClass1) == coroutine_suspended) {
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
}
