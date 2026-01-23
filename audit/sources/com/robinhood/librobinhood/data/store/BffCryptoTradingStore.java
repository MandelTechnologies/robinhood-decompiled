package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.CryptoDetailPageStateDto;
import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateLoggedOutResponseDto;
import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateResponseDto;
import bff_crypto_trading.service.p018v1.GetCryptoI18NRegionsResponseDto;
import bff_crypto_trading.service.p018v1.GetCryptoTokenizedStocksOrderEntryConfigRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoTokenizedStocksOrderEntryConfigResponseDto;
import bff_crypto_trading.service.p018v1.GetWatchlistExplainerRequestDto;
import bff_crypto_trading.service.p018v1.GetWatchlistExplainerResponseDto;
import bff_crypto_trading.service.p018v1.PostRHWTokenRequestDto;
import bff_crypto_trading.service.p018v1.PostRHWTokenResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.idl.Response;
import com.robinhood.rosetta.i18n.LocalityDto;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.models.idl.p390ui.UiIdlCacheEntry;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.idl.IdlKeyValueStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BffCryptoTradingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 42\u00020\u0001:\u000234B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013J\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020$H\u0086@¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0086@¢\u0006\u0002\u0010)J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001f2\u0006\u0010\"\u001a\u00020\u0017J\u0010\u0010/\u001a\u0004\u0018\u00010-2\u0006\u0010\"\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "bffCryptoTradingApi", "Lbff_crypto_trading/service/v1/BffCryptoTradingService;", "idlKeyValueStore", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/security/auth/AuthManager;Lbff_crypto_trading/service/v1/BffCryptoTradingService;Lcom/robinhood/shared/store/idl/IdlKeyValueStore;)V", "getCryptoRegionsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "getCryptoRegions", "Lio/reactivex/Single;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "cdpStateEndpoint", "Ljava/util/UUID;", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateResponseDto;", "cdpQuery", "Lcom/robinhood/android/moria/db/Query;", "cdpStateLoggedOutEndpoint", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateLoggedOutResponseDto;", "cdpLoggedOutQuery", "getCryptoDetailPageState", "Lkotlinx/coroutines/flow/Flow;", "", "Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;", "currencyPairId", "cdpIdlCacheKey", "", "fetchWatchlistExplainer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRhwTokenForDeviceId", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenizedStockOrderConfigEndpoint", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigRequestDto;", "Lcom/robinhood/idl/Response;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "streamCryptoTokenizedStocksOrderEntryConfigResponse", "fetchCachedCryptoTokenizedStocksOrderEntryConfigResponse", "tokenizedStockConfigCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore$CachedValue;", "CachedValue", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BffCryptoTradingStore extends Store {
    private static final long CACHE_TTL_MILLIS = 10000;
    private final AppType appType;
    private final AuthManager authManager;
    private final BffCryptoTradingService bffCryptoTradingApi;
    private final Query<UUID, GetCryptoDetailPageStateLoggedOutResponseDto> cdpLoggedOutQuery;
    private final Query<UUID, GetCryptoDetailPageStateResponseDto> cdpQuery;
    private final Endpoint<UUID, GetCryptoDetailPageStateResponseDto> cdpStateEndpoint;
    private final Endpoint<UUID, GetCryptoDetailPageStateLoggedOutResponseDto> cdpStateLoggedOutEndpoint;
    private final Endpoint<Unit, GetCryptoI18NRegionsResponseDto> getCryptoRegionsEndpoint;
    private final Endpoint<GetCryptoTokenizedStocksOrderEntryConfigRequestDto, Response<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> getTokenizedStockOrderConfigEndpoint;
    private final IdlKeyValueStore idlKeyValueStore;
    private final ConcurrentHashMap<UUID, CachedValue<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> tokenizedStockConfigCache;

    /* compiled from: BffCryptoTradingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore", m3645f = "BffCryptoTradingStore.kt", m3646l = {136}, m3647m = "fetchRhwTokenForDeviceId")
    /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$fetchRhwTokenForDeviceId$1 */
    static final class C336201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336201(Continuation<? super C336201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BffCryptoTradingStore.this.fetchRhwTokenForDeviceId(null, this);
        }
    }

    /* compiled from: BffCryptoTradingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore", m3645f = "BffCryptoTradingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "fetchWatchlistExplainer")
    /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$fetchWatchlistExplainer$1 */
    static final class C336211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336211(Continuation<? super C336211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BffCryptoTradingStore.this.fetchWatchlistExplainer(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BffCryptoTradingStore(StoreBundle storeBundle, AppType appType, AuthManager authManager, BffCryptoTradingService bffCryptoTradingApi, IdlKeyValueStore idlKeyValueStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(bffCryptoTradingApi, "bffCryptoTradingApi");
        Intrinsics.checkNotNullParameter(idlKeyValueStore, "idlKeyValueStore");
        this.appType = appType;
        this.authManager = authManager;
        this.bffCryptoTradingApi = bffCryptoTradingApi;
        this.idlKeyValueStore = idlKeyValueStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getCryptoRegionsEndpoint = Endpoint.Companion.create$default(companion, new BffCryptoTradingStore$getCryptoRegionsEndpoint$1(this, null), getLogoutKillswitch(), new BffCryptoTradingStore$getCryptoRegionsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        Endpoint<UUID, GetCryptoDetailPageStateResponseDto> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new BffCryptoTradingStore$cdpStateEndpoint$1(this, null), getLogoutKillswitch(), new BffCryptoTradingStore$cdpStateEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.cdpStateEndpoint = endpointCreateWithParams$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.cdpQuery = Store.create$default(this, companion2, "cdpQuery", CollectionsKt.listOf(new RefreshEach(new BffCryptoTradingStore$cdpQuery$1(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BffCryptoTradingStore.cdpQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        Endpoint<UUID, GetCryptoDetailPageStateLoggedOutResponseDto> endpointCreateWithParams$default2 = Endpoint.Companion.createWithParams$default(companion, new BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1(this, null), getLogoutKillswitch(), new BffCryptoTradingStore$cdpStateLoggedOutEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.cdpStateLoggedOutEndpoint = endpointCreateWithParams$default2;
        this.cdpLoggedOutQuery = Store.create$default(this, companion2, "cdpQuery", CollectionsKt.listOf(new RefreshEach(new BffCryptoTradingStore$cdpLoggedOutQuery$1(endpointCreateWithParams$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BffCryptoTradingStore.cdpLoggedOutQuery$lambda$4(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.getTokenizedStockOrderConfigEndpoint = Endpoint.Companion.create$default(companion, new BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1(this, null), getLogoutKillswitch(), new BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.tokenizedStockConfigCache = new ConcurrentHashMap<>();
    }

    /* compiled from: BffCryptoTradingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoRegions$1", m3645f = "BffCryptoTradingStore.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoRegions$1 */
    static final class C336221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super GetCryptoI18NRegionsResponseDto>, Object> {
        int label;

        C336221(Continuation<? super C336221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BffCryptoTradingStore.this.new C336221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetCryptoI18NRegionsResponseDto> continuation) {
            return ((C336221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint endpoint = BffCryptoTradingStore.this.getCryptoRegionsEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ImmutableList<LocalityDto>> getCryptoRegions() {
        Single<ImmutableList<LocalityDto>> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C336221(null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore.getCryptoRegions.2
            @Override // io.reactivex.functions.Function
            public final ImmutableList<LocalityDto> apply(GetCryptoI18NRegionsResponseDto response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return extensions2.toImmutableList(response.getResults());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cdpQuery$lambda$1(BffCryptoTradingStore bffCryptoTradingStore, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow flowStream = bffCryptoTradingStore.idlKeyValueStore.stream(bffCryptoTradingStore.cdpIdlCacheKey(currencyPairId), Reflection.getOrCreateKotlinClass(GetCryptoDetailPageStateResponseDto.class));
        return new Flow<GetCryptoDetailPageStateResponseDto>() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpQuery$lambda$1$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpQuery$lambda$1$$inlined$map$1$2 */
            public static final class C336162<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpQuery$lambda$1$$inlined$map$1$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpQuery$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336162.this.emit(null, this);
                    }
                }

                public C336162(FlowCollector flowCollector) {
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        GetCryptoDetailPageStateResponseDto getCryptoDetailPageStateResponseDto = uiIdlCacheEntry != null ? (GetCryptoDetailPageStateResponseDto) uiIdlCacheEntry.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getCryptoDetailPageStateResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetCryptoDetailPageStateResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStream.collect(new C336162(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cdpLoggedOutQuery$lambda$4(BffCryptoTradingStore bffCryptoTradingStore, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow flowStream = bffCryptoTradingStore.idlKeyValueStore.stream(bffCryptoTradingStore.cdpIdlCacheKey(currencyPairId), Reflection.getOrCreateKotlinClass(GetCryptoDetailPageStateLoggedOutResponseDto.class));
        return new Flow<GetCryptoDetailPageStateLoggedOutResponseDto>() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpLoggedOutQuery$lambda$4$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GetCryptoDetailPageStateLoggedOutResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStream.collect(new C336152(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpLoggedOutQuery$lambda$4$$inlined$map$1$2 */
            public static final class C336152<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpLoggedOutQuery$lambda$4$$inlined$map$1$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpLoggedOutQuery$lambda$4$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336152.this.emit(null, this);
                    }
                }

                public C336152(FlowCollector flowCollector) {
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        GetCryptoDetailPageStateLoggedOutResponseDto getCryptoDetailPageStateLoggedOutResponseDto = uiIdlCacheEntry != null ? (GetCryptoDetailPageStateLoggedOutResponseDto) uiIdlCacheEntry.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getCryptoDetailPageStateLoggedOutResponseDto, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<List<CryptoDetailPageStateDto>> getCryptoDetailPageState(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        if (this.authManager.isLoggedIn()) {
            final Flow<GetCryptoDetailPageStateResponseDto> flowAsFlow = this.cdpQuery.asFlow(currencyPairId);
            return new Flow<List<? extends CryptoDetailPageStateDto>>() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends CryptoDetailPageStateDto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new C336172(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$1$2 */
                public static final class C336172<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$1$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C336172.this.emit(null, this);
                        }
                    }

                    public C336172(FlowCollector flowCollector) {
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
                            List<CryptoDetailPageStateDto> ordering = ((GetCryptoDetailPageStateResponseDto) obj).getOrdering();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(ordering, anonymousClass1) == coroutine_suspended) {
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
        final Flow<GetCryptoDetailPageStateLoggedOutResponseDto> flowAsFlow2 = this.cdpLoggedOutQuery.asFlow(currencyPairId);
        return new Flow<List<? extends CryptoDetailPageStateDto>>() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends CryptoDetailPageStateDto>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow2.collect(new C336182(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$2$2 */
            public static final class C336182<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$2$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoDetailPageState$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C336182.this.emit(null, this);
                    }
                }

                public C336182(FlowCollector flowCollector) {
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
                        List<CryptoDetailPageStateDto> ordering = ((GetCryptoDetailPageStateLoggedOutResponseDto) obj).getOrdering();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(ordering, anonymousClass1) == coroutine_suspended) {
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

    public final String cdpIdlCacheKey(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        if (this.authManager.isLoggedIn()) {
            return "cdp_state_" + currencyPairId;
        }
        return "cdp_state_" + this.appType.toRegionCode().getServerValue() + "_unauth_" + currencyPairId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWatchlistExplainer(Continuation<? super String> continuation) {
        C336211 c336211;
        if (continuation instanceof C336211) {
            c336211 = (C336211) continuation;
            int i = c336211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336211.label = i - Integer.MIN_VALUE;
            } else {
                c336211 = new C336211(continuation);
            }
        }
        Object objGetWatchlistExplainer = c336211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetWatchlistExplainer);
            BffCryptoTradingService bffCryptoTradingService = this.bffCryptoTradingApi;
            GetWatchlistExplainerRequestDto getWatchlistExplainerRequestDto = new GetWatchlistExplainerRequestDto();
            c336211.label = 1;
            objGetWatchlistExplainer = bffCryptoTradingService.GetWatchlistExplainer(getWatchlistExplainerRequestDto, c336211);
            if (objGetWatchlistExplainer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetWatchlistExplainer);
        }
        return ((GetWatchlistExplainerResponseDto) objGetWatchlistExplainer).getContentful_id();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchRhwTokenForDeviceId(String str, Continuation<? super String> continuation) {
        C336201 c336201;
        if (continuation instanceof C336201) {
            c336201 = (C336201) continuation;
            int i = c336201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336201.label = i - Integer.MIN_VALUE;
            } else {
                c336201 = new C336201(continuation);
            }
        }
        Object objPostRHWToken = c336201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostRHWToken);
            BffCryptoTradingService bffCryptoTradingService = this.bffCryptoTradingApi;
            PostRHWTokenRequestDto postRHWTokenRequestDto = new PostRHWTokenRequestDto(str);
            c336201.label = 1;
            objPostRHWToken = bffCryptoTradingService.PostRHWToken(postRHWTokenRequestDto, c336201);
            if (objPostRHWToken == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostRHWToken);
        }
        return ((PostRHWTokenResponseDto) objPostRHWToken).getToken();
    }

    public final Flow<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> streamCryptoTokenizedStocksOrderEntryConfigResponse(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Endpoint<GetCryptoTokenizedStocksOrderEntryConfigRequestDto, Response<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> endpoint = this.getTokenizedStockOrderConfigEndpoint;
        String string2 = currencyPairId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        final Flow flowBackendPoll$default = IdlBackendPolling.backendPoll$default(endpoint, new GetCryptoTokenizedStocksOrderEntryConfigRequestDto(string2), null, null, 6, null);
        return FlowKt.onStart(FlowKt.onEach(new Flow<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>() { // from class: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GetCryptoTokenizedStocksOrderEntryConfigResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowBackendPoll$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$$inlined$map$1$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$$inlined$map$1$2$1, reason: invalid class name */
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
                        Object data = ((Response) obj).getData();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(data, anonymousClass1) == coroutine_suspended) {
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
        }, new C336242(currencyPairId, null)), new C336253(currencyPairId, null));
    }

    /* compiled from: BffCryptoTradingStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$2 */
    static final class C336242 extends ContinuationImpl7 implements Function2<GetCryptoTokenizedStocksOrderEntryConfigResponseDto, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336242(UUID uuid, Continuation<? super C336242> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336242 c336242 = BffCryptoTradingStore.this.new C336242(this.$currencyPairId, continuation);
            c336242.L$0 = obj;
            return c336242;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GetCryptoTokenizedStocksOrderEntryConfigResponseDto getCryptoTokenizedStocksOrderEntryConfigResponseDto, Continuation<? super Unit> continuation) {
            return ((C336242) create(getCryptoTokenizedStocksOrderEntryConfigResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BffCryptoTradingStore.this.tokenizedStockConfigCache.put(this.$currencyPairId, new CachedValue((GetCryptoTokenizedStocksOrderEntryConfigResponseDto) this.L$0, 0L, 2, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: BffCryptoTradingStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$3", m3645f = "BffCryptoTradingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BffCryptoTradingStore$streamCryptoTokenizedStocksOrderEntryConfigResponse$3 */
    static final class C336253 extends ContinuationImpl7 implements Function2<FlowCollector<? super GetCryptoTokenizedStocksOrderEntryConfigResponseDto>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336253(UUID uuid, Continuation<? super C336253> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336253 c336253 = BffCryptoTradingStore.this.new C336253(this.$currencyPairId, continuation);
            c336253.L$0 = obj;
            return c336253;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super GetCryptoTokenizedStocksOrderEntryConfigResponseDto> flowCollector, Continuation<? super Unit> continuation) {
            return ((C336253) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CachedValue cachedValue = (CachedValue) BffCryptoTradingStore.this.tokenizedStockConfigCache.get(this.$currencyPairId);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (cachedValue == null || jCurrentTimeMillis - cachedValue.getTimestampMillis() > 10000) {
                    BffCryptoTradingStore.this.tokenizedStockConfigCache.remove(this.$currencyPairId);
                } else {
                    Object value = cachedValue.getValue();
                    this.label = 1;
                    if (flowCollector.emit(value, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final GetCryptoTokenizedStocksOrderEntryConfigResponseDto fetchCachedCryptoTokenizedStocksOrderEntryConfigResponse(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        CachedValue<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> cachedValue = this.tokenizedStockConfigCache.get(currencyPairId);
        if (cachedValue != null) {
            return cachedValue.getValue();
        }
        return null;
    }

    /* compiled from: BffCryptoTradingStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore$CachedValue;", "T", "", "value", "timestampMillis", "", "<init>", "(Ljava/lang/Object;J)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTimestampMillis", "()J", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore$CachedValue;", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class CachedValue<T> {
        private final long timestampMillis;
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CachedValue copy$default(CachedValue cachedValue, Object obj, long j, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = cachedValue.value;
            }
            if ((i & 2) != 0) {
                j = cachedValue.timestampMillis;
            }
            return cachedValue.copy(obj, j);
        }

        public final T component1() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampMillis() {
            return this.timestampMillis;
        }

        public final CachedValue<T> copy(T value, long timestampMillis) {
            return new CachedValue<>(value, timestampMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedValue)) {
                return false;
            }
            CachedValue cachedValue = (CachedValue) other;
            return Intrinsics.areEqual(this.value, cachedValue.value) && this.timestampMillis == cachedValue.timestampMillis;
        }

        public int hashCode() {
            T t = this.value;
            return ((t == null ? 0 : t.hashCode()) * 31) + Long.hashCode(this.timestampMillis);
        }

        public String toString() {
            return "CachedValue(value=" + this.value + ", timestampMillis=" + this.timestampMillis + ")";
        }

        public CachedValue(T t, long j) {
            this.value = t;
            this.timestampMillis = j;
        }

        public final T getValue() {
            return this.value;
        }

        public /* synthetic */ CachedValue(Object obj, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? System.currentTimeMillis() : j);
        }

        public final long getTimestampMillis() {
            return this.timestampMillis;
        }
    }
}
