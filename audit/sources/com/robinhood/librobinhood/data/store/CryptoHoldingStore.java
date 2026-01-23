package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.models.api.ApiCryptoHolding;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CryptoHoldingDao;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Observable;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHoldingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u0001:\u0003567BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019J\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0019J\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00192\u0006\u0010#\u001a\u00020\u001fJ \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0!J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001d2\u0006\u0010.\u001a\u00020/J\u0016\u00100\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u00101\u001a\u00020\u001fJ\u0016\u00102\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u00103\u001a\u000204R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoHoldingDao", "Lcom/robinhood/models/crypto/dao/CryptoHoldingDao;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/models/crypto/dao/CryptoHoldingDao;Lcom/robinhood/models/crypto/dao/CurrencyDao;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/models/api/retrofit/NummusApi;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;)V", "fetchHoldingsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore$FetchCryptoHoldingParams;", "Lcom/robinhood/models/api/ApiCryptoHolding;", "streamLocalCryptoHoldingOptional", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/CryptoHolding;", "streamLocalCryptoHoldingByAccountId", "Lkotlinx/coroutines/flow/Flow;", "nummusAccountId", "Ljava/util/UUID;", "streamCryptoHoldings", "", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "currencyPairId", "streamCryptoHoldingList", "currencyPairIds", "refresh", "", "force", "", "queryCryptoHoldingsForCurrencyPairId", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore$StreamCryptoHoldingsForCurrencyPairIdParams;", "streamCryptoHoldingsForCurrencyPairId", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "refreshForAccountId", "cryptoAccountId", "refreshForAccountNumber", "accountNumber", "", "StreamCryptoHoldingsForCurrencyPairIdParams", "FetchCryptoHoldingParams", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class CryptoHoldingStore extends Store {
    private static final String CODE_LOCAL = "USD";
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHoldingDao cryptoHoldingDao;
    private final CurrencyDao currencyDao;
    private final CurrencyPairV2Store currencyPairStore;
    private final PaginatedEndpoint<FetchCryptoHoldingParams, ApiCryptoHolding> fetchHoldingsEndpoint;
    private final NummusApi nummus;
    private final Query<StreamCryptoHoldingsForCurrencyPairIdParams, Optional<UiCryptoHolding>> queryCryptoHoldingsForCurrencyPairId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHoldingStore(StoreBundle storeBundle, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoHoldingDao cryptoHoldingDao, CurrencyDao currencyDao, CryptoAccountStore cryptoAccountStore, NummusApi nummus2, CurrencyPairV2Store currencyPairStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingDao, "cryptoHoldingDao");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoHoldingDao = cryptoHoldingDao;
        this.currencyDao = currencyDao;
        this.cryptoAccountStore = cryptoAccountStore;
        this.nummus = nummus2;
        this.currencyPairStore = currencyPairStore;
        this.fetchHoldingsEndpoint = PaginatedEndpoint.Companion.createWithParams$default(PaginatedEndpoint.INSTANCE, new CryptoHoldingStore2(this, null), getLogoutKillswitch(), new CryptoHoldingStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.queryCryptoHoldingsForCurrencyPairId = Store.create$default(this, Query.INSTANCE, "streamCryptoHoldingsForCurrencyPairId", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHoldingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHoldingStore.queryCryptoHoldingsForCurrencyPairId$lambda$1(this.f$0, (CryptoHoldingStore.StreamCryptoHoldingsForCurrencyPairIdParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHoldingStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHoldingStore.queryCryptoHoldingsForCurrencyPairId$lambda$3(this.f$0, (CryptoHoldingStore.StreamCryptoHoldingsForCurrencyPairIdParams) obj);
            }
        }, false, 8, null);
    }

    public final Observable<Optional<CryptoHolding>> streamLocalCryptoHoldingOptional() {
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(CryptoHoldingDao.getCryptoHoldingOrEmptyByCode$default(this.cryptoHoldingDao, CODE_LOCAL, null, 2, null))));
    }

    public final Flow<CryptoHolding> streamLocalCryptoHoldingByAccountId(UUID nummusAccountId) {
        Intrinsics.checkNotNullParameter(nummusAccountId, "nummusAccountId");
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.cryptoHoldingDao.getCryptoHoldingOrEmptyByCode(CODE_LOCAL, nummusAccountId));
        return new Flow<CryptoHolding>() { // from class: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamLocalCryptoHoldingByAccountId$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamLocalCryptoHoldingByAccountId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamLocalCryptoHoldingByAccountId$$inlined$map$1$2", m3645f = "CryptoHoldingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamLocalCryptoHoldingByAccountId$$inlined$map$1$2$1, reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objFirstOrNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super CryptoHolding> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<List<UiCryptoHolding>> streamCryptoHoldings() {
        return asObservable(takeWhileLoggedIn(this.cryptoHoldingDao.getCryptoHoldings()));
    }

    public final Observable<Optional<UiCryptoHolding>> streamCryptoHoldings(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.cryptoHoldingDao.getCryptoHoldingOrEmpty(currencyPairId))));
    }

    /* compiled from: CryptoHoldingStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "uuid", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamCryptoHoldingList$1", m3645f = "CryptoHoldingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamCryptoHoldingList$1 */
    /* loaded from: classes13.dex */
    static final class C337121 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Flow<? extends List<? extends UiCryptoHolding>>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C337121(Continuation<? super C337121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C337121 c337121 = CryptoHoldingStore.this.new C337121(continuation);
            c337121.L$0 = obj;
            return c337121;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Flow<? extends List<? extends UiCryptoHolding>>> continuation) {
            return invoke2(uuid, (Continuation<? super Flow<? extends List<UiCryptoHolding>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UUID uuid, Continuation<? super Flow<? extends List<UiCryptoHolding>>> continuation) {
            return ((C337121) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            CryptoHoldingStore cryptoHoldingStore = CryptoHoldingStore.this;
            return FlowKt.take(cryptoHoldingStore.takeWhileLoggedIn(cryptoHoldingStore.cryptoHoldingDao.getCryptoHoldingOrEmpty(uuid)), 1);
        }
    }

    public final Observable<List<UiCryptoHolding>> streamCryptoHoldingList(List<UUID> currencyPairIds) {
        Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
        return asObservable(FlowKt.flatMapConcat(FlowKt.asFlow(currencyPairIds), new C337121(null)));
    }

    /* compiled from: CryptoHoldingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$refresh$1", m3645f = "CryptoHoldingStore.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$refresh$1 */
    /* loaded from: classes13.dex */
    static final class C337101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337101(boolean z, Continuation<? super C337101> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHoldingStore.this.new C337101(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C337101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Optional<CryptoAccount>> flowStreamAccountOptional = CryptoHoldingStore.this.cryptoAccountStore.streamAccountOptional();
                this.label = 1;
                obj = FlowKt.first(flowStreamAccountOptional, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((CryptoAccount) ((Optional) obj).getOrNull()) != null) {
                CryptoHoldingStore.this.fetchHoldingsEndpoint.refreshAllPages(new FetchCryptoHoldingParams(null), this.$force);
                CryptoHoldingStore.this.currencyPairStore.refreshAll(false);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refresh(boolean force) {
        this.cryptoAccountStore.refresh(false);
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C337101(force, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryCryptoHoldingsForCurrencyPairId$lambda$1(CryptoHoldingStore cryptoHoldingStore, StreamCryptoHoldingsForCurrencyPairIdParams it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default(cryptoHoldingStore.fetchHoldingsEndpoint, new FetchCryptoHoldingParams(it.getCryptoAccountId()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryCryptoHoldingsForCurrencyPairId$lambda$3(CryptoHoldingStore cryptoHoldingStore, StreamCryptoHoldingsForCurrencyPairIdParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final Flow<UiCryptoHolding> cryptoHolding = cryptoHoldingStore.cryptoHoldingDao.getCryptoHolding(params.getCurrencyPairId(), params.getCryptoAccountId());
        return new Flow<Optional<? extends UiCryptoHolding>>() { // from class: com.robinhood.librobinhood.data.store.CryptoHoldingStore$queryCryptoHoldingsForCurrencyPairId$lambda$3$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends UiCryptoHolding>> flowCollector, Continuation continuation) {
                Object objCollect = cryptoHolding.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$queryCryptoHoldingsForCurrencyPairId$lambda$3$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$queryCryptoHoldingsForCurrencyPairId$lambda$3$$inlined$map$1$2", m3645f = "CryptoHoldingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$queryCryptoHoldingsForCurrencyPairId$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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
                        Optional optionalAsOptional = Optional3.asOptional((UiCryptoHolding) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<UiCryptoHolding> streamCryptoHoldingsForCurrencyPairId(CryptoAccountSwitcherLocation.WithCurrencyPair location) {
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow flowTransformLatest = FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C33706x1704c365(null, this, location));
        return new Flow<UiCryptoHolding>() { // from class: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamCryptoHoldingsForCurrencyPairId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiCryptoHolding> flowCollector, Continuation continuation) {
                Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamCryptoHoldingsForCurrencyPairId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamCryptoHoldingsForCurrencyPairId$$inlined$map$1$2", m3645f = "CryptoHoldingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$streamCryptoHoldingsForCurrencyPairId$$inlined$map$1$2$1, reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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

    /* compiled from: CryptoHoldingStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore$StreamCryptoHoldingsForCurrencyPairIdParams;", "", "currencyPairId", "Ljava/util/UUID;", "cryptoAccountId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getCryptoAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class StreamCryptoHoldingsForCurrencyPairIdParams {
        private final UUID cryptoAccountId;
        private final UUID currencyPairId;

        public static /* synthetic */ StreamCryptoHoldingsForCurrencyPairIdParams copy$default(StreamCryptoHoldingsForCurrencyPairIdParams streamCryptoHoldingsForCurrencyPairIdParams, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = streamCryptoHoldingsForCurrencyPairIdParams.currencyPairId;
            }
            if ((i & 2) != 0) {
                uuid2 = streamCryptoHoldingsForCurrencyPairIdParams.cryptoAccountId;
            }
            return streamCryptoHoldingsForCurrencyPairIdParams.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }

        public final StreamCryptoHoldingsForCurrencyPairIdParams copy(UUID currencyPairId, UUID cryptoAccountId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(cryptoAccountId, "cryptoAccountId");
            return new StreamCryptoHoldingsForCurrencyPairIdParams(currencyPairId, cryptoAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamCryptoHoldingsForCurrencyPairIdParams)) {
                return false;
            }
            StreamCryptoHoldingsForCurrencyPairIdParams streamCryptoHoldingsForCurrencyPairIdParams = (StreamCryptoHoldingsForCurrencyPairIdParams) other;
            return Intrinsics.areEqual(this.currencyPairId, streamCryptoHoldingsForCurrencyPairIdParams.currencyPairId) && Intrinsics.areEqual(this.cryptoAccountId, streamCryptoHoldingsForCurrencyPairIdParams.cryptoAccountId);
        }

        public int hashCode() {
            return (this.currencyPairId.hashCode() * 31) + this.cryptoAccountId.hashCode();
        }

        public String toString() {
            return "StreamCryptoHoldingsForCurrencyPairIdParams(currencyPairId=" + this.currencyPairId + ", cryptoAccountId=" + this.cryptoAccountId + ")";
        }

        public StreamCryptoHoldingsForCurrencyPairIdParams(UUID currencyPairId, UUID cryptoAccountId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(cryptoAccountId, "cryptoAccountId");
            this.currencyPairId = currencyPairId;
            this.cryptoAccountId = cryptoAccountId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }
    }

    public final void refreshForAccountId(boolean force, UUID cryptoAccountId) {
        Intrinsics.checkNotNullParameter(cryptoAccountId, "cryptoAccountId");
        this.fetchHoldingsEndpoint.refreshAllPages(new FetchCryptoHoldingParams(cryptoAccountId), force);
        this.currencyPairStore.refreshAll(false);
    }

    /* compiled from: CryptoHoldingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$refreshForAccountNumber$1", m3645f = "CryptoHoldingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$refreshForAccountNumber$1 */
    /* loaded from: classes13.dex */
    static final class C337111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337111(boolean z, String str, Continuation<? super C337111> continuation) {
            super(2, continuation);
            this.$force = z;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHoldingStore.this.new C337111(this.$force, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C337111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoHoldingStore.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                this.label = 1;
                obj = FlowKt.first(flowStreamCryptoMibExperiment, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoAccount cryptoAccount = (CryptoAccount) obj;
                if (cryptoAccount != null) {
                    CryptoHoldingStore.this.fetchHoldingsEndpoint.refreshAllPages(new FetchCryptoHoldingParams(StringsKt.toUuid(cryptoAccount.getId())), this.$force);
                    CryptoHoldingStore.this.currencyPairStore.refreshAll(this.$force);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                CryptoHoldingStore.this.refresh(this.$force);
                return Unit.INSTANCE;
            }
            Flow<CryptoAccount> flowStreamSelectedAccountByAccountNumber = CryptoHoldingStore.this.cryptoAccountStore.streamSelectedAccountByAccountNumber(this.$accountNumber);
            this.label = 2;
            obj = FlowKt.firstOrNull(flowStreamSelectedAccountByAccountNumber, this);
        }
    }

    public final void refreshForAccountNumber(boolean force, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C337111(force, accountNumber, null), 3, null);
    }

    /* compiled from: CryptoHoldingStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore$FetchCryptoHoldingParams;", "", "cryptoAccountId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCryptoAccountId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class FetchCryptoHoldingParams {
        private final UUID cryptoAccountId;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchCryptoHoldingParams() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FetchCryptoHoldingParams copy$default(FetchCryptoHoldingParams fetchCryptoHoldingParams, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = fetchCryptoHoldingParams.cryptoAccountId;
            }
            return fetchCryptoHoldingParams.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }

        public final FetchCryptoHoldingParams copy(UUID cryptoAccountId) {
            return new FetchCryptoHoldingParams(cryptoAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchCryptoHoldingParams) && Intrinsics.areEqual(this.cryptoAccountId, ((FetchCryptoHoldingParams) other).cryptoAccountId);
        }

        public int hashCode() {
            UUID uuid = this.cryptoAccountId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "FetchCryptoHoldingParams(cryptoAccountId=" + this.cryptoAccountId + ")";
        }

        public FetchCryptoHoldingParams(UUID uuid) {
            this.cryptoAccountId = uuid;
        }

        public /* synthetic */ FetchCryptoHoldingParams(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }
    }
}
