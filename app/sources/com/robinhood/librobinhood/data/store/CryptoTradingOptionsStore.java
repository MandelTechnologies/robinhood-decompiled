package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.ApiCryptoTradingOptions;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.dao.CryptoTradingOptionsDao;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Clock;

/* compiled from: CryptoTradingOptionsStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001!B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJE\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "Lcom/robinhood/store/Store;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoTradingOptionsDao", "Lcom/robinhood/models/crypto/dao/CryptoTradingOptionsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/models/crypto/dao/CryptoTradingOptionsDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore$TradingOptionsRequest;", "Lcom/robinhood/models/api/ApiCryptoTradingOptions;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "streamTradingOptions", "Lkotlinx/coroutines/flow/Flow;", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "assetType", "Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "", "limit", "", "(Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;Lcom/robinhood/models/api/trading/CryptoTradingAssetType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;Ljava/lang/String;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "TradingOptionsRequest", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoTradingOptionsStore extends Store {
    private final AppType appType;
    private final AuthManager authManager;
    private final CryptoBonfireApi cryptoBonfireApi;
    private final CryptoTradingOptionsDao cryptoTradingOptionsDao;
    private final Endpoint<TradingOptionsRequest, ApiCryptoTradingOptions> endpoint;
    private final Query<TradingOptionsRequest, CryptoTradingOptions> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTradingOptionsStore(AppType appType, AuthManager authManager, CryptoBonfireApi cryptoBonfireApi, CryptoTradingOptionsDao cryptoTradingOptionsDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsDao, "cryptoTradingOptionsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.appType = appType;
        this.authManager = authManager;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoTradingOptionsDao = cryptoTradingOptionsDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Clock clock = storeBundle.getClock();
        DefaultStaleDecider defaultStaleDecider = new DefaultStaleDecider(CryptoTradingOptions.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock());
        Endpoint<TradingOptionsRequest, ApiCryptoTradingOptions> endpointCreate = companion.create(new CryptoTradingOptionsStore2(this, null), getLogoutKillswitch(), new CryptoTradingOptionsStore3(this, null), clock, defaultStaleDecider);
        this.endpoint = endpointCreate;
        this.query = Store.create$default(this, Query.INSTANCE, "streamTradingOptions", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoTradingOptionsStore4(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTradingOptionsStore.query$lambda$0(this.f$0, (CryptoTradingOptionsStore.TradingOptionsRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(CryptoTradingOptionsStore cryptoTradingOptionsStore, TradingOptionsRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoTradingOptionsStore.cryptoTradingOptionsDao.get(it.getLocation(), it.getAssetType(), it.getCategoryServerName());
    }

    public static /* synthetic */ Flow streamTradingOptions$default(CryptoTradingOptionsStore cryptoTradingOptionsStore, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, CryptoTradingAssetType cryptoTradingAssetType, CryptoTradingOptionsCategory cryptoTradingOptionsCategory, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            cryptoTradingAssetType = CryptoTradingAssetType.CRYPTO;
        }
        CryptoTradingAssetType cryptoTradingAssetType2 = cryptoTradingAssetType;
        if ((i & 4) != 0) {
            cryptoTradingOptionsCategory = CryptoTradingOptionsCategory.INSTANCE.getDEFAULT();
        }
        return cryptoTradingOptionsStore.streamTradingOptions(cryptoTradingOptionsLocation, cryptoTradingAssetType2, cryptoTradingOptionsCategory, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num);
    }

    public final Flow<CryptoTradingOptions> streamTradingOptions(CryptoTradingOptionsLocation location, CryptoTradingAssetType assetType, CryptoTradingOptionsCategory category, String query, Integer limit) {
        TradingOptionsRequest tradingOptionsRequest;
        String serverName;
        CryptoTradingOptionsLocation cryptoTradingOptionsLocation;
        CryptoTradingAssetType cryptoTradingAssetType;
        String str;
        Integer num;
        String str2;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(category, "category");
        if (location == CryptoTradingOptionsLocation.COIN_LIST && Intrinsics.areEqual(category, CryptoTradingOptionsCategory.INSTANCE.getDEFAULT())) {
            serverName = "market_cap";
        } else {
            if (Intrinsics.areEqual(category, CryptoTradingOptionsCategory.INSTANCE.getDEFAULT())) {
                cryptoTradingOptionsLocation = location;
                cryptoTradingAssetType = assetType;
                str = query;
                num = limit;
                str2 = null;
                tradingOptionsRequest = new TradingOptionsRequest(cryptoTradingAssetType, cryptoTradingOptionsLocation, str2, str, num);
                if (str != null || (str.length() == 0 && Intrinsics.areEqual(category, CryptoTradingOptionsCategory.INSTANCE.getDEFAULT()) && cryptoTradingOptionsLocation == CryptoTradingOptionsLocation.DISCOVER_COINS)) {
                    return this.query.asFlow(tradingOptionsRequest);
                }
                final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.endpoint, tradingOptionsRequest, null, new C337631(null), 2, null);
                return new Flow<CryptoTradingOptions>() { // from class: com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$streamTradingOptions$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoTradingOptions> flowCollector, Continuation continuation) {
                        Object objCollect = flowPoll$default.collect(new C337622(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$streamTradingOptions$$inlined$map$1$2 */
                    public static final class C337622<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$streamTradingOptions$$inlined$map$1$2", m3645f = "CryptoTradingOptionsStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$streamTradingOptions$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C337622.this.emit(null, this);
                            }
                        }

                        public C337622(FlowCollector flowCollector) {
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
                                CryptoTradingOptions dbModel = CryptoTradingOptions2.getDbModel((ApiCryptoTradingOptions) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
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
            serverName = category.getServerName();
        }
        cryptoTradingOptionsLocation = location;
        cryptoTradingAssetType = assetType;
        str = query;
        num = limit;
        str2 = serverName;
        tradingOptionsRequest = new TradingOptionsRequest(cryptoTradingAssetType, cryptoTradingOptionsLocation, str2, str, num);
        if (str != null) {
        }
        return this.query.asFlow(tradingOptionsRequest);
    }

    /* compiled from: CryptoTradingOptionsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore$TradingOptionsRequest;", "Lcom/robinhood/models/api/ApiCryptoTradingOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$streamTradingOptions$1", m3645f = "CryptoTradingOptionsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$streamTradingOptions$1 */
    static final class C337631 extends ContinuationImpl7 implements Function3<TradingOptionsRequest, ApiCryptoTradingOptions, Continuation<? super Unit>, Object> {
        int label;

        C337631(Continuation<? super C337631> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(TradingOptionsRequest tradingOptionsRequest, ApiCryptoTradingOptions apiCryptoTradingOptions, Continuation<? super Unit> continuation) {
            return new C337631(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTradingOptionsStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore$TradingOptionsRequest;", "", "assetType", "Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "categoryServerName", "", "query", "limit", "", "<init>", "(Lcom/robinhood/models/api/trading/CryptoTradingAssetType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAssetType", "()Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "getLocation", "()Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "getCategoryServerName", "()Ljava/lang/String;", "getQuery", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/models/api/trading/CryptoTradingAssetType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore$TradingOptionsRequest;", "equals", "", "other", "hashCode", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TradingOptionsRequest {
        private final CryptoTradingAssetType assetType;
        private final String categoryServerName;
        private final Integer limit;
        private final CryptoTradingOptionsLocation location;
        private final String query;

        public static /* synthetic */ TradingOptionsRequest copy$default(TradingOptionsRequest tradingOptionsRequest, CryptoTradingAssetType cryptoTradingAssetType, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoTradingAssetType = tradingOptionsRequest.assetType;
            }
            if ((i & 2) != 0) {
                cryptoTradingOptionsLocation = tradingOptionsRequest.location;
            }
            if ((i & 4) != 0) {
                str = tradingOptionsRequest.categoryServerName;
            }
            if ((i & 8) != 0) {
                str2 = tradingOptionsRequest.query;
            }
            if ((i & 16) != 0) {
                num = tradingOptionsRequest.limit;
            }
            Integer num2 = num;
            String str3 = str;
            return tradingOptionsRequest.copy(cryptoTradingAssetType, cryptoTradingOptionsLocation, str3, str2, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTradingAssetType getAssetType() {
            return this.assetType;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTradingOptionsLocation getLocation() {
            return this.location;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCategoryServerName() {
            return this.categoryServerName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getLimit() {
            return this.limit;
        }

        public final TradingOptionsRequest copy(CryptoTradingAssetType assetType, CryptoTradingOptionsLocation location, String categoryServerName, String query, Integer limit) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new TradingOptionsRequest(assetType, location, categoryServerName, query, limit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradingOptionsRequest)) {
                return false;
            }
            TradingOptionsRequest tradingOptionsRequest = (TradingOptionsRequest) other;
            return this.assetType == tradingOptionsRequest.assetType && this.location == tradingOptionsRequest.location && Intrinsics.areEqual(this.categoryServerName, tradingOptionsRequest.categoryServerName) && Intrinsics.areEqual(this.query, tradingOptionsRequest.query) && Intrinsics.areEqual(this.limit, tradingOptionsRequest.limit);
        }

        public int hashCode() {
            int iHashCode = ((this.assetType.hashCode() * 31) + this.location.hashCode()) * 31;
            String str = this.categoryServerName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.query;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.limit;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "TradingOptionsRequest(assetType=" + this.assetType + ", location=" + this.location + ", categoryServerName=" + this.categoryServerName + ", query=" + this.query + ", limit=" + this.limit + ")";
        }

        public TradingOptionsRequest(CryptoTradingAssetType assetType, CryptoTradingOptionsLocation location, String str, String str2, Integer num) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(location, "location");
            this.assetType = assetType;
            this.location = location;
            this.categoryServerName = str;
            this.query = str2;
            this.limit = num;
        }

        public final CryptoTradingAssetType getAssetType() {
            return this.assetType;
        }

        public final CryptoTradingOptionsLocation getLocation() {
            return this.location;
        }

        public final String getCategoryServerName() {
            return this.categoryServerName;
        }

        public final String getQuery() {
            return this.query;
        }

        public final Integer getLimit() {
            return this.limit;
        }
    }
}
