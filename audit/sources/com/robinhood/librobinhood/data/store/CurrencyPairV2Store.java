package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.models.crypto.dao.CurrencyPairDao;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: CurrencyPairV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u001b\u001a\u00020\u0014J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\u0006\u0010\u001b\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010 J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180%0\u001aJ\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180%0\u001dJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fJ\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u001a2\u0006\u0010.\u001a\u00020/J\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u001a2\u0006\u00101\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\"X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180%0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "currencyRhRoomDao", "Lcom/robinhood/models/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/crypto/dao/CurrencyPairDao;", "currencyPairRhRoomDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/models/crypto/dao/CurrencyDao;Lcom/robinhood/models/dao/CurrencyDao;Lcom/robinhood/models/crypto/dao/CurrencyPairDao;Lcom/robinhood/models/dao/CurrencyPairDao;Lcom/robinhood/models/api/retrofit/NummusApi;)V", "getCurrencyPairEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiCurrencyPair;", "getCurrencyPairQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "streamCurrencyPair", "Lio/reactivex/Observable;", "id", "streamCurrencyPairFlow", "Lkotlinx/coroutines/flow/Flow;", "isTokenizedStock", "", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrencyPairsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "getCurrencyPairsQuery", "", "streamCurrencyPairs", "streamCachedCurrencyPairs", "refreshAll", "Lkotlinx/coroutines/Job;", "force", "streamCurrencyOptional", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/Currency;", "currencyCode", "", "streamCurrencyByIdOptional", "currencyId", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class CurrencyPairV2Store extends Store {
    private final AuthManager authManager;
    private final CurrencyDao currencyDao;
    private final CurrencyPairDao currencyPairDao;
    private final com.robinhood.models.dao.CurrencyPairDao currencyPairRhRoomDao;
    private final com.robinhood.models.dao.CurrencyDao currencyRhRoomDao;
    private final Endpoint<UUID, ApiCurrencyPair> getCurrencyPairEndpoint;
    private final Query<UUID, UiCurrencyPair> getCurrencyPairQuery;
    private final PaginatedEndpoint<Unit, ApiCurrencyPair> getCurrencyPairsEndpoint;
    private final Query<Unit, List<UiCurrencyPair>> getCurrencyPairsQuery;
    private final NummusApi nummus;

    /* compiled from: CurrencyPairV2Store.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairV2Store", m3645f = "CurrencyPairV2Store.kt", m3646l = {94}, m3647m = "isTokenizedStock")
    /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$isTokenizedStock$1 */
    /* loaded from: classes13.dex */
    static final class C337911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337911(Continuation<? super C337911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CurrencyPairV2Store.this.isTokenizedStock(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyPairV2Store(StoreBundle storeBundle, AuthManager authManager, CurrencyDao currencyDao, com.robinhood.models.dao.CurrencyDao currencyRhRoomDao, CurrencyPairDao currencyPairDao, com.robinhood.models.dao.CurrencyPairDao currencyPairRhRoomDao, NummusApi nummus2) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(currencyRhRoomDao, "currencyRhRoomDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(currencyPairRhRoomDao, "currencyPairRhRoomDao");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        this.authManager = authManager;
        this.currencyDao = currencyDao;
        this.currencyRhRoomDao = currencyRhRoomDao;
        this.currencyPairDao = currencyPairDao;
        this.currencyPairRhRoomDao = currencyPairRhRoomDao;
        this.nummus = nummus2;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        CurrencyPair.Companion companion2 = CurrencyPair.INSTANCE;
        Endpoint<UUID, ApiCurrencyPair> endpointCreate = companion.create(new CurrencyPairV2Store2(this, null), logoutKillswitch, new CurrencyPairV2Store3(this, null), clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getCurrencyPairEndpoint = endpointCreate;
        Query.Companion companion3 = Query.INSTANCE;
        this.getCurrencyPairQuery = Store.create$default(this, companion3, "getCurrencyPairQuery", CollectionsKt.listOf(new RefreshEach(new CurrencyPairV2Store4(endpointCreate))), new CurrencyPairV2Store5(currencyPairDao), false, 8, null);
        this.getCurrencyPairsEndpoint = PaginatedEndpoint.INSTANCE.create(new CurrencyPairV2Store6(this, null), getLogoutKillswitch(), new CurrencyPairV2Store7(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getCurrencyPairsQuery = Store.create$default(this, companion3, "getCurrencyPairsQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyPairV2Store.getCurrencyPairsQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyPairV2Store.getCurrencyPairsQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    public final Observable<UiCurrencyPair> streamCurrencyPair(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.getCurrencyPairQuery.asObservable(id);
    }

    public final Flow<UiCurrencyPair> streamCurrencyPairFlow(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.getCurrencyPairQuery.asFlow(id);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isTokenizedStock(UUID uuid, Continuation<? super Boolean> continuation) {
        C337911 c337911;
        if (continuation instanceof C337911) {
            c337911 = (C337911) continuation;
            int i = c337911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337911.label = i - Integer.MIN_VALUE;
            } else {
                c337911 = new C337911(continuation);
            }
        }
        Object objFirst = c337911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c337911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<UiCurrencyPair> flowAsFlow = this.getCurrencyPairQuery.asFlow(uuid);
            c337911.label = 1;
            objFirst = FlowKt.first(flowAsFlow, c337911);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return boxing.boxBoolean(((UiCurrencyPair) objFirst).isTokenizedStock());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getCurrencyPairsQuery$lambda$0(CurrencyPairV2Store currencyPairV2Store, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default(currencyPairV2Store.getCurrencyPairsEndpoint, Unit.INSTANCE, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCurrencyPairsQuery$lambda$1(CurrencyPairV2Store currencyPairV2Store, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return currencyPairV2Store.currencyPairDao.getCurrencyPairs();
    }

    public final Observable<List<UiCurrencyPair>> streamCurrencyPairs() {
        return this.getCurrencyPairsQuery.asObservable(Unit.INSTANCE);
    }

    public final Flow<List<UiCurrencyPair>> streamCachedCurrencyPairs() {
        return this.currencyPairDao.getCurrencyPairs();
    }

    public final Job refreshAll(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.getCurrencyPairsEndpoint, force);
    }

    public final Observable<Optional<Currency>> streamCurrencyOptional(final String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        final Flow<Currency> currency = this.currencyDao.getCurrency(currencyCode);
        Observable<Optional<Currency>> observableFlatMap = asObservable(new Flow<Optional<? extends Currency>>() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyOptional$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Currency>> flowCollector, Continuation continuation) {
                Object objCollect = currency.collect(new C337902(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyOptional$$inlined$map$1$2 */
            public static final class C337902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyOptional$$inlined$map$1$2", m3645f = "CurrencyPairV2Store.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyOptional$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C337902.this.emit(null, this);
                    }
                }

                public C337902(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((Currency) obj);
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
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store.streamCurrencyOptional.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Currency>> apply(Optional<Currency> currency2) {
                Intrinsics.checkNotNullParameter(currency2, "currency");
                if (currency2 instanceof Optional2) {
                    Observable<List<UiCurrencyPair>> observableStreamCurrencyPairs = CurrencyPairV2Store.this.streamCurrencyPairs();
                    final String str = currencyCode;
                    return observableStreamCurrencyPairs.map(new Function() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store.streamCurrencyOptional.2.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<Currency> apply(List<UiCurrencyPair> pairs) {
                            T next;
                            T next2;
                            Intrinsics.checkNotNullParameter(pairs, "pairs");
                            List<UiCurrencyPair> list = pairs;
                            String str2 = str;
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                if (Intrinsics.areEqual(((UiCurrencyPair) next).getQuoteCurrency().getCode(), str2)) {
                                    break;
                                }
                            }
                            UiCurrencyPair uiCurrencyPair = next;
                            Currency quoteCurrency = uiCurrencyPair != null ? uiCurrencyPair.getQuoteCurrency() : null;
                            String str3 = str;
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it2.next();
                                if (Intrinsics.areEqual(((UiCurrencyPair) next2).getAssetCurrency().getCode(), str3)) {
                                    break;
                                }
                            }
                            UiCurrencyPair uiCurrencyPair2 = next2;
                            Currency assetCurrency = uiCurrencyPair2 != null ? uiCurrencyPair2.getAssetCurrency() : null;
                            if (quoteCurrency == null) {
                                quoteCurrency = assetCurrency;
                            }
                            return Optional3.asOptional(quoteCurrency);
                        }
                    });
                }
                return Observable.just(currency2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public final Observable<Optional<Currency>> streamCurrencyByIdOptional(final UUID currencyId) {
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        final Flow<Currency> currency = this.currencyDao.getCurrency(currencyId);
        Observable<Optional<Currency>> observableFlatMap = asObservable(new Flow<Optional<? extends Currency>>() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyByIdOptional$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Currency>> flowCollector, Continuation continuation) {
                Object objCollect = currency.collect(new C337892(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyByIdOptional$$inlined$map$1$2 */
            public static final class C337892<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyByIdOptional$$inlined$map$1$2", m3645f = "CurrencyPairV2Store.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$streamCurrencyByIdOptional$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C337892.this.emit(null, this);
                    }
                }

                public C337892(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((Currency) obj);
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
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store.streamCurrencyByIdOptional.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Currency>> apply(Optional<Currency> currency2) {
                Intrinsics.checkNotNullParameter(currency2, "currency");
                if (currency2 instanceof Optional2) {
                    Observable<List<UiCurrencyPair>> observableStreamCurrencyPairs = CurrencyPairV2Store.this.streamCurrencyPairs();
                    final UUID uuid = currencyId;
                    return observableStreamCurrencyPairs.map(new Function() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairV2Store.streamCurrencyByIdOptional.2.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<Currency> apply(List<UiCurrencyPair> pairs) {
                            T next;
                            T next2;
                            Intrinsics.checkNotNullParameter(pairs, "pairs");
                            List<UiCurrencyPair> list = pairs;
                            UUID uuid2 = uuid;
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                if (Intrinsics.areEqual(((UiCurrencyPair) next).getQuoteCurrency().getId(), uuid2)) {
                                    break;
                                }
                            }
                            UiCurrencyPair uiCurrencyPair = next;
                            Currency quoteCurrency = uiCurrencyPair != null ? uiCurrencyPair.getQuoteCurrency() : null;
                            UUID uuid3 = uuid;
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it2.next();
                                if (Intrinsics.areEqual(((UiCurrencyPair) next2).getAssetCurrency().getId(), uuid3)) {
                                    break;
                                }
                            }
                            UiCurrencyPair uiCurrencyPair2 = next2;
                            Currency assetCurrency = uiCurrencyPair2 != null ? uiCurrencyPair2.getAssetCurrency() : null;
                            if (quoteCurrency == null) {
                                quoteCurrency = assetCurrency;
                            }
                            return Optional3.asOptional(quoteCurrency);
                        }
                    });
                }
                return Observable.just(currency2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }
}
